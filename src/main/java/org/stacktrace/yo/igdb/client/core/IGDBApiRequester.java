package org.stacktrace.yo.igdb.client.core;

import org.stacktrace.yo.igdb.client.character.CharacterRequest;
import org.stacktrace.yo.igdb.client.collection.CollectionRequest;
import org.stacktrace.yo.igdb.client.company.CompanyRequest;
import org.stacktrace.yo.igdb.client.engine.GameEngineRequest;
import org.stacktrace.yo.igdb.client.feed.FeedRequest;
import org.stacktrace.yo.igdb.client.franchise.FranchiseRequest;
import org.stacktrace.yo.igdb.client.game.GameRequest;
import org.stacktrace.yo.igdb.client.gamemode.GameModeRequest;
import org.stacktrace.yo.igdb.client.genre.GenreRequest;
import org.stacktrace.yo.igdb.client.keyword.KeywordRequest;
import org.stacktrace.yo.igdb.client.page.PageRequest;
import org.stacktrace.yo.igdb.client.person.PersonRequest;
import org.stacktrace.yo.igdb.client.platform.PlatformRequest;
import org.stacktrace.yo.igdb.client.playerpersp.PlayerPerspectiveRequest;
import org.stacktrace.yo.igdb.client.pulse.PulseRequest;
import org.stacktrace.yo.igdb.client.pulsegroup.PulseGroupRequest;
import org.stacktrace.yo.igdb.client.pulsesource.PulseSourceRequest;

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

    GenreRequest genres();

    FranchiseRequest franchises();

    KeywordRequest keywords();

    PersonRequest people();

    PlatformRequest platforms();

    PlayerPerspectiveRequest playerPerspectives();

    PulseRequest pulses();

    PulseGroupRequest pulseGroups();

    PulseSourceRequest pulseSources();

}
