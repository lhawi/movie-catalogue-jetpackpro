package com.lukmanhawi.moviecatalogue.ui.Tv;

import androidx.lifecycle.ViewModel;

import com.lukmanhawi.moviecatalogue.data.TvEntity;
import com.lukmanhawi.moviecatalogue.utils.DataDummy;

import java.util.List;

public class TvViewModel extends ViewModel {

    public List<TvEntity> getTv() {
        return DataDummy.generateDummyTv();
    }
}
