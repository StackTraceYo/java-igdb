package org.stacktrace.yo.igdb.client.genre;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.common.PostFix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class GenreRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void genreRequestUrlWithFields() throws Exception {
        GenreRequest genreRequest = new GenreRequest(client)
                .withFields(
                        GenreFields.CREATED_AT,
                        GenreFields.GAMES
                );
        assertThat(genreRequest.buildUrl(), is("genres/?fields=created_at,games"));
    }

    @Test
    public void genreRequestUrlWithSearchAndFields() throws Exception {
        GenreRequest genreRequest = new GenreRequest(client)
                .withFields(
                        GenreFields.CREATED_AT,
                        GenreFields.GAMES
                )
                .withSearch("Test");
        assertThat(genreRequest.buildUrl(), is("genres/?search=Test&fields=created_at,games"));
    }

    @Test
    public void genreRequestUrlWithSearchAndFieldsAndFilters() throws Exception {
        GenreRequest genreRequest = new GenreRequest(client)
                .withFields(
                        GenreFields.CREATED_AT,
                        GenreFields.GAMES
                )
                .withSearch("Test")
                .addFilter(new GenreFilter()
                        .filter(GenreFields.ID)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new GenreFilter()
                        .filter(GenreFields.GAMES)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(genreRequest.buildUrl(), is("genres/?search=Test&fields=created_at,games&filter=[id][gt]=89&filter=[games][lt]=100"));
    }

}