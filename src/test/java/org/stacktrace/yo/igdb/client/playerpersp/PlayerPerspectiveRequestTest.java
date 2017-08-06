package org.stacktrace.yo.igdb.client.playerpersp;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.common.PostFix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class PlayerPerspectiveRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void platformRequestUrlWithFields() throws Exception {
        PlayerPerspectiveRequest playerPerspectiveRequest = new PlayerPerspectiveRequest(client)
                .withFields(
                        PlayerPerspectiveFields.CREATED_AT,
                        PlayerPerspectiveFields.GAMES
                );
        assertThat(playerPerspectiveRequest.buildUrl(), is("player_perspectives/?fields=created_at,games"));
    }

    @Test
    public void playerPerspectiveRequestUrlWithSearchAndFields() throws Exception {
        PlayerPerspectiveRequest playerPerspectiveRequest = new PlayerPerspectiveRequest(client)
                .withFields(
                        PlayerPerspectiveFields.CREATED_AT,
                        PlayerPerspectiveFields.GAMES
                )
                .withSearch("Test");
        assertThat(playerPerspectiveRequest.buildUrl(), is("player_perspectives/?search=Test&fields=created_at,games"));
    }

    @Test
    public void playerPerspectiveRequestUrlWithSearchAndFieldsAndFilters() throws Exception {
        PlayerPerspectiveRequest playerPerspectiveRequest = new PlayerPerspectiveRequest(client)
                .withFields(
                        PlayerPerspectiveFields.CREATED_AT,
                        PlayerPerspectiveFields.GAMES
                )
                .withSearch("Test")
                .addFilter(new PlayerPerspectiveFilter()
                        .filter(PlayerPerspectiveFields.ID)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new PlayerPerspectiveFilter()
                        .filter(PlayerPerspectiveFields.GAMES)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(playerPerspectiveRequest.buildUrl(), is("player_perspectives/?search=Test&fields=created_at,games&filter=[id][gt]=89&filter=[games][lt]=100"));
    }

}