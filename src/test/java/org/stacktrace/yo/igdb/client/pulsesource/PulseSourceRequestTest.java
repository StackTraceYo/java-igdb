package org.stacktrace.yo.igdb.client.pulsesource;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.common.PostFix;
import org.stacktrace.yo.igdb.client.pulse.PulseGroupFields;
import org.stacktrace.yo.igdb.client.pulsegroup.PulseGroupFilter;
import org.stacktrace.yo.igdb.client.pulsegroup.PulseGroupRequest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class PulseSourceRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void pulseSourceRequestUrlWithFields() throws Exception {
        PulseSourceRequest playerPerspectiveRequest = new PulseSourceRequest(client)
                .withFields(
                        PulseSourceFields.NAME,
                        PulseSourceFields.GAME
                );
        assertThat(playerPerspectiveRequest.buildUrl(), is("pulse_sources/?fields=name,game"));
    }

    @Test
    public void pulseSourceRequestUrlWithSearchAndFields() throws Exception {
        PulseSourceRequest playerPerspectiveRequest = new PulseSourceRequest(client)
                .withFields(
                        PulseSourceFields.NAME,
                        PulseSourceFields.GAME
                )
                .withSearch("Test");
        assertThat(playerPerspectiveRequest.buildUrl(), is("pulse_sources/?search=Test&fields=name,game"));
    }

    @Test
    public void pulseSourceRequestUrlWithSearchAndFieldsAndFilters() throws Exception {
        PulseSourceRequest playerPerspectiveRequest = new PulseSourceRequest(client)
                .withFields(
                        PulseSourceFields.NAME,
                        PulseSourceFields.GAME
                )
                .withSearch("Test")
                .addFilter(new PulseSourceFilter()
                        .filter(PulseSourceFields.ID)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new PulseSourceFilter()
                        .filter(PulseSourceFields.GAME)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(playerPerspectiveRequest.buildUrl(), is("pulse_sources/?search=Test&fields=name,game&filter=[id][gt]=89&filter=[game][lt]=100"));
    }

}