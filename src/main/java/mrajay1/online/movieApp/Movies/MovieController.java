package mrajay1.online.movieApp.Movies;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @GetMapping
    public ResponseEntity<List<String>> getMovies() {
        return new ResponseEntity<List<String>>(List.of("Hello", "World",
                "One", "Two", "Three"),
                HttpStatus.OK);
    }
}
