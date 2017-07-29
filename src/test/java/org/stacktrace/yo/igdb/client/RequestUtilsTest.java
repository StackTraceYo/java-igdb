package org.stacktrace.yo.igdb.client;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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
                Lists.newArrayList()),
                is("?search=Zelda")
        );
    }

    @Test
    public void makesParamsWithSearchAndFields() throws Exception {
        assertThat(RequestUtils.createParams(
                "Zelda",
                Lists.newArrayList("one,two,three"),
                Lists.newArrayList()),
                is("?search=Zelda&fields=one,two,three")
        );
    }

    @Test
    public void makesParamsWithSearchAndFieldsAndFilters() throws Exception {

        assertThat(RequestUtils.createParams(
                "Zelda",
                Lists.newArrayList("one,two,three"),
                Lists.newArrayList(one, two)),
                is("?search=Zelda&fields=one,two,three&filter=[rating][gt]=80&filter=[name][eq]=zelda")
        );
    }
}
