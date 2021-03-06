package org.stacktrace.yo.igdb.client.pulse;

import org.junit.Test;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.common.PostFix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class PulseRequestTest {

    private final IGDBClient client = IGDBClient.getBuilder().build();

    @Test
    public void platformRequestUrlWithFields() throws Exception {
        PulseRequest pulse = new PulseRequest(client)
                .withFields(
                        PulseFields.CREATED_AT,
                        PulseFields.AUTHOR
                );
        assertThat(pulse.buildUrl(), is("pulses/?fields=created_at,author"));
    }

    @Test
    public void pulseUrlWithSearchAndFields() throws Exception {
        PulseRequest pulse = new PulseRequest(client)
                .withFields(
                        PulseFields.CREATED_AT,
                        PulseFields.AUTHOR
                )
                .withSearch("Test");
        assertThat(pulse.buildUrl(), is("pulses/?search=Test&fields=created_at,author"));
    }

    @Test
    public void pulseUrlWithSearchAndFieldsAndFilters() throws Exception {
        PulseRequest pulse = new PulseRequest(client)
                .withFields(
                        PulseFields.CREATED_AT,
                        PulseFields.AUTHOR
                )
                .withSearch("Test")
                .addFilter(new PulseFilter()
                        .filter(PulseFields.ID)
                        .thatAre(PostFix.GREATER_THAN)
                        .withValueOf("89"))
                .addFilter(new PulseFilter()
                        .filter(PulseFields.AUTHOR)
                        .thatAre(PostFix.LESS_THAN)
                        .withValueOf("100"));
        assertThat(pulse.buildUrl(), is("pulses/?search=Test&fields=created_at,author&filter=[id][gt]=89&filter=[author][lt]=100"));
    }

}