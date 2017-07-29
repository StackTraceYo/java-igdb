package org.stacktrace.yo.igdb.client.utils;

import com.google.common.base.Joiner;
import org.stacktrace.yo.igdb.client.core.Filter;

import java.util.List;

public class RequestUtils {

    private final static String FIELDS = "fields";
    private final static String SEARCH = "search";
    private final static String FILTER = "filter";
    private final static String COUNT = "count";
    private final static String EQUAL = "=";
    private final static String AND = "&";
    private final static String QUERY = "?";

    public static String createFieldQuery(List<String> fields) {
        return Joiner.on(",").join(fields);
    }

    //TODO refactor this badly
    public static String createParams(String search, List<String> fields, List<Filter> filters, List<String> ids, Filter countFilters) {
        StringBuilder params = new StringBuilder();
        boolean hasSearch = !search.isEmpty();
        boolean hasFields = !fields.isEmpty();
        boolean hasFilters = !filters.isEmpty();
        boolean hasCountFilter = countFilters != null;
        boolean hasIds = !ids.isEmpty();
        if (hasIds) {
            params.append(createFieldQuery(ids));
        }
        if (hasCountFilter) {
            params.append(COUNT)
                    .append(QUERY)
                    .append(FILTER)
                    .append(wrapFilter(countFilters.getField()))
                    .append(wrapFilter(countFilters.getPostFix()))
                    .append(EQUAL)
                    .append(countFilters.getValue());
            return params.toString();
        }
        if (hasFields || hasSearch || hasFilters) {
            params.append(QUERY);
        }
        if (hasSearch) {
            params.append(SEARCH)
                    .append(EQUAL)
                    .append(search);
        }
        if (hasFields) {
            String fieldString = createFieldQuery(fields);
            if (hasSearch) {
                params.append(AND);
            }
            params.append(FIELDS)
                    .append(EQUAL)
                    .append(fieldString);
        }
        if (hasFilters) {
            if (hasSearch || hasFields) {
                params.append(AND);
            }
            boolean multiple = false;
            for (Filter filter : filters) {
                if (multiple) {
                    params.append(AND);
                }
                params.append(FILTER)
                        .append(EQUAL)
                        .append(wrapFilter(filter.getField()))
                        .append(wrapFilter(filter.getPostFix()))
                        .append(EQUAL)
                        .append(filter.getValue());
                multiple = true;
            }
        }
        return params.toString();
    }

    private static String wrapFilter(String word) {
        return "[" + word + "]";
    }
}
