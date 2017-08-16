package org.stacktrace.yo.igdb.client.theme;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.Theme;

import java.util.Arrays;
import java.util.List;

public class ThemeRequest extends IGDBClientRequester<Theme, ThemeRequest, ThemeFilter, ThemeFields> {


    public ThemeRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "themes/";
    }

    public List<Theme> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(Theme[].class)
                .getBody());
    }

    @Override
    public String getFieldValue(ThemeFields field) {
        return field.getUrlFormat();
    }
}
