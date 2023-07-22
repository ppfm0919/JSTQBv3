package com.example.jstqbv3;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class ApptestV1UITest {

    @Rule
    public ActivityScenarioRule<TOP_screen> activityScenarioRule = new ActivityScenarioRule<>(TOP_screen.class);


    @Test
    public void testQuizTitleText() {
   // TOP画面のテキストとボタンをアサートする
        onView(withId(R.id.title)).check(matches(withText("JSTQB QuizApp")));
        // ボタンをクリックして次のアクティビティに遷移する
        onView(withId(R.id.startbtn)).check(matches(withText("開始する")));
    }

    @Test
    public void testQuizLabelText() {
        // ボタンをクリックして次のアクティビティに遷移する
        onView(withId(R.id.startbtn)).perform(click());

        // 次のアクティビティで"Q1"のテキストをアサートする
        onView(withId(R.id.countLabel)).check(matches(withText("Q1")));
    }

    @Test
    public void testAnswerWorkAndResultText() {
        // ボタンをクリックして次のアクティビティに遷移する
        onView(withId(R.id.startbtn)).perform(click());

        // 回答1をクリックして結果を確認する
        onView(withId(R.id.answerBtn1)).perform(click());
        onView(withText("OK")).check(matches(isDisplayed()));
        onView(withText("OK")).perform(click());

        // 回答2をクリックして結果を確認する
        onView(withId(R.id.answerBtn2)).perform(click());
        onView(withText("OK")).check(matches(isDisplayed()));
        onView(withText("OK")).perform(click());

        // 回答3をクリックして結果を確認する
        onView(withId(R.id.answerBtn3)).perform(click());
        onView(withText("OK")).check(matches(isDisplayed()));
        onView(withText("OK")).perform(click());

        // 回答4をクリックして結果を確認する
        onView(withId(R.id.answerBtn4)).perform(click());
        onView(withText("OK")).check(matches(isDisplayed()));
        onView(withText("OK")).perform(click());

        // 結果のテキストをアサートする
        onView(withId(R.id.resultTitle)).check(matches(withText("結果")));
    }
}

