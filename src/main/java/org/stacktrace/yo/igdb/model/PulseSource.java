package org.stacktrace.yo.igdb.model;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class PulseSource implements IGDBModel {

    private Integer id;
    private String name;
    private Integer game;
    private Integer page;

    public PulseSource() {
    }

    public Integer getId() {
        return id;
    }

    public PulseSource setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PulseSource setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getGame() {
        return game;
    }

    public PulseSource setGame(Integer game) {
        this.game = game;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public PulseSource setPage(Integer page) {
        this.page = page;
        return this;
    }
}
