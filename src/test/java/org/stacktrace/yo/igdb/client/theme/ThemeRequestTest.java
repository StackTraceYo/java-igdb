package org.stacktrace.yo.igdb.client.theme;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.common.PostFix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class ThemeRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void themeRequestUrlWithFields() throws Exception {
        ThemeRequest themeRequest = new ThemeRequest(client)
                .withFields(
                        ThemeFields.NAME,
                        ThemeFields.GAMES
                );
        assertThat(themeRequest.buildUrl(), is("themes/?fields=name,games"));
    }

    @Test
    public void themeRequestUrlWithSearchAndFields() throws Exception {
        ThemeRequest themeRequest = new ThemeRequest(client)
                .withFields(
                        ThemeFields.NAME,
                        ThemeFields.GAMES
                )
                .withSearch("Test");
        assertThat(themeRequest.buildUrl(), is("themes/?search=Test&fields=name,games"));
    }

    @Test
    public void themeRequestUrlWithSearchAndFieldsAndFilters() throws Exception {
        ThemeRequest themeRequest = new ThemeRequest(client)
                .withFields(
                        ThemeFields.NAME,
                        ThemeFields.GAMES
                )
                .withSearch("Test")
                .addFilter(new ThemeFilter()
                        .filter(ThemeFields.ID)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new ThemeFilter()
                        .filter(ThemeFields.GAMES)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(themeRequest.buildUrl(), is("themes/?search=Test&fields=name,games&filter=[id][gt]=89&filter=[games][lt]=100"));
    }

}