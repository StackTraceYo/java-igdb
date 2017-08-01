package org.stacktrace.yo.igdb.client.company;

public enum CompanyFields {

    ID("id"),
    NAME("name"),
    SLUG("slug"),
    URL("url"),
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at"),
    LOGO("logo"),
    DESCRIPTION("description"),
    COUNTRY("country"),
    WEBSITE("website"),
    START_DATE("start_date"),
    START_DATE_CATEGORY("start_date_category"),
    CHANGED_COMPANY_ID("change_company_id"),
    CHANGE_DATE("change_date"),
    CHANGE_DATE_CATEGORY("change_date_category"),
    TWITTER("twitter"),
    PUBLISHED("published"),
    DEVELOPED("developed"),
    GAMES("games"),
    ALL("*");

    private String urlFormat;

    CompanyFields(String fieldName) {
        this.urlFormat = fieldName;
    }

    public String getUrlFormat() {
        return urlFormat;
    }

    public void setUrlFormat(String urlFormat) {
        this.urlFormat = urlFormat;
    }
}
