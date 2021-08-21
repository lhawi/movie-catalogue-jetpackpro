package com.lukmanhawi.moviecatalogue.detail;

import androidx.lifecycle.ViewModel;

import com.lukmanhawi.moviecatalogue.data.TvEntity;
import com.lukmanhawi.moviecatalogue.utils.DataDummy;

import java.util.ArrayList;

public class DetailTvViewModel extends ViewModel {
    private String tvId;

    public void setSelectedTv(String tvId) {
        this.tvId = tvId;
    }

    public TvEntity getDetailTv() {
        TvEntity tv = null;
        ArrayList<TvEntity> tvEntities = DataDummy.generateDummyTv();
        for (TvEntity tvEntity : tvEntities) {
            if (tvEntity.getTvId().equals(tvId)) {
                tv = tvEntity;
            }
        }
        return tv;
    }
}