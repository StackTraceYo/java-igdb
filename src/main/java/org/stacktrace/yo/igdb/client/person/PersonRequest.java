package org.stacktrace.yo.igdb.client.person;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.Person;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class PersonRequest extends IGDBClientRequester<Person, PersonRequest, PersonFilter, PersonFields> {


    public PersonRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "people/";
    }

    public List<Person> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(Person[].class)
                .getBody());
    }

    @Override
    public String getFieldValue(PersonFields field) {
        return field.getUrlFormat();
    }
}
