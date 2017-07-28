package org.stacktrace.yo.igdb.model;

import org.stacktrace.yo.igdb.model.internal.AlternativeName;
import org.stacktrace.yo.igdb.model.internal.ESRB;
import org.stacktrace.yo.igdb.model.internal.GameReleaseDate;
import org.stacktrace.yo.igdb.model.internal.Image;
import org.stacktrace.yo.igdb.model.internal.PEGI;
import org.stacktrace.yo.igdb.model.internal.TimeToBeat;
import org.stacktrace.yo.igdb.model.internal.Video;
import org.stacktrace.yo.igdb.model.internal.Website;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class Game implements IGDBModel {

    private Integer id;
    private String name;
    private String slug;
    private String url;
    private Integer createdAt;
    private Integer updatedAt;
    private String summary;
    private String storyline;
    private Integer collection;
    private Integer franchise;
    private Integer hypes;
    private Double popularity;
    private Double rating;
    private Integer ratingCount;
    private Double aggregatedRating;
    private Integer aggregatedRatingCount;
    private Double totalRating;
    private Integer totalRatingCount;
    private Integer game;
    private Integer[] developers;
    private Integer[] publishers;
    private Integer[] gameEngines;
    private Integer category;
    private TimeToBeat timeToBeat;
    private Integer[] playerPerspectives;
    private Integer[] gameModes;
    private Integer[] keywords;
    private Integer[] themes;
    private Integer[] genres;
    private Integer firstReleaseDate;
    private Integer status;
    private GameReleaseDate[] releaseDates;
    private AlternativeName[] alternativeNames;
    private Image[] screenShots;
    private Video[] videos;
    private Image[] cover;
    private ESRB esrb;
    private PEGI pegi;
    private Website[] websites;
    private Integer[] tags;

    public Game() {
    }

    public Integer getId() {
        return id;
    }

    public Game setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Game setName(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public Game setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Game setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public Game setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public Game setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public Game setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public String getStoryline() {
        return storyline;
    }

    public Game setStoryline(String storyline) {
        this.storyline = storyline;
        return this;
    }

    public Integer getCollection() {
        return collection;
    }

    public Game setCollection(Integer collection) {
        this.collection = collection;
        return this;
    }

    public Integer getFranchise() {
        return franchise;
    }

    public Game setFranchise(Integer franchise) {
        this.franchise = franchise;
        return this;
    }

    public Integer getHypes() {
        return hypes;
    }

    public Game setHypes(Integer hypes) {
        this.hypes = hypes;
        return this;
    }

    public Double getPopularity() {
        return popularity;
    }

    public Game setPopularity(Double popularity) {
        this.popularity = popularity;
        return this;
    }

    public Double getRating() {
        return rating;
    }

    public Game setRating(Double rating) {
        this.rating = rating;
        return this;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    public Game setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
        return this;
    }

    public Double getAggregatedRating() {
        return aggregatedRating;
    }

    public Game setAggregatedRating(Double aggregatedRating) {
        this.aggregatedRating = aggregatedRating;
        return this;
    }

    public Integer getAggregatedRatingCount() {
        return aggregatedRatingCount;
    }

    public Game setAggregatedRatingCount(Integer aggregatedRatingCount) {
        this.aggregatedRatingCount = aggregatedRatingCount;
        return this;
    }

    public Double getTotalRating() {
        return totalRating;
    }

    public Game setTotalRating(Double totalRating) {
        this.totalRating = totalRating;
        return this;
    }

    public Integer getTotalRatingCount() {
        return totalRatingCount;
    }

    public Game setTotalRatingCount(Integer totalRatingCount) {
        this.totalRatingCount = totalRatingCount;
        return this;
    }

    public Integer getGame() {
        return game;
    }

    public Game setGame(Integer game) {
        this.game = game;
        return this;
    }

    public Integer[] getDevelopers() {
        return developers;
    }

    public Game setDevelopers(Integer[] developers) {
        this.developers = developers;
        return this;
    }

    public Integer[] getPublishers() {
        return publishers;
    }

    public Game setPublishers(Integer[] publishers) {
        this.publishers = publishers;
        return this;
    }

    public Integer[] getGameEngines() {
        return gameEngines;
    }

    public Game setGameEngines(Integer[] gameEngines) {
        this.gameEngines = gameEngines;
        return this;
    }

    public Integer getCategory() {
        return category;
    }

    public Game setCategory(Integer category) {
        this.category = category;
        return this;
    }

    public TimeToBeat getTimeToBeat() {
        return timeToBeat;
    }

    public Game setTimeToBeat(TimeToBeat timeToBeat) {
        this.timeToBeat = timeToBeat;
        return this;
    }

    public Integer[] getPlayerPerspectives() {
        return playerPerspectives;
    }

    public Game setPlayerPerspectives(Integer[] playerPerspectives) {
        this.playerPerspectives = playerPerspectives;
        return this;
    }

    public Integer[] getGameModes() {
        return gameModes;
    }

    public Game setGameModes(Integer[] gameModes) {
        this.gameModes = gameModes;
        return this;
    }

    public Integer[] getKeywords() {
        return keywords;
    }

    public Game setKeywords(Integer[] keywords) {
        this.keywords = keywords;
        return this;
    }

    public Integer[] getThemes() {
        return themes;
    }

    public Game setThemes(Integer[] themes) {
        this.themes = themes;
        return this;
    }

    public Integer[] getGenres() {
        return genres;
    }

    public Game setGenres(Integer[] genres) {
        this.genres = genres;
        return this;
    }

    public Integer getFirstReleaseDate() {
        return firstReleaseDate;
    }

    public Game setFirstReleaseDate(Integer firstReleaseDate) {
        this.firstReleaseDate = firstReleaseDate;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public Game setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public GameReleaseDate[] getReleaseDates() {
        return releaseDates;
    }

    public Game setReleaseDates(GameReleaseDate[] releaseDates) {
        this.releaseDates = releaseDates;
        return this;
    }

    public AlternativeName[] getAlternativeNames() {
        return alternativeNames;
    }

    public Game setAlternativeNames(AlternativeName[] alternativeNames) {
        this.alternativeNames = alternativeNames;
        return this;
    }

    public Image[] getScreenShots() {
        return screenShots;
    }

    public Game setScreenShots(Image[] screenShots) {
        this.screenShots = screenShots;
        return this;
    }

    public Video[] getVideos() {
        return videos;
    }

    public Game setVideos(Video[] videos) {
        this.videos = videos;
        return this;
    }

    public Image[] getCover() {
        return cover;
    }

    public Game setCover(Image[] cover) {
        this.cover = cover;
        return this;
    }

    public ESRB getEsrb() {
        return esrb;
    }

    public Game setEsrb(ESRB esrb) {
        this.esrb = esrb;
        return this;
    }

    public PEGI getPegi() {
        return pegi;
    }

    public Game setPegi(PEGI pegi) {
        this.pegi = pegi;
        return this;
    }
}
