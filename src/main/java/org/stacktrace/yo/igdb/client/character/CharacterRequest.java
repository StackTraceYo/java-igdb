package org.stacktrace.yo.igdb.client.character;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.Character;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class CharacterRequest extends IGDBClientRequester<Character, CharacterRequest, CharacterFilter, CharacterFields> {


    public CharacterRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "characters/";
    }

    public List<Character> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(Character[].class)
                .getBody());
    }

    @Override
    public String getFieldValue(CharacterFields field) {
        return field.getUrlFormat();
    }
}
