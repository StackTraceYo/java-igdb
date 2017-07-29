package org.stacktrace.yo.igdb.client.game;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.PostFix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class GameRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void gameRequestUrlWithFields() throws Exception {
        GameRequest gameRequest = new GameRequest(client)
                .withFields(
                        GameFields.AGGREGATED_RATING_COUNT,
                        GameFields.ALTERNATIVE_NAMES,
                        GameFields.CATEGORY
                );
        assertThat(gameRequest.buildUrl(), is("games/?fields=aggregated_rating_count,alternative_names,category"));
    }

    @Test
    public void gameRequestUrlWithSearchAndFields() throws Exception {
        GameRequest gameRequest = new GameRequest(client)
                .withFields(
                        GameFields.AGGREGATED_RATING_COUNT,
                        GameFields.ALTERNATIVE_NAMES,
                        GameFields.CATEGORY
                )
                .withSearch("Test");
        assertThat(gameRequest.buildUrl(), is("games/?search=Test&fields=aggregated_rating_count,alternative_names,category"));
    }

    @Test
    public void gameRequestUrlWithSearchAndFieldsAndFilters() throws Exception {
        GameRequest gameRequest = new GameRequest(client)
                .withFields(
                        GameFields.AGGREGATED_RATING_COUNT,
                        GameFields.ALTERNATIVE_NAMES,
                        GameFields.CATEGORY
                )
                .withSearch("Test")
                .addFilter(GameFilter.getBuilder()
                        .filter(GameFields.CATEGORY)
                        .thatAre(PostFix.GREATER_THAN)
                        .valueOf("89"))
                .addFilter(GameFilter.getBuilder()
                        .filter(GameFields.AGGREGATED_RATING_COUNT)
                        .thatAre(PostFix.LESS_THAN)
                        .valueOf("100"));
        assertThat(gameRequest.buildUrl(), is("games/?search=Test&fields=aggregated_rating_count,alternative_names,category&filter=[category][gt]=89&filter=[aggregated_rating_count][lt]=100"));
    }

}