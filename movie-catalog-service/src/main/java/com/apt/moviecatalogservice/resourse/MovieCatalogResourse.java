package com.apt.moviecatalogservice.resourse;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.apt.moviecatalogservice.models.CatalogItem;
import com.apt.moviecatalogservice.models.Movie;
import com.apt.moviecatalogservice.models.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResourse {
	
	    @Autowired
	    private RestTemplate restTemplate;

	    @Autowired
	    WebClient.Builder webClientBuilder;

	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId)
	{
		
		
		
		
		// UserRating userRating = restTemplate.getForObject("http://ratings-data-service/ratingsdata/user/" + userId, UserRating.class);
/*
	        return userRating.getRatings().stream()
	                .map(rating -> {
	                    Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
	                    return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating());
	                })
	                .collect(Collectors.toList());*/

		return Collections.singletonList( new CatalogItem("BigB","Super", 4));
             
             
	}

}
