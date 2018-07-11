package com.example.yves.moviemanager;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.yves.moviemanager.activities.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.yves.moviemanager", appContext.getPackageName());
    }

    @Rule
    public ActivityTestRule<MainActivity> mActivityActivityTestRule = new ActivityTestRule<MainActivity>(
            MainActivity.class, true, true
    ){};

    // Change dependencies for test

//    @Test
//    public void validateRecyclerViewClickThirdElement() {
//        onView(withId(R.id.rvMovies)).perform(RecyclerViewActions.actionOnItemAtPosition(3, click()));
//    }
//
//    @Test
//    public void validateRecyclerViewClickSecondElement() {
//        onView(withId(R.id.rvMovies)).perform(RecyclerViewActions.actionOnItemAtPosition(2, click()));
//    }

}
