package com.lhyla.testsapp;

import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.robotium.solo.Solo;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class CalculatorViewTest {

    private Solo solo;
    @Rule
    public ActivityTestRule<CalculatorActivity> activityActivityTestRule =
            new ActivityTestRule<>(CalculatorActivity.class);

    @Before
    public void setUp() throws Exception {
        solo = new Solo(InstrumentationRegistry.getInstrumentation(), activityActivityTestRule.getActivity());
    }

    @After
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    @Test
    public void setEditText() {
        solo.assertCurrentActivity("Current Activity",
                CalculatorActivity.class);
        solo.enterText(0, "1");
        solo.enterText(1, "2");
        solo.clickOnButton(1);
    }

}
