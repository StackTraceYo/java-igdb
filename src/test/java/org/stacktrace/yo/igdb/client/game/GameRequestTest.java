package org.stacktrace.yo.igdb.client.game;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.common.PostFix;

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
                .addFilter(new GameFilter()
                        .filter(GameFields.CATEGORY)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new GameFilter()
                        .filter(GameFields.AGGREGATED_RATING_COUNT)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(gameRequest.buildUrl(), is("games/?search=Test&fields=aggregated_rating_count,alternative_names,category&filter=[category][gt]=89&filter=[aggregated_rating_count][lt]=100"));
    }

    @Test
    public void gameRequestIdsAndUrlWithSearchAndFieldsAndFilters() throws Exception {
        GameRequest gameRequest = new GameRequest(client)
                .withIds("15", "14", "1232")
                .withFields(
                        GameFields.AGGREGATED_RATING_COUNT,
                        GameFields.ALTERNATIVE_NAMES,
                        GameFields.CATEGORY
                )
                .withSearch("Test")
                .addFilter(new GameFilter()
                        .filter(GameFields.CATEGORY)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new GameFilter()
                        .filter(GameFields.AGGREGATED_RATING_COUNT)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(gameRequest.buildUrl(), is("games/15,14,1232?search=Test&fields=aggregated_rating_count,alternative_names,category&filter=[category][gt]=89&filter=[aggregated_rating_count][lt]=100"));
    }

//    /games/count?filter[rating][gt]=75

    @Test
    public void gameRequestWithCount() throws Exception {
        GameRequest gameRequest = new GameRequest(client)
                .getCountOf(new GameFilter()
                        .filter(GameFields.RATING)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("75"));
        assertThat(gameRequest.buildUrl(), is("games/count?filter[rating][gt]=75"));
    }
}