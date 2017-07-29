package org.stacktrace.yo.igdb.client.character;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.common.PostFix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class CharacterRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void characterRequestUrlWithFields() throws Exception {
        CharacterRequest charcterRequest = new CharacterRequest(client)
                .withFields(
                        CharacterFields.CREATED_AT,
                        CharacterFields.GAMES
                );
        assertThat(charcterRequest.buildUrl(), is("characters/?fields=created_at,games"));
    }

    @Test
    public void gameRequestUrlWithSearchAndFields() throws Exception {
        CharacterRequest charcterRequest = new CharacterRequest(client)
                .withFields(
                        CharacterFields.CREATED_AT,
                        CharacterFields.GAMES
                )
                .withSearch("Test");
        assertThat(charcterRequest.buildUrl(), is("characters/?search=Test&fields=created_at,games"));
    }

    @Test
    public void gameRequestUrlWithSearchAndFieldsAndFilters() throws Exception {
        CharacterRequest charcterRequest = new CharacterRequest(client)
                .withFields(
                        CharacterFields.CREATED_AT,
                        CharacterFields.GAMES
                )
                .withSearch("Test")
                .addFilter(new CharacterFilter()
                        .filter(CharacterFields.ID)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new CharacterFilter()
                        .filter(CharacterFields.GENDER)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(charcterRequest.buildUrl(), is("characters/?search=Test&fields=created_at,games&filter=[id][gt]=89&filter=[gender][lt]=100"));
    }

}