package org.stacktrace.yo.igdb.client.platform;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.common.PostFix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class PlatformRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void platformRequestUrlWithFields() throws Exception {
        PlatformRequest platformRequest = new PlatformRequest(client)
                .withFields(
                        PlatformFields.CREATED_AT,
                        PlatformFields.GAMES
                );
        assertThat(platformRequest.buildUrl(), is("platforms/?fields=created_at,games"));
    }

    @Test
    public void platformRequestUrlWithSearchAndFields() throws Exception {
        PlatformRequest platformRequest = new PlatformRequest(client)
                .withFields(
                        PlatformFields.CREATED_AT,
                        PlatformFields.GAMES
                )
                .withSearch("Test");
        assertThat(platformRequest.buildUrl(), is("platforms/?search=Test&fields=created_at,games"));
    }

    @Test
    public void platformRequestUrlWithSearchAndFieldsAndFilters() throws Exception {
        PlatformRequest platformRequest = new PlatformRequest(client)
                .withFields(
                        PlatformFields.CREATED_AT,
                        PlatformFields.GAMES
                )
                .withSearch("Test")
                .addFilter(new PlatformFilter()
                        .filter(PlatformFields.ID)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new PlatformFilter()
                        .filter(PlatformFields.GAMES)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(platformRequest.buildUrl(), is("platforms/?search=Test&fields=created_at,games&filter=[id][gt]=89&filter=[games][lt]=100"));
    }

}