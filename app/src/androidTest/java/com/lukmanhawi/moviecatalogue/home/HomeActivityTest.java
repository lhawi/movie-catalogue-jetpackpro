package com.lukmanhawi.moviecatalogue.home;

import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.lukmanhawi.moviecatalogue.R;
import com.lukmanhawi.moviecatalogue.data.MovieEntity;
import com.lukmanhawi.moviecatalogue.data.TvEntity;
import com.lukmanhawi.moviecatalogue.utils.DataDummy;

import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;

public class HomeActivityTest {
    private ArrayList<MovieEntity> dummyMovies = DataDummy.generateDummyMovies();
    private ArrayList<TvEntity> dummyTv = DataDummy.generateDummyTv();

    @Rule
    public ActivityScenarioRule activityRule = new ActivityScenarioRule<>(HomeActivity.class);

    @Test
    public void loadMovies() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition(dummyMovies.size()));
    }

    @Test
    public void loadTv() {
        onView(withText("TV Series")).perform(click());
        onView(allOf(isDisplayed(), withId(R.id.rv_tv))).check(matches(isDisplayed()));
        onView(allOf(isDisplayed(), withId(R.id.rv_tv))).perform(RecyclerViewActions.scrollToPosition(dummyTv.size()));
    }

    @Test
    public void loadDetailMovie() {
        onView(allOf(isDisplayed(), withId(R.id.rv_movie))).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        onView(allOf(isDisplayed(), withId(R.id.text_title))).check(matches(isDisplayed()));
        onView(allOf(isDisplayed(), withId(R.id.text_title))).check(matches(withText(dummyMovies.get(0).getTitle())));
        onView(allOf(isDisplayed(), withId(R.id.text_date))).check(matches(isDisplayed()));
        onView(allOf(isDisplayed(), withId(R.id.text_date))).check(matches(withText(dummyMovies.get(0).getDate())));
        onView(allOf(isDisplayed(), withId(R.id.text_description))).check(matches(isDisplayed()));
        onView(allOf(isDisplayed(), withId(R.id.text_description))).check(matches(withText(dummyMovies.get(0).getDescription())));
    }

    @Test
    public void loadDetailTv() {
        onView(withText("TV Series")).perform(click());
        onView(allOf(isDisplayed(), withId(R.id.rv_tv))).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        onView(allOf(isDisplayed(), withId(R.id.text_ttitle))).check(matches(isDisplayed()));
        onView(allOf(isDisplayed(), withId(R.id.text_ttitle))).check(matches(withText(dummyTv.get(0).gettTitle())));
        onView(allOf(isDisplayed(), withId(R.id.text_tdate))).check(matches(isDisplayed()));
        onView(allOf(isDisplayed(), withId(R.id.text_tdate))).check(matches(withText(dummyTv.get(0).gettDate())));
        onView(allOf(isDisplayed(), withId(R.id.text_tdescription))).check(matches(isDisplayed()));
        onView(allOf(isDisplayed(), withId(R.id.text_tdescription))).check(matches(withText(dummyTv.get(0).gettDescription())));
    }

}