package mrajay1.online.movieApp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "movies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movies {
    @Id
    private ObjectId _id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
}
