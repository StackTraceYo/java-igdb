package org.stacktrace.yo.igdb.client.core;

import org.stacktrace.yo.igdb.client.character.CharacterRequest;
import org.stacktrace.yo.igdb.client.collection.CollectionRequest;
import org.stacktrace.yo.igdb.client.company.CompanyRequest;
import org.stacktrace.yo.igdb.client.engine.GameEngineRequest;
import org.stacktrace.yo.igdb.client.feed.FeedRequest;
import org.stacktrace.yo.igdb.client.franchise.FranchiseRequest;
import org.stacktrace.yo.igdb.client.game.GameRequest;
import org.stacktrace.yo.igdb.client.gamemode.GameModeRequest;
import org.stacktrace.yo.igdb.client.page.PageRequest;

/**
 * Created by Stacktraceyo on 8/1/17.
 */
public interface IGDBApiRequester {

    GameRequest games();

    CharacterRequest characters();

    CollectionRequest collections();

    FeedRequest feeds();

    CompanyRequest companies();

    PageRequest pages();

    GameEngineRequest gameEngines();

    GameModeRequest gameModes();

    FranchiseRequest franchises();

}
