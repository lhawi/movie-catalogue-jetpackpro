package com.lukmanhawi.moviecatalogue.ui.Tv;

import com.lukmanhawi.moviecatalogue.data.MovieEntity;
import com.lukmanhawi.moviecatalogue.data.TvEntity;
import com.lukmanhawi.moviecatalogue.ui.Movie.MovieViewModel;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TvViewModelTest {
    private TvViewModel viewModel;

    @Before
    public void setUp() {
        viewModel = new TvViewModel();
    }

    @Test
    public void getCourses() {
        List<TvEntity> courseEntities = viewModel.getTv();
        assertNotNull(courseEntities);
        assertEquals(10, courseEntities.size());
    }
}