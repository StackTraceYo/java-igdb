package org.stacktrace.yo.igdb.client.gamemode;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.common.PostFix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class GameModeRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void gameModeRequestUrlWithFields() throws Exception {
        GameModeRequest gameModeRequest = new GameModeRequest(client)
                .withFields(
                        GameModeFields.CREATED_AT,
                        GameModeFields.GAMES
                );
        assertThat(gameModeRequest.buildUrl(), is("game_modes/?fields=created_at,games"));
    }

    @Test
    public void gameModeRequestUrlWithSearchAndFields() throws Exception {
        GameModeRequest gameModeRequest = new GameModeRequest(client)
                .withFields(
                        GameModeFields.CREATED_AT,
                        GameModeFields.GAMES
                )
                .withSearch("Test");
        assertThat(gameModeRequest.buildUrl(), is("game_modes/?search=Test&fields=created_at,games"));
    }

    @Test
    public void gameModeRequestUrlWithSearchAndFieldsAndFilters() throws Exception {
        GameModeRequest gameModeRequest = new GameModeRequest(client)
                .withFields(
                        GameModeFields.CREATED_AT,
                        GameModeFields.GAMES
                )
                .withSearch("Test")
                .addFilter(new GameModeFilter()
                        .filter(GameModeFields.ID)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new GameModeFilter()
                        .filter(GameModeFields.GAMES)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(gameModeRequest.buildUrl(), is("game_modes/?search=Test&fields=created_at,games&filter=[id][gt]=89&filter=[games][lt]=100"));
    }

}