package org.stacktrace.yo.igdb.client.page;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.common.PostFix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class PageRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void pageRequestUrlWithFields() throws Exception {
        PageRequest pageRequest = new PageRequest(client)
                .withFields(
                        PageFields.CREATED_AT,
                        PageFields.COLOR
                );
        assertThat(pageRequest.buildUrl(), is("pages/?fields=created_at,color"));
    }

    @Test
    public void pageRequestUrlWithSearchAndFields() throws Exception {
        PageRequest pageRequest = new PageRequest(client)
                .withFields(
                        PageFields.CREATED_AT,
                        PageFields.COLOR
                )
                .withSearch("Test");
        assertThat(pageRequest.buildUrl(), is("pages/?search=Test&fields=created_at,color"));
    }

    @Test
    public void pageRequestUrlWithSearchAndFieldsAndFilters() throws Exception {
        PageRequest pageRequest = new PageRequest(client)
                .withFields(
                        PageFields.CREATED_AT,
                        PageFields.COLOR
                )
                .withSearch("Test")
                .addFilter(new PageFilter()
                        .filter(PageFields.ID)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new PageFilter()
                        .filter(PageFields.CONTENT)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(pageRequest.buildUrl(), is("pages/?search=Test&fields=created_at,color&filter=[id][gt]=89&filter=[content][lt]=100"));
    }

}