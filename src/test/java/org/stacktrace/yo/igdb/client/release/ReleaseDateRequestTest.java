package org.stacktrace.yo.igdb.client.release;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.common.PostFix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class ReleaseDateRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void ReleaseDateRequestUrlWithFields() throws Exception {
        ReleaseDateRequest releaseDateRequest = new ReleaseDateRequest(client)
                .withFields(
                        ReleaseDateFields.CATEGORY,
                        ReleaseDateFields.GAME
                );
        assertThat(releaseDateRequest.buildUrl(), is("release_dates/?fields=category,game"));
    }

    @Test
    public void ReleaseDateRequestUrlWithSearchAndFields() throws Exception {
        ReleaseDateRequest releaseDateRequest = new ReleaseDateRequest(client)
                .withFields(
                        ReleaseDateFields.CATEGORY,
                        ReleaseDateFields.GAME
                )
                .withSearch("Test");
        assertThat(releaseDateRequest.buildUrl(), is("release_dates/?search=Test&fields=category,game"));
    }

    @Test
    public void ReleaseDateRequestUrlWithSearchAndFieldsAndFilters() throws Exception {
        ReleaseDateRequest releaseDateRequest = new ReleaseDateRequest(client)
                .withFields(
                        ReleaseDateFields.CATEGORY,
                        ReleaseDateFields.GAME
                )
                .withSearch("Test")
                .addFilter(new ReleaseDateFilter()
                        .filter(ReleaseDateFields.ID)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new ReleaseDateFilter()
                        .filter(ReleaseDateFields.GAME)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(releaseDateRequest.buildUrl(), is("release_dates/?search=Test&fields=category,game&filter=[id][gt]=89&filter=[game][lt]=100"));
    }

}