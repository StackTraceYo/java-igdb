package org.stacktrace.yo.igdb.client.person;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.common.PostFix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class PersonRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void personRequestUrlWithFields() throws Exception {
        PersonRequest personRequest = new PersonRequest(client)
                .withFields(
                        PersonFields.CREATED_AT,
                        PersonFields.GAMES
                );
        assertThat(personRequest.buildUrl(), is("people/?fields=created_at,games"));
    }

    @Test
    public void personRequestUrlWithSearchAndFields() throws Exception {
        PersonRequest personRequest = new PersonRequest(client)
                .withFields(
                        PersonFields.CREATED_AT,
                        PersonFields.GAMES
                )
                .withSearch("Test");
        assertThat(personRequest.buildUrl(), is("people/?search=Test&fields=created_at,games"));
    }

    @Test
    public void personRequestUrlWithSearchAndFieldsAndFilters() throws Exception {
        PersonRequest personRequest = new PersonRequest(client)
                .withFields(
                        PersonFields.CREATED_AT,
                        PersonFields.GAMES
                )
                .withSearch("Test")
                .addFilter(new PersonFilter()
                        .filter(PersonFields.ID)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new PersonFilter()
                        .filter(PersonFields.GAMES)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(personRequest.buildUrl(), is("people/?search=Test&fields=created_at,games&filter=[id][gt]=89&filter=[games][lt]=100"));
    }

}