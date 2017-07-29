package org.stacktrace.yo.igdb.client;

import com.google.common.collect.Lists;
import org.junit.Test;
import org.stacktrace.yo.igdb.client.core.Filter;
import org.stacktrace.yo.igdb.client.utils.RequestUtils;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

//TODO Make this IGDBRequestUrl tests
public class RequestUtilsTest {

    Filter one = new Filter() {
        @Override
        public String getField() {
            return "rating";
        }

        @Override
        public String getPostFix() {
            return "gt";
        }

        @Override
        public String getValue() {
            return "80";
        }
    };
    Filter two = new Filter() {
        @Override
        public String getField() {
            return "name";
        }

        @Override
        public String getPostFix() {
            return "eq";
        }

        @Override
        public String getValue() {
            return "zelda";
        }
    };

    @Test
    public void makesFieldsString() throws Exception {
        List<String> fields = Lists.newArrayList("one", "two", "three", "four", "five");
        assertThat(RequestUtils.createFieldQuery(fields), is("one,two,three,four,five"));
    }

    @Test
    public void makesParamsWithOnlyFilters() throws Exception {
        assertThat(RequestUtils.createParams(
                "Zelda",
                new ArrayList<>(),
                Lists.newArrayList(),
                Lists.newArrayList(), null),
                is("?search=Zelda")
        );
    }

    @Test
    public void makesParamsWithSearchAndFields() throws Exception {
        assertThat(RequestUtils.createParams(
                "Zelda",
                Lists.newArrayList("one,two,three"),
                Lists.newArrayList(),
                Lists.newArrayList(), null),
                is("?search=Zelda&fields=one,two,three")
        );
    }

    @Test
    public void makesParamsWithSearchAndFieldsAndFilters() throws Exception {

        assertThat(RequestUtils.createParams(
                "Zelda",
                Lists.newArrayList("one,two,three"),
                Lists.newArrayList(one, two),
                Lists.newArrayList(), null),
                is("?search=Zelda&fields=one,two,three&filter=[rating][gt]=80&filter=[name][eq]=zelda")
        );
    }

    @Test
    public void makesParamsWithIdsSearchAndFieldsAndFilters() throws Exception {

        assertThat(RequestUtils.createParams(
                "Zelda",
                Lists.newArrayList("one,two,three"),
                Lists.newArrayList(one, two),
                Lists.newArrayList("15", "153"), null),
                is("15,153?search=Zelda&fields=one,two,three&filter=[rating][gt]=80&filter=[name][eq]=zelda")
        );
    }

    @Test
    public void makesParamsWithIdsAndCount() throws Exception {

        assertThat(RequestUtils.createParams(
                "Zelda",
                Lists.newArrayList(),
                Lists.newArrayList(),
                Lists.newArrayList(), one),
                is("count?filter[rating][gt]=80")
        );
    }
}
