package com.lhyla.testsapp;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class EspressoCalculatorActivityTest {
    @Rule
    public ActivityTestRule<CalculatorActivity> espressoCalculatorActivityTestRule =
            new ActivityTestRule<>(CalculatorActivity.class);

    @Test
    public void firstAddBtnTest() {
        onView(withId(R.id.act_test_first_num_ET)).perform(typeText("500"), closeSoftKeyboard());
        onView(withId(R.id.act_test_second_num_ET)).perform(typeText("1000"), closeSoftKeyboard());
        onView(withId(R.id.act_test_add_BTN)).perform(click());
        onView(withId(R.id.act_test_result_TV)).check(matches(withText("1500")));
    }

    @Test
    public void firstMinusBtnTest() {
        onView(withId(R.id.act_test_first_num_ET)).perform(typeText("400"), closeSoftKeyboard());
        onView(withId(R.id.act_test_second_num_ET)).perform(typeText("200"), closeSoftKeyboard());
        onView(withId(R.id.act_test_minus_BTN)).perform(click());
        onView(withId(R.id.act_test_result_TV)).check(matches(withText("200")));
    }

    @Test
    public void firstMultiplicationBtnTest() {
        onView(withId(R.id.act_test_first_num_ET)).perform(typeText("400"), closeSoftKeyboard());
        onView(withId(R.id.act_test_second_num_ET)).perform(typeText("200"), closeSoftKeyboard());
        onView(withId(R.id.act_test_multiplication_BTN)).perform(click());
        onView(withId(R.id.act_test_result_TV)).check(matches(withText("80000")));
    }

    @Test
    public void secondMultiplicationBtnTest(){
        onView(withId(R.id.act_test_first_num_ET)).perform(typeText("-10"), closeSoftKeyboard());
        onView(withId(R.id.act_test_second_num_ET)).perform(typeText("-11"), closeSoftKeyboard());
        onView(withId(R.id.act_test_multiplication_BTN)).perform(click());
        onView(withId(R.id.act_test_result_TV)).check(matches(withText("110")));
    }

    @Test
    public void firstDivideBtnTest() {
        onView(withId(R.id.act_test_first_num_ET)).perform(typeText("400"), closeSoftKeyboard());
        onView(withId(R.id.act_test_second_num_ET)).perform(typeText("200"), closeSoftKeyboard());
        onView(withId(R.id.act_test_divide_BTN)).perform(click());
        onView(withId(R.id.act_test_result_TV)).check(matches(withText("2")));
    }

    @Test
    public void secondDivideBtnTest() {
        onView(withId(R.id.act_test_first_num_ET)).perform(typeText("-25"), closeSoftKeyboard());
        onView(withId(R.id.act_test_second_num_ET)).perform(typeText("10"), closeSoftKeyboard());
        onView(withId(R.id.act_test_divide_BTN)).perform(click());
        onView(withId(R.id.act_test_result_TV)).check(matches(withText("-2.5")));
    }
}
