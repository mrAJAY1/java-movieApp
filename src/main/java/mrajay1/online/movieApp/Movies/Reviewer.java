package mrajay1.online.movieApp.Movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviewers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reviewer {
    private String reviewerName;
    private String reviewerEmail;

}
