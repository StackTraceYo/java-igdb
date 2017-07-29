package org.stacktrace.yo.igdb.client;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.character.CharacterFields;
import org.stacktrace.yo.igdb.client.collection.CollectionFields;
import org.stacktrace.yo.igdb.client.common.PostFix;
import org.stacktrace.yo.igdb.client.game.GameFields;
import org.stacktrace.yo.igdb.client.game.GameFilter;
import org.stacktrace.yo.igdb.model.Character;
import org.stacktrace.yo.igdb.model.Collection;
import org.stacktrace.yo.igdb.model.Game;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class IntegrationTest {

    @Test
    public void Test() throws Exception {

        IGDBClient client = IGDBClient.getBuilder()
                .withKey("ea380a24711ad2e2ae60c63223371f03")
                .withUrl("https://api-2445582011268.apicast.io")
                .build();


        List<Game> games = client.games().withFields(GameFields.ALL)
                .withSearch("zelda")
                .addFilter(new GameFilter()
                        .filter(GameFields.RATING)
                        .thatAre(PostFix.GREATER_THAN_OR_EQUALS)
                        .withValueOf("80"))
                .go();

        List<Character> chars = client.characters()
                .withFields(CharacterFields.ALL)
                .withSearch("zelda")
                .go();

        List<Collection> collections = client.collections()
                .withFields(CollectionFields.ALL)
                .withSearch("Bioshock")
                .go();

        assertNotNull(games);
        assertNotNull(chars);
        assertNotNull(collections);
    }
}
