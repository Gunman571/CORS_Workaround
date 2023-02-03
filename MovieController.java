package dev.myklos.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin // Allows access from all remote servers
public class MovieController {

    @Autowired
    private MovieService movieService;

    // Gets all movies and returns to the client
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {

        /*HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Access-Control-Allow-Origin", "*");

        return ResponseEntity.ok().headers(responseHeaders).body(movieService.allMovies());*/

        return new ResponseEntity<List<Movie>>(this.movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>>  getSingleMovie(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<Movie>>(this.movieService.singleMovie(imdbId), HttpStatus.OK);
    }
    // Get a single movie based on its id


}
