package org.stacktrace.yo.igdb.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.stacktrace.yo.igdb.model.internal.*;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class Game implements IGDBModel {

    private Integer id;

    private String name;

    private String slug;

    private String url;

    @JsonProperty("created_at")
    private Long createdAt;

    @JsonProperty("updated_at")
    private Long updatedAt;

    private String summary;

    private String storyline;

    private Long collection;

    private Long franchise;

    private Integer hypes;

    private Double popularity;

    private Double rating;

    @JsonProperty("rating_count")
    private Integer ratingCount;

    @JsonProperty("aggregated_rating")
    private Double aggregatedRating;

    @JsonProperty("aggregated_rating_count")
    private Integer aggregatedRatingCount;

    @JsonProperty("total_rating")
    private Double totalRating;

    @JsonProperty("total_rating_count")
    private Integer totalRatingCount;

    private Long[] games;

    private Integer[] developers;

    private Integer[] publishers;

    @JsonProperty("game_engines")
    private Integer[] gameEngines;

    private Integer category;

    @JsonProperty("time_to_beat")
    private TimeToBeat timeToBeat;

    @JsonProperty("player_perspectives")
    private Integer[] playerPerspectives;

    @JsonProperty("game_modes")
    private Integer[] gameModes;

    private Integer[] keywords;

    private Integer[] themes;

    private Integer[] genres;

    @JsonProperty("first_release_date")
    private Long firstReleaseDate;

    private Integer status;

    @JsonProperty("release_dates")
    private GameReleaseDate[] releaseDates;

    @JsonProperty("alternative_names")
    private AlternativeName[] alternativeNames;

    @JsonProperty("screenshots")
    private Image[] screenShots;

    private Video[] videos;

    private Image cover;

    private ESRB esrb;

    private PEGI pegi;

    private Website[] websites;

    private Integer[] tags;

    @JsonProperty("pulse_count")
    private Integer pulseCount;

    public Game() {
    }

    public Integer getPulseCount() {
        return pulseCount;
    }

    public void setPulseCount(Integer pulseCount) {
        this.pulseCount = pulseCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getStoryline() {
        return storyline;
    }

    public void setStoryline(String storyline) {
        this.storyline = storyline;
    }

    public Long getCollection() {
        return collection;
    }

    public void setCollection(Long collection) {
        this.collection = collection;
    }

    public Long getFranchise() {
        return franchise;
    }

    public void setFranchise(Long franchise) {
        this.franchise = franchise;
    }

    public Integer getHypes() {
        return hypes;
    }

    public void setHypes(Integer hypes) {
        this.hypes = hypes;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }

    public Double getAggregatedRating() {
        return aggregatedRating;
    }

    public void setAggregatedRating(Double aggregatedRating) {
        this.aggregatedRating = aggregatedRating;
    }

    public Integer getAggregatedRatingCount() {
        return aggregatedRatingCount;
    }

    public void setAggregatedRatingCount(Integer aggregatedRatingCount) {
        this.aggregatedRatingCount = aggregatedRatingCount;
    }

    public Double getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(Double totalRating) {
        this.totalRating = totalRating;
    }

    public Integer getTotalRatingCount() {
        return totalRatingCount;
    }

    public void setTotalRatingCount(Integer totalRatingCount) {
        this.totalRatingCount = totalRatingCount;
    }

    public Long[] getGames() {
        return games;
    }

    public void setGames(Long[] game) {
        this.games = game;
    }

    public Integer[] getDevelopers() {
        return developers;
    }

    public void setDevelopers(Integer[] developers) {
        this.developers = developers;
    }

    public Integer[] getPublishers() {
        return publishers;
    }

    public void setPublishers(Integer[] publishers) {
        this.publishers = publishers;
    }

    public Integer[] getGameEngines() {
        return gameEngines;
    }

    public void setGameEngines(Integer[] gameEngines) {
        this.gameEngines = gameEngines;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public TimeToBeat getTimeToBeat() {
        return timeToBeat;
    }

    public void setTimeToBeat(TimeToBeat timeToBeat) {
        this.timeToBeat = timeToBeat;
    }

    public Integer[] getPlayerPerspectives() {
        return playerPerspectives;
    }

    public void setPlayerPerspectives(Integer[] playerPerspectives) {
        this.playerPerspectives = playerPerspectives;
    }

    public Integer[] getGameModes() {
        return gameModes;
    }

    public void setGameModes(Integer[] gameModes) {
        this.gameModes = gameModes;
    }

    public Integer[] getKeywords() {
        return keywords;
    }

    public void setKeywords(Integer[] keywords) {
        this.keywords = keywords;
    }

    public Integer[] getThemes() {
        return themes;
    }

    public void setThemes(Integer[] themes) {
        this.themes = themes;
    }

    public Integer[] getGenres() {
        return genres;
    }

    public void setGenres(Integer[] genres) {
        this.genres = genres;
    }

    public Long getFirstReleaseDate() {
        return firstReleaseDate;
    }

    public void setFirstReleaseDate(Long firstReleaseDate) {
        this.firstReleaseDate = firstReleaseDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public GameReleaseDate[] getReleaseDates() {
        return releaseDates;
    }

    public void setReleaseDates(GameReleaseDate[] releaseDates) {
        this.releaseDates = releaseDates;
    }

    public AlternativeName[] getAlternativeNames() {
        return alternativeNames;
    }

    public void setAlternativeNames(AlternativeName[] alternativeNames) {
        this.alternativeNames = alternativeNames;
    }

    public Image[] getScreenShots() {
        return screenShots;
    }

    public void setScreenShots(Image[] screenShots) {
        this.screenShots = screenShots;
    }

    public Video[] getVideos() {
        return videos;
    }

    public void setVideos(Video[] videos) {
        this.videos = videos;
    }

    public Image getCover() {
        return cover;
    }

    public void setCover(Image cover) {
        this.cover = cover;
    }

    public ESRB getEsrb() {
        return esrb;
    }

    public void setEsrb(ESRB esrb) {
        this.esrb = esrb;
    }

    public PEGI getPegi() {
        return pegi;
    }

    public void setPegi(PEGI pegi) {
        this.pegi = pegi;
    }

    public Website[] getWebsites() {
        return websites;
    }

    public void setWebsites(Website[] websites) {
        this.websites = websites;
    }

    public Integer[] getTags() {
        return tags;
    }

    public void setTags(Integer[] tags) {
        this.tags = tags;
    }
}
