package com.apt.moviecatalogservice.resourse;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.assertj.core.util.Arrays;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.apt.moviecatalogservice.models.CatalogItem;
import com.apt.moviecatalogservice.models.Movie;
import com.apt.moviecatalogservice.models.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResourse {
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId)
	{
		
		RestTemplate restTemplate =new RestTemplate();
		//Movie movie = restTmp.getForObject("http://localhost:8081/movies/foo", Movie.class);
		//get all rated movie IDs
		/*List<Rating> ratingsList = Arrays.asList(
                new Rating("1234", 3),
                new Rating("5678", 4)
        );*/
		//List<String> ratings = Rating.stream().map(x -> x.getName()).collect(Collectors.toList());
				
	/*	return ratings.stream()
                .map(rating -> {
                    Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + ratings.ge, Movie.class);
                    return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating());
                })
                .collect(Collectors.toList());*/
	    		
				
		
		// For each movie id  call movie info service and get details
		
		// Put all together
		
		return Collections.singletonList( new CatalogItem("BigB","Super", 4));
             
             
	}

}
