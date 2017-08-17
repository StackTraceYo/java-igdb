package org.stacktrace.yo.igdb.client.company;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.collection.CollectionFields;
import org.stacktrace.yo.igdb.client.collection.CollectionFilter;
import org.stacktrace.yo.igdb.client.collection.CollectionRequest;
import org.stacktrace.yo.igdb.client.common.PostFix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class CompanyRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void companyRequestUrlWithFields() throws Exception {
        CompanyRequest charcterRequest = new CompanyRequest(client)
                .withFields(
                        CompanyFields.CREATED_AT,
                        CompanyFields.GAMES
                );
        assertThat(charcterRequest.buildUrl(), is("companies/?fields=created_at,games"));
    }

    @Test
    public void companyRequestUrlWithSearchAndFields() throws Exception {
        CompanyRequest charcterRequest = new CompanyRequest(client)
                .withFields(
                        CompanyFields.CREATED_AT,
                        CompanyFields.GAMES
                )
                .withSearch("Test");
        assertThat(charcterRequest.buildUrl(), is("companies/?search=Test&fields=created_at,games"));
    }

    @Test
    public void companyRequestUrlWithSearchAndFieldsAndFilters() throws Exception {
        CompanyRequest charcterRequest = new CompanyRequest(client)
                .withFields(
                        CompanyFields.CREATED_AT,
                        CompanyFields.GAMES
                )
                .withSearch("Electronic Arts")
                .addFilter(new CompanyFilter()
                        .filter(CompanyFields.ID)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new CompanyFilter()
                        .filter(CompanyFields.GAMES)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(charcterRequest.buildUrl(), is("companies/?search=Electronic Arts&fields=created_at,games&filter=[id][gt]=89&filter=[games][lt]=100"));
    }

}