package org.stacktrace.yo.igdb.client.game;

import org.stacktrace.yo.igdb.client.Filter;
import org.stacktrace.yo.igdb.client.PostFix;

public class GameFilter implements Filter {

    private final String field;
    private final String postFix;
    private final String value;

    GameFilter(String field, String postFix, String value) {
        this.field = field;
        this.postFix = postFix;
        this.value = value;
    }


    @Override
    public String getField() {
        return field;
    }

    @Override
    public String getPostFix() {
        return postFix;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static FilterBuilder getBuilder() {
        return new GameFilter.FilterBuilder();
    }

    public static final class FilterBuilder {

        private GameFields field;
        private PostFix postFix;
        private String value;

        public GameFilter.FilterBuilder filter(GameFields field) {
            this.field = field;
            return this;
        }

        public GameFilter.FilterBuilder thatAre(PostFix postFix) {
            this.postFix = postFix;
            return this;
        }

        public GameFilter.FilterBuilder valueOf(String value) {
            this.value = value;
            return this;
        }

        public GameFilter build() {
            return new GameFilter(field.getUrlFormat(), postFix.getValue(), value);
        }
    }


}