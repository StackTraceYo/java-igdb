package org.stacktrace.yo.igdb.client.collection;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.common.PostFix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class CollectionRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void collectionRequestUrlWithFields() throws Exception {
        CollectionRequest charcterRequest = new CollectionRequest(client)
                .withFields(
                        CollectionFields.CREATED_AT,
                        CollectionFields.GAMES
                );
        assertThat(charcterRequest.buildUrl(), is("collections/?fields=created_at,games"));
    }

    @Test
    public void collectionRequestUrlWithSearchAndFields() throws Exception {
        CollectionRequest charcterRequest = new CollectionRequest(client)
                .withFields(
                        CollectionFields.CREATED_AT,
                        CollectionFields.GAMES
                )
                .withSearch("Test");
        assertThat(charcterRequest.buildUrl(), is("collections/?search=Test&fields=created_at,games"));
    }

    @Test
    public void collectionRequestUrlWithSearchAndFieldsAndFilters() throws Exception {
        CollectionRequest charcterRequest = new CollectionRequest(client)
                .withFields(
                        CollectionFields.CREATED_AT,
                        CollectionFields.GAMES
                )
                .withSearch("Test")
                .addFilter(new CollectionFilter()
                        .filter(CollectionFields.ID)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new CollectionFilter()
                        .filter(CollectionFields.GAMES)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(charcterRequest.buildUrl(), is("collections/?search=Test&fields=created_at,games&filter=[id][gt]=89&filter=[games][lt]=100"));
    }

}