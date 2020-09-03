package io.javamovie.moviecatalogservice.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javamovie.moviecatalogservice.models.CatalogItem;
import io.javamovie.moviecatalogservice.models.Movie;
import io.javamovie.moviecatalogservice.models.Rating;
import io.javamovie.moviecatalogservice.models.UserRating;
import io.javamovie.moviecatalogservice.services.MovieInfo;
import io.javamovie.moviecatalogservice.services.UserRatingInfo;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	MovieInfo movieInfo;
	
	@Autowired
	UserRatingInfo userRatingInfo;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		
		UserRating ratings = userRatingInfo.getUserRating(userId);
		
		return ratings.getUserRating().stream().map(rating -> movieInfo.getCatalogItem(rating))
				.collect(Collectors.toList());
	}
}
