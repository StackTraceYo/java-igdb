package org.stacktrace.yo.igdb.client.core;

import org.stacktrace.yo.igdb.model.IGDBModel;

import java.util.List;

public interface IGDBApiRequest<T extends IGDBModel> {

    List<T> go() throws Exception;

}
