package io.javamovie.moviecatalogservice.models;

public class CatalogItem {

	private String name;
	private String desc;
	private int rating;
	private String movieId;
	
	public CatalogItem() {
		
	}
	
	public CatalogItem(String movieId, String name, String desc, int rating) {
		this.name = name;
		this.desc = desc;
		this.rating = rating;
		this.movieId = movieId;
	}
	
	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
}
