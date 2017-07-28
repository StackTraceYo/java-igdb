import com.mashape.unirest.http.exceptions.UnirestException;
import org.stacktrace.yo.igdb.client.IGDBClient;

/**
 * Created by Stacktraceyo on 7/28/17.
 */
public class Test {


    public static void main(String[] args) throws UnirestException {
        IGDBClient x = IGDBClient.getBuilder()
                .withKey("ea380a24711ad2e2ae60c63223371f03")
                .withUrl("https://api-2445582011268.apicast.io")
                .build();


    }

}
