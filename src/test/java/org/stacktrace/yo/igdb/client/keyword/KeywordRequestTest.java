package org.stacktrace.yo.igdb.client.keyword;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.common.PostFix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class KeywordRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void keywordRequestUrlWithFields() throws Exception {
        KeywordRequest keywordRequest = new KeywordRequest(client)
                .withFields(
                        KeywordFields.CREATED_AT,
                        KeywordFields.GAMES
                );
        assertThat(keywordRequest.buildUrl(), is("keywords/?fields=created_at,games"));
    }

    @Test
    public void keywordRequestUrlWithSearchAndFields() throws Exception {
        KeywordRequest keywordRequest = new KeywordRequest(client)
                .withFields(
                        KeywordFields.CREATED_AT,
                        KeywordFields.GAMES
                )
                .withSearch("Test");
        assertThat(keywordRequest.buildUrl(), is("keywords/?search=Test&fields=created_at,games"));
    }

    @Test
    public void keywordRequestUrlWithSearchAndFieldsAndFilters() throws Exception {
        KeywordRequest keywordRequest = new KeywordRequest(client)
                .withFields(
                        KeywordFields.CREATED_AT,
                        KeywordFields.GAMES
                )
                .withSearch("Test")
                .addFilter(new KeywordFilter()
                        .filter(KeywordFields.ID)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new KeywordFilter()
                        .filter(KeywordFields.GAMES)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(keywordRequest.buildUrl(), is("keywords/?search=Test&fields=created_at,games&filter=[id][gt]=89&filter=[games][lt]=100"));
    }

}