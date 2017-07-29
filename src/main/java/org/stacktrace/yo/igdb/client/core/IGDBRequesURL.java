package org.stacktrace.yo.igdb.client.core;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.List;

public class IGDBRequesURL {


    private final static String FIELDS = "fields";
    private final static String SEARCH = "search";
    private final static String FILTER = "filter";
    private final static String COUNT = "count";
    private final static String EQUAL = "=";
    private final static String AND = "&";
    private final static String QUERY = "?";

    private String searchTerm = "";
    private List<String> fields;
    private List<Filter> filters;
    private List<String> ids;
    private Filter countFilter;

    public IGDBRequesURL() {
        fields = new ArrayList<>();
        filters = new ArrayList<>();
        ids = new ArrayList<>();
    }

    //TODO refactor
    public String build() {
        StringBuilder params = new StringBuilder();
        boolean hasSearch = !searchTerm.isEmpty();
        boolean hasFields = !fields.isEmpty();
        boolean hasFilters = !filters.isEmpty();
        boolean hasCountFilter = countFilter != null;
        boolean hasIds = !ids.isEmpty();
        if (hasIds) {
            params.append(joinWordsWithComma(ids));
        }
        if (hasCountFilter) {
            params.append(COUNT)
                    .append(QUERY)
                    .append(FILTER)
                    .append(wrapFilter(countFilter.getField()))
                    .append(wrapFilter(countFilter.getPostFix()))
                    .append(EQUAL)
                    .append(countFilter.getValue());
            return params.toString();
        }
        if (hasFields || hasSearch || hasFilters) {
            params.append(QUERY);
        }
        if (hasSearch) {
            params.append(SEARCH)
                    .append(EQUAL)
                    .append(searchTerm);
        }
        if (hasFields) {
            String fieldString = joinWordsWithComma(fields);
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

    private String wrapFilter(String word) {
        return "[" + word + "]";
    }

    private String joinWordsWithComma(List<String> fields) {
        return Joiner.on(",").join(fields);
    }


    public IGDBRequesURL addField(String field) {
        fields.add(field);
        return this;
    }


    public IGDBRequesURL addId(String id) {
        ids.add(id);
        return this;
    }


    public IGDBRequesURL addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public Filter getCountFilter() {
        return countFilter;
    }

    public void setCountFilter(Filter countFilter) {
        this.countFilter = countFilter;
    }
}
