package org.stacktrace.yo.igdb.client.pulsegroup;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.common.PostFix;
import org.stacktrace.yo.igdb.client.pulse.PulseGroupFields;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class PulseGroupRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void pulseGroupRequestUrlWithFields() throws Exception {
        PulseGroupRequest playerPerspectiveRequest = new PulseGroupRequest(client)
                .withFields(
                        PulseGroupFields.CREATED_AT,
                        PulseGroupFields.NAME
                );
        assertThat(playerPerspectiveRequest.buildUrl(), is("pulse_groups/?fields=created_at,name"));
    }

    @Test
    public void pulseGroupRequestUrlWithSearchAndFields() throws Exception {
        PulseGroupRequest playerPerspectiveRequest = new PulseGroupRequest(client)
                .withFields(
                        PulseGroupFields.CREATED_AT,
                        PulseGroupFields.NAME
                )
                .withSearch("Test");
        assertThat(playerPerspectiveRequest.buildUrl(), is("pulse_groups/?search=Test&fields=created_at,name"));
    }

    @Test
    public void pulseGroupRequestUrlWithSearchAndFieldsAndFilters() throws Exception {
        PulseGroupRequest playerPerspectiveRequest = new PulseGroupRequest(client)
                .withFields(
                        PulseGroupFields.CREATED_AT,
                        PulseGroupFields.NAME
                )
                .withSearch("Test")
                .addFilter(new PulseGroupFilter()
                        .filter(PulseGroupFields.ID)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new PulseGroupFilter()
                        .filter(PulseGroupFields.NAME)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(playerPerspectiveRequest.buildUrl(), is("pulse_groups/?search=Test&fields=created_at,name&filter=[id][gt]=89&filter=[name][lt]=100"));
    }

}