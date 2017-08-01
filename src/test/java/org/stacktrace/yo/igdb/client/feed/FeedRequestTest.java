package org.stacktrace.yo.igdb.client.feed;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.common.PostFix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class FeedRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void feedRequestUrlWithFields() throws Exception {
        FeedRequest charcterRequest = new FeedRequest(client)
                .withFields(
                        FeedFields.CREATED_AT,
                        FeedFields.GAMES
                );
        assertThat(charcterRequest.buildUrl(), is("feeds/?fields=created_at,games"));
    }

    @Test
    public void feedRequestUrlWithSearchAndFields() throws Exception {
        FeedRequest charcterRequest = new FeedRequest(client)
                .withFields(
                        FeedFields.CREATED_AT,
                        FeedFields.GAMES
                )
                .withSearch("Test");
        assertThat(charcterRequest.buildUrl(), is("feeds/?search=Test&fields=created_at,games"));
    }

    @Test
    public void feedRequestUrlWithSearchAndFieldsAndFilters() throws Exception {
        FeedRequest charcterRequest = new FeedRequest(client)
                .withFields(
                        FeedFields.CREATED_AT,
                        FeedFields.GAMES
                )
                .withSearch("Test")
                .addFilter(new FeedFilter()
                        .filter(FeedFields.ID)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new FeedFilter()
                        .filter(FeedFields.GAMES)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(charcterRequest.buildUrl(), is("feeds/?search=Test&fields=created_at,games&filter=[id][gt]=89&filter=[games][lt]=100"));
    }

}