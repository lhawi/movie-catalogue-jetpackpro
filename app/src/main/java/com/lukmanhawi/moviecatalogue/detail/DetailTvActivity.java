package com.lukmanhawi.moviecatalogue.detail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.lukmanhawi.moviecatalogue.R;
import com.lukmanhawi.moviecatalogue.data.TvEntity;
import com.lukmanhawi.moviecatalogue.databinding.ActivityDetailTvBinding;
import com.lukmanhawi.moviecatalogue.databinding.ContentDetailTvBinding;

public class DetailTvActivity extends AppCompatActivity {

    private ContentDetailTvBinding detailContentBinding;
    public static final String EXTRA_TV = "extra_tv";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailTvBinding binding = ActivityDetailTvBinding.inflate(getLayoutInflater());
        detailContentBinding = binding.detailContent;

        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        DetailTvViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(DetailTvViewModel.class);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String courseId = extras.getString(EXTRA_TV);
            if (courseId != null) {
                viewModel.setSelectedTv(courseId);
                populateTv(viewModel.getDetailTv());
            }

        }

    }

    private void populateTv(TvEntity tvEntity) {
        detailContentBinding.textTtitle.setText(tvEntity.gettTitle());
        detailContentBinding.textTdescription.setText(tvEntity.gettDescription());
        detailContentBinding.textTdate.setText(tvEntity.gettDate());

        Glide.with(this)
                .load(tvEntity.gettImagePath())
                .transform(new RoundedCorners(20))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                .into(detailContentBinding.imagePoster);

    }
}