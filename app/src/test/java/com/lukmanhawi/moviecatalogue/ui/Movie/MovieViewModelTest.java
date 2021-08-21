package com.lukmanhawi.moviecatalogue.ui.Movie;

import com.lukmanhawi.moviecatalogue.data.MovieEntity;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MovieViewModelTest {
    private MovieViewModel viewModel;

    @Before
    public void setUp() {
        viewModel = new MovieViewModel();
    }

    @Test
    public void getCourses() {
        List<MovieEntity> courseEntities = viewModel.getMovies();
        assertNotNull(courseEntities);
        assertEquals(10, courseEntities.size());
    }
}