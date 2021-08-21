package com.lukmanhawi.moviecatalogue.detail;

import com.lukmanhawi.moviecatalogue.data.MovieEntity;
import com.lukmanhawi.moviecatalogue.utils.DataDummy;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DetailMovieViewModelTest {
    private DetailMovieViewModel viewModel;
    private MovieEntity dummyCourse = DataDummy.generateDummyMovies().get(0);
    private String movieId = dummyCourse.getMovieId();

    @Before
    public void setUp() {
        viewModel = new DetailMovieViewModel();
        viewModel.setSelectedMovie(movieId);
    }

    @Test
    public void getMovie() {
        viewModel.setSelectedMovie(dummyCourse.getMovieId());
        MovieEntity movieEntity = viewModel.getDetailMovie();
        assertNotNull(movieEntity);
        assertEquals(dummyCourse.getMovieId(), movieEntity.getMovieId());
        assertEquals(dummyCourse.getDate(), movieEntity.getDate());
        assertEquals(dummyCourse.getDescription(), movieEntity.getDescription());
        assertEquals(dummyCourse.getImagePath(), movieEntity.getImagePath());
        assertEquals(dummyCourse.getTitle(), movieEntity.getTitle());
    }
}