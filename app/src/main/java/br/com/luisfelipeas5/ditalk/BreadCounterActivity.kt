package br.com.luisfelipeas5.ditalk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.luisfelipeas5.ditalk.bakery.Bakery
import br.com.luisfelipeas5.ditalk.di.BakerInjector
import kotlinx.android.synthetic.main.activity_breads.*

class BreadCounterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breads)

        val bakerInjector = BakerInjector.getInstance()
        val bakery = bakerInjector.getBakery()

        tvCounter.text = bakery.getBreads().size.toString()
    }
}
