package com.lukmanhawi.moviecatalogue.detail;

import androidx.lifecycle.ViewModel;

import com.lukmanhawi.moviecatalogue.data.MovieEntity;
import com.lukmanhawi.moviecatalogue.utils.DataDummy;

import java.util.ArrayList;

public class DetailMovieViewModel extends ViewModel {
    private String movieId;

    public void setSelectedMovie(String movieId) {
        this.movieId = movieId;
    }

    public MovieEntity getDetailMovie() {
        MovieEntity movie = null;
        ArrayList<MovieEntity> movieEntities = DataDummy.generateDummyMovies();
        for (MovieEntity movieEntity : movieEntities) {
            if (movieEntity.getMovieId().equals(movieId)) {
                movie = movieEntity;
            }
        }
        return movie;
    }
}