package br.com.luisfelipeas5.ditalk

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import br.com.luisfelipeas5.ditalk.database.MockDatabase
import br.com.luisfelipeas5.ditalk.di.BakerInjector
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BreadCounterActivityTest {

    private val activityTestRule: ActivityTestRule<BreadCounterActivity> = ActivityTestRule(
        BreadCounterActivity::class.java, true
    )

    private val mockDatabase = MockDatabase()
    private val bakerInjector = BakerInjector.getInstance()

    @Before
    fun runBeforeEveryTest() {
        bakerInjector.database = mockDatabase
    }

    @Test
    fun when_loggedIn_expect_number() {
        mockDatabase.tokenMocked = "token_mow_nada_a_ver_so_pra_mostrar_pra_galera_um_token"
        activityTestRule.launchActivity(Intent())

        onView(withId(R.id.tvCounter))
            .check(matches(
                withText(3.toString())
            ))
    }


    @Test
    fun when_notLoggedIn_expect_breadsIsEmpty() {
        mockDatabase.tokenMocked = null
        activityTestRule.launchActivity(Intent())

        onView(withId(R.id.tvCounter))
            .check(matches(
                withText(0.toString())
            ))
    }

}