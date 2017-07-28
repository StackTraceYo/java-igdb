package org.stacktrace.yo.igdb.model.internal;

public class PlatformCompany {

    private Integer company;
    private String comment;

    public PlatformCompany() {
    }

    public Integer getCompany() {
        return company;
    }

    public PlatformCompany setCompany(Integer company) {
        this.company = company;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public PlatformCompany setComment(String comment) {
        this.comment = comment;
        return this;
    }
}