package org.stacktrace.yo.igdb.client.core;

import org.stacktrace.yo.igdb.model.IGDBModel;

import java.util.List;

public interface IGDBApiRequest<T> {

    List<T> go() throws Exception;

}
