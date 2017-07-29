package org.stacktrace.yo.igdb.client;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.game.GameFields;
import org.stacktrace.yo.igdb.client.game.GameFilter;
import org.stacktrace.yo.igdb.model.Game;

import java.util.List;

public class IntegrationTest {

    @Test
    public void Test() throws Exception {

        IGDBClient x = IGDBClient.getBuilder()
                .withKey("ea380a24711ad2e2ae60c63223371f03")
                .withUrl("https://api-2445582011268.apicast.io")
                .build();

        ///games/?search=zelda&filter[rating][gte]=80&filter[release_dates.date][gt]=YYYY-MM-DD

        List<Game> y = x.games().withFields(GameFields.ALL)
                .withSearch("zelda")
                .addFilter(GameFilter.getBuilder()
                        .filter(GameFields.RATING)
                        .thatAre(PostFix.GREATER_THAN_OR_EQUALS)
                        .valueOf("80"))
                .go();
        y.isEmpty();
    }
}
