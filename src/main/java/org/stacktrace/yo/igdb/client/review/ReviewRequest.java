package org.stacktrace.yo.igdb.client.review;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;
import org.stacktrace.yo.igdb.client.core.IGDBClientRequester;
import org.stacktrace.yo.igdb.model.Review;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class ReviewRequest extends IGDBClientRequester<Review, ReviewRequest, ReviewFilter, ReviewFields> {


    public ReviewRequest(IGDBClient client) {
        super(client);
    }

    @Override
    public String getBasePath() {
        return "reviews/";
    }

    public List<Review> go() throws UnirestException {
        return Arrays.asList(client.makeRequest(buildUrl())
                .asObject(Review[].class)
                .getBody());
    }

    @Override
    public String getFieldValue(ReviewFields field) {
        return field.getUrlFormat();
    }
}
