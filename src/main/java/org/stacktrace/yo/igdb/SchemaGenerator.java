package org.stacktrace.yo.igdb;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;
import org.stacktrace.yo.igdb.model.Character;
import org.stacktrace.yo.igdb.model.Collection;
import org.stacktrace.yo.igdb.model.Company;
import org.stacktrace.yo.igdb.model.Feed;
import org.stacktrace.yo.igdb.model.Franchise;
import org.stacktrace.yo.igdb.model.Game;
import org.stacktrace.yo.igdb.model.GameEngine;
import org.stacktrace.yo.igdb.model.GameMode;
import org.stacktrace.yo.igdb.model.Genre;
import org.stacktrace.yo.igdb.model.Keyword;
import org.stacktrace.yo.igdb.model.Page;
import org.stacktrace.yo.igdb.model.Person;
import org.stacktrace.yo.igdb.model.Platform;
import org.stacktrace.yo.igdb.model.PlayerPerspective;
import org.stacktrace.yo.igdb.model.Pulse;
import org.stacktrace.yo.igdb.model.PulseGroup;
import org.stacktrace.yo.igdb.model.PulseSource;
import org.stacktrace.yo.igdb.model.ReleaseDate;
import org.stacktrace.yo.igdb.model.Review;
import org.stacktrace.yo.igdb.model.Theme;
import org.stacktrace.yo.igdb.model.internal.AlternativeName;
import org.stacktrace.yo.igdb.model.internal.ESRB;
import org.stacktrace.yo.igdb.model.internal.GameReleaseDate;
import org.stacktrace.yo.igdb.model.internal.Image;
import org.stacktrace.yo.igdb.model.internal.PEGI;
import org.stacktrace.yo.igdb.model.internal.PlatformCompany;
import org.stacktrace.yo.igdb.model.internal.PlatformVersion;
import org.stacktrace.yo.igdb.model.internal.PlatformVersionReleaseDate;
import org.stacktrace.yo.igdb.model.internal.TimeToBeat;
import org.stacktrace.yo.igdb.model.internal.Video;
import org.stacktrace.yo.igdb.model.internal.Website;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Stacktraceyo on 8/17/17.
 */
public class SchemaGenerator {


    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Class> classes = Arrays.asList(
                Character.class,
                Collection.class,
                Company.class,
                Feed.class,
                Franchise.class,
                Game.class,
                GameEngine.class,
                GameMode.class,
                Genre.class,
                Keyword.class,
                Page.class,
                Person.class,
                Platform.class,
                PlayerPerspective.class,
                Pulse.class,
                PulseGroup.class,
                PulseSource.class,
                ReleaseDate.class,
                Review.class,
                Theme.class,
                AlternativeName.class,
                ESRB.class,
                GameReleaseDate.class,
                Image.class,
                PEGI.class,
                PlatformCompany.class,
                PlatformVersion.class,
                PlatformVersionReleaseDate.class,
                TimeToBeat.class,
                Video.class,
                Website.class

        );
        classes.forEach(klass -> {
            JsonSchema jsonSchema = null;
            try {
                SchemaFactoryWrapper visitor = new SchemaFactoryWrapper();
                mapper.acceptJsonFormatVisitor(klass, visitor);
                JsonSchema schema = visitor.finalSchema();
                mapper.writeValue(new File(klass.getName()), schema.asStringSchema());
                System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(schema));
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (JsonGenerationException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(klass.getName() + " " + "finished");
        });

    }
}
