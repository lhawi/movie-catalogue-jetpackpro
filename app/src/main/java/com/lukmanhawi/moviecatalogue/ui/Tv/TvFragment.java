package com.lukmanhawi.moviecatalogue.ui.Tv;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lukmanhawi.moviecatalogue.data.TvEntity;
import com.lukmanhawi.moviecatalogue.databinding.FragmentTvBinding;

import java.util.List;

public class TvFragment extends Fragment {

    private FragmentTvBinding fragmentTvBinding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fragmentTvBinding = FragmentTvBinding.inflate(inflater, container, false);
        return fragmentTvBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getActivity() != null) {
            TvViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(TvViewModel.class);
            List<TvEntity> tv = viewModel.getTv();
            TvAdapter tvAdapter = new TvAdapter();
            tvAdapter.setTv(tv);
            fragmentTvBinding.rvTv.setLayoutManager(new LinearLayoutManager(getContext()));
            fragmentTvBinding.rvTv.setHasFixedSize(true);
            fragmentTvBinding.rvTv.setAdapter(tvAdapter);
        }
    }
}