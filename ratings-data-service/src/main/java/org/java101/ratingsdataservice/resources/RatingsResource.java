package org.java101.ratingsdataservice.resources;

import org.java101.ratingsdataservice.models.Rating;
import org.java101.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId,'5');
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId){

        List<Rating> ratings = Arrays.asList(
                new Rating("12",4),
                new Rating("57",5)
        );
        return new UserRating(ratings);
    }
}
