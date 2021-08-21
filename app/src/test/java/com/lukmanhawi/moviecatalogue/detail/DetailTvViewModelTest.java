package com.lukmanhawi.moviecatalogue.detail;

import com.lukmanhawi.moviecatalogue.data.MovieEntity;
import com.lukmanhawi.moviecatalogue.data.TvEntity;
import com.lukmanhawi.moviecatalogue.utils.DataDummy;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DetailTvViewModelTest {
    private DetailTvViewModel viewModel;
    private TvEntity dummyCourse = DataDummy.generateDummyTv().get(0);
    private String movieId = dummyCourse.getTvId();

    @Before
    public void setUp() {
        viewModel = new DetailTvViewModel();
        viewModel.setSelectedTv(movieId);
    }

    @Test
    public void getMovie() {
        viewModel.setSelectedTv(dummyCourse.getTvId());
        TvEntity tvEntity = viewModel.getDetailTv();
        assertNotNull(tvEntity);
        assertEquals(dummyCourse.getTvId(), tvEntity.getTvId());
        assertEquals(dummyCourse.gettDate(), tvEntity.gettDate());
        assertEquals(dummyCourse.gettDescription(), tvEntity.gettDescription());
        assertEquals(dummyCourse.gettImagePath(), tvEntity.gettImagePath());
        assertEquals(dummyCourse.gettTitle(), tvEntity.gettTitle());
    }
}