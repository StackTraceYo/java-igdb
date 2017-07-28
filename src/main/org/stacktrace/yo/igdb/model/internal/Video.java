package org.stacktrace.yo.igdb.model.internal;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class Video {

    private String name;
    private String videoId;

    public Video() {
    }

    public String getName() {
        return name;
    }

    public Video setName(String name) {
        this.name = name;
        return this;
    }

    public String getVideoId() {
        return videoId;
    }

    public Video setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
}
