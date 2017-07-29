package org.stacktrace.yo.igdb.model.internal;

public  class PlatformVersionReleaseDate {
        private Integer date;
        private Integer region;

    public PlatformVersionReleaseDate() {
    }

    public Integer getDate() {
        return date;
    }

    public PlatformVersionReleaseDate setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getRegion() {
        return region;
    }

    public PlatformVersionReleaseDate setRegion(Integer region) {
        this.region = region;
        return this;
    }
}