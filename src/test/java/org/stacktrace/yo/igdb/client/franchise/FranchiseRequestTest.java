package org.stacktrace.yo.igdb.client.franchise;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.common.PostFix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class FranchiseRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void franchiseRequestUrlWithFields() throws Exception {
        FranchiseRequest charcterRequest = new FranchiseRequest(client)
                .withFields(
                        FranchiseFields.CREATED_AT,
                        FranchiseFields.GAMES
                );
        assertThat(charcterRequest.buildUrl(), is("franchises/?fields=created_at,games"));
    }

    @Test
    public void franchiseRequestUrlWithSearchAndFields() throws Exception {
        FranchiseRequest charcterRequest = new FranchiseRequest(client)
                .withFields(
                        FranchiseFields.CREATED_AT,
                        FranchiseFields.GAMES
                )
                .withSearch("Test");
        assertThat(charcterRequest.buildUrl(), is("franchises/?search=Test&fields=created_at,games"));
    }

    @Test
    public void franchiseRequestUrlWithSearchAndFieldsAndFilters() throws Exception {
        FranchiseRequest charcterRequest = new FranchiseRequest(client)
                .withFields(
                        FranchiseFields.CREATED_AT,
                        FranchiseFields.GAMES
                )
                .withSearch("Test")
                .addFilter(new FranchiseFilter()
                        .filter(FranchiseFields.ID)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new FranchiseFilter()
                        .filter(FranchiseFields.GAMES)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(charcterRequest.buildUrl(), is("franchises/?search=Test&fields=created_at,games&filter=[id][gt]=89&filter=[games][lt]=100"));
    }

}