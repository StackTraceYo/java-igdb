package org.stacktrace.yo.igdb.client.core;

import java.util.List;

public interface IGDBApiRequest<T> {

    List<T> go() throws Exception;

    String create() throws Exception;

}
