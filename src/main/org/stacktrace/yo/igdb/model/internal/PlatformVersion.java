package org.stacktrace.yo.igdb.model.internal;

import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class PlatformVersion {

    private String url;
    private String name;
    private String slug;
    private String cpu;
    private String os;
    private String media;
    private String memory;
    private String online;
    private String output;
    private String storage;
    private String graphics;
    private String resolutions;
    private String connectivity;
    private Image logo;
    private String summary;
    List<PlatformVersionReleaseDate> realseDates;
    List<PlatformCompany> developers;
    List<PlatformCompany> manufacturers;

    public PlatformVersion() {
    }

    public String getUrl() {
        return url;
    }

    public PlatformVersion setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getName() {
        return name;
    }

    public PlatformVersion setName(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public PlatformVersion setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getCpu() {
        return cpu;
    }

    public PlatformVersion setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public String getOs() {
        return os;
    }

    public PlatformVersion setOs(String os) {
        this.os = os;
        return this;
    }

    public String getMedia() {
        return media;
    }

    public PlatformVersion setMedia(String media) {
        this.media = media;
        return this;
    }

    public String getMemory() {
        return memory;
    }

    public PlatformVersion setMemory(String memory) {
        this.memory = memory;
        return this;
    }

    public String getOnline() {
        return online;
    }

    public PlatformVersion setOnline(String online) {
        this.online = online;
        return this;
    }

    public String getOutput() {
        return output;
    }

    public PlatformVersion setOutput(String output) {
        this.output = output;
        return this;
    }

    public String getStorage() {
        return storage;
    }

    public PlatformVersion setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public String getGraphics() {
        return graphics;
    }

    public PlatformVersion setGraphics(String graphics) {
        this.graphics = graphics;
        return this;
    }

    public String getResolutions() {
        return resolutions;
    }

    public PlatformVersion setResolutions(String resolutions) {
        this.resolutions = resolutions;
        return this;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public PlatformVersion setConnectivity(String connectivity) {
        this.connectivity = connectivity;
        return this;
    }

    public Image getLogo() {
        return logo;
    }

    public PlatformVersion setLogo(Image logo) {
        this.logo = logo;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public PlatformVersion setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public List<PlatformVersionReleaseDate> getRealseDates() {
        return realseDates;
    }

    public PlatformVersion setRealseDates(List<PlatformVersionReleaseDate> realseDates) {
        this.realseDates = realseDates;
        return this;
    }

    public List<PlatformCompany> getDevelopers() {
        return developers;
    }

    public PlatformVersion setDevelopers(List<PlatformCompany> developers) {
        this.developers = developers;
        return this;
    }

    public List<PlatformCompany> getManufacturers() {
        return manufacturers;
    }

    public PlatformVersion setManufacturers(List<PlatformCompany> manufacturers) {
        this.manufacturers = manufacturers;
        return this;
    }
}
