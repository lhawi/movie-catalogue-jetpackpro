package com.lukmanhawi.moviecatalogue.detail;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import androidx.appcompat.app.AppCompatActivity;

import androidx.lifecycle.ViewModelProvider;

import com.lukmanhawi.moviecatalogue.R;
import com.lukmanhawi.moviecatalogue.data.MovieEntity;
import com.lukmanhawi.moviecatalogue.databinding.ActivityDetailMovieBinding;
import com.lukmanhawi.moviecatalogue.databinding.ContentDetailMovieBinding;

public class DetailMovieActivity extends AppCompatActivity {

    private ContentDetailMovieBinding detailContentBinding;
    public static final String EXTRA_MOVIE = "extra_movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDetailMovieBinding activityDetailCourseBinding = ActivityDetailMovieBinding.inflate(getLayoutInflater());
        detailContentBinding = activityDetailCourseBinding.detailContent;

        setContentView(activityDetailCourseBinding.getRoot());

        setSupportActionBar(activityDetailCourseBinding.toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        DetailMovieViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(DetailMovieViewModel.class);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String courseId = extras.getString(EXTRA_MOVIE);
            if (courseId != null) {
                viewModel.setSelectedMovie(courseId);
                populateMovie(viewModel.getDetailMovie());
            }
        }

    }

    private void populateMovie(MovieEntity movieEntity) {
        detailContentBinding.textTitle.setText(movieEntity.getTitle());
        detailContentBinding.textDescription.setText(movieEntity.getDescription());
        detailContentBinding.textDate.setText(movieEntity.getDate());

        Glide.with(this)
                .load(movieEntity.getImagePath())
                .transform(new RoundedCorners(20))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                .into(detailContentBinding.imagePoster);

    }
}