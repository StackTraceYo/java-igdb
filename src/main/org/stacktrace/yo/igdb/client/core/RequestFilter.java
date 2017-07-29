package org.stacktrace.yo.igdb.client.core;

import org.stacktrace.yo.igdb.client.common.PostFix;

abstract public class RequestFilter<T, K> implements Filter {

    protected T field;
    protected PostFix postFix;
    protected String value;

    public RequestFilter() {
    }

    public K filter(T field) {
        this.field = field;
        return (K) this;
    }

    public K thatAre(PostFix postFix) {
        this.postFix = postFix;
        return (K) this;
    }

    public K withValueOf(String valueOf) {
        this.value = valueOf;
        return (K) this;
    }

    @Override
    public String getPostFix() {
        return postFix.getValue();
    }

    @Override
    public String getValue() {
        return value;
    }
}
