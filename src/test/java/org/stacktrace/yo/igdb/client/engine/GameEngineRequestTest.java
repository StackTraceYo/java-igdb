package org.stacktrace.yo.igdb.client.engine;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.common.PostFix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class GameEngineRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void gameEngineRequestUrlWithFields() throws Exception {
        GameEngineRequest gameEngineRequest = new GameEngineRequest(client)
                .withFields(
                        GameEngineFields.CREATED_AT,
                        GameEngineFields.GAMES
                );
        assertThat(gameEngineRequest.buildUrl(), is("game_engines/?fields=created_at,games"));
    }

    @Test
    public void gameEngineRequestUrlWithSearchAndFields() throws Exception {
        GameEngineRequest gameEngineRequest = new GameEngineRequest(client)
                .withFields(
                        GameEngineFields.CREATED_AT,
                        GameEngineFields.GAMES
                )
                .withSearch("Test");
        assertThat(gameEngineRequest.buildUrl(), is("game_engines/?search=Test&fields=created_at,games"));
    }

    @Test
    public void gameEngineRequestUrlWithSearchAndFieldsAndFilters() throws Exception {
        GameEngineRequest gameEngineRequest = new GameEngineRequest(client)
                .withFields(
                        GameEngineFields.CREATED_AT,
                        GameEngineFields.GAMES
                )
                .withSearch("Test")
                .addFilter(new GameEngineFilter()
                        .filter(GameEngineFields.ID)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new GameEngineFilter()
                        .filter(GameEngineFields.GAMES)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(gameEngineRequest.buildUrl(), is("game_engines/?search=Test&fields=created_at,games&filter=[id][gt]=89&filter=[games][lt]=100"));
    }

}