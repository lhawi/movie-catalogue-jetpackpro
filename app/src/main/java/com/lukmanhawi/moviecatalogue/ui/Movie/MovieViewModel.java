package com.lukmanhawi.moviecatalogue.ui.Movie;

import androidx.lifecycle.ViewModel;

import com.lukmanhawi.moviecatalogue.data.MovieEntity;
import com.lukmanhawi.moviecatalogue.utils.DataDummy;

import java.util.List;

public class MovieViewModel extends ViewModel {

    public List<MovieEntity> getMovies() {
        return DataDummy.generateDummyMovies();
    }
}
