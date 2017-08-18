package org.stacktrace.yo.igdb.client;

import org.junit.Ignore;
import org.junit.Test;

public class IntegrationTest {

    @Test
    @Ignore
    public void Test() throws Exception {

        IGDBClient client = IGDBClient.getBuilder()
                .withKey("ea380a24711ad2e2ae60c63223371f03")
                .withUrl("https://api-2445582011268.apicast.io")
                .build();

//
//        List<Game> games = client.games().withFields(GameFields.ALL)
//                .withSearch("zelda")
//                .addFilter(new GameFilter()
//                        .filter(GameFields.RATING)
//                        .thatAre(PostFix.GREATER_THAN_OR_EQUALS)
//                        .withValueOf("80"))
//                .go();
//
//        List<Character> chars = client.characters()
//                .withFields(CharacterFields.ALL)
//                .withSearch("zelda")
//                .go();
////
//        List<Collection> collections = client.collections()
//                .withFields(CollectionFields.ALL)
//                .withSearch("bioshock")
//                .go();
//
//        List<Company> companies = client.companies()
//                .withFields(CompanyFields.ALL)
//                .withSearch("electronic")
//                .go();
//
//        List<GameEngine> gameEngines = client.gameEngines()
//                .withFields(GameEngineFields.ALL)
//                .withSearch("unreal")
//                .go();
//
//        List<org.stacktrace.yo.igdb.model.Feed> feeds = client.feeds()
//                .withFields(FeedFields.ALL)
//                .withSearch("worlds")
//                .go();
//
//        assertTrue(!games.isEmpty());
//        assertTrue(!chars.isEmpty());
//        assertTrue(!collections.isEmpty());
//        assertTrue(!companies.isEmpty());
//        assertTrue(!gameEngines.isEmpty());
//        assertTrue(!feeds.isEmpty());
//    }
    }
}
