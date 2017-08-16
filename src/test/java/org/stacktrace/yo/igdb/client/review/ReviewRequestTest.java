package org.stacktrace.yo.igdb.client.review;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.common.PostFix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class ReviewRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void ReviewRequestUrlWithFields() throws Exception {
        ReviewRequest reviewRequest = new ReviewRequest(client)
                .withFields(
                        ReviewFields.CATEGORY,
                        ReviewFields.GAME
                );
        assertThat(reviewRequest.buildUrl(), is("reviews/?fields=category,game"));
    }

    @Test
    public void ReviewRequestUrlWithSearchAndFields() throws Exception {
        ReviewRequest reviewRequest = new ReviewRequest(client)
                .withFields(
                        ReviewFields.CATEGORY,
                        ReviewFields.GAME
                )
                .withSearch("Test");
        assertThat(reviewRequest.buildUrl(), is("reviews/?search=Test&fields=category,game"));
    }

    @Test
    public void ReviewRequestUrlWithSearchAndFieldsAndFilters() throws Exception {
        ReviewRequest reviewRequest = new ReviewRequest(client)
                .withFields(
                        ReviewFields.CATEGORY,
                        ReviewFields.GAME
                )
                .withSearch("Test")
                .addFilter(new ReviewFilter()
                        .filter(ReviewFields.ID)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new ReviewFilter()
                        .filter(ReviewFields.GAME)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(reviewRequest.buildUrl(), is("reviews/?search=Test&fields=category,game&filter=[id][gt]=89&filter=[game][lt]=100"));
    }

}