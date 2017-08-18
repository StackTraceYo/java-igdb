package org.stacktrace.yo.igdb.client;

import org.junit.Ignore;
import org.junit.Test;
import org.stacktrace.yo.igdb.client.character.CharacterFields;
import org.stacktrace.yo.igdb.client.common.PostFix;
import org.stacktrace.yo.igdb.client.company.CompanyFields;
import org.stacktrace.yo.igdb.client.core.count.Count;
import org.stacktrace.yo.igdb.client.franchise.FranchiseFields;
import org.stacktrace.yo.igdb.client.game.GameFields;
import org.stacktrace.yo.igdb.client.game.GameFilter;
import org.stacktrace.yo.igdb.client.theme.ThemeFields;
import org.stacktrace.yo.igdb.model.Character;
import org.stacktrace.yo.igdb.model.Company;
import org.stacktrace.yo.igdb.model.Game;
import org.stacktrace.yo.igdb.model.Theme;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegrationTest {

    @Test
    @Ignore
    public void Test() throws Exception {

        IGDBClient client = IGDBClient.getBuilder()
                .withKey("ea380a24711ad2e2ae60c63223371f03")
                .withUrl("https://api-2445582011268.apicast.io")
                .build();

        Count count = client.themes().count();

        String ids = IntStream.range(0, Math.toIntExact(count.getCount()))
                .mapToObj(i -> Integer.valueOf(i).toString())
                .collect(Collectors.joining(","));

        client.franchises().withFields(FranchiseFields.ALL).go();

        //Games

        count = client.games().count();

        ids = IntStream.range(0, Math.toIntExact(count.getCount()) % 20)
                .mapToObj(i -> Integer.valueOf(i).toString())
                .collect(Collectors.joining(","));

        List<Game> games = client.games().withIds(ids).withFields(GameFields.ALL).go();

        games = client.games().withFields(GameFields.ALL)
                .withSearch("zelda")
                .addFilter(new GameFilter()
                        .filter(GameFields.RATING)
                        .thatAre(PostFix.GREATER_THAN_OR_EQUALS)
                        .withValueOf("80"))
                .go();

        games.forEach(game -> println(game.getName()));


        count = client.characters().count();
        ids = IntStream.range(0, Math.toIntExact(count.getCount()) % 20)
                .mapToObj(i -> Integer.valueOf(i).toString())
                .collect(Collectors.joining(","));

        client.characters().withIds(ids).go().forEach(chara -> println(chara.getName()));

        List<Character> chars = client.characters()
                .withFields(CharacterFields.ALL)
                .withSearch("zelda")
                .go();

        count = client.companies().count();
        ids = IntStream.range(0, Math.toIntExact(count.getCount()) % 20)
                .mapToObj(i -> Integer.valueOf(i).toString())
                .collect(Collectors.joining(","));

        client.companies().withIds(ids).go().forEach(com -> println(com.getName()));

        List<Company> companies = client.companies()
                .withFields(CompanyFields.ALL)
                .withSearch("electronic")
                .go();


        List<Theme> themes = client.themes().withIds(ids).withFields(ThemeFields.ALL).go();
        themes.forEach(theme -> System.out.print(theme.getName()));

        count = client.genres().count();
        ids = IntStream.range(0, Math.toIntExact(count.getCount()))
                .mapToObj(i -> Integer.valueOf(i).toString())
                .collect(Collectors.joining(","));

        client.genres().withIds(ids).go().forEach(genre -> println(genre.getName()));
//
//
////
//        List<Collection> collections = client.collections()
//                .withFields(CollectionFields.ALL)
//                .withSearch("bioshock")
//                .go();
//
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

    private static void println(String x) {
        System.out.println(x);
    }
}
