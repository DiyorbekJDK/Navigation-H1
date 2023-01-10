package com.diyorbek.navigation

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.viewpager2.widget.ViewPager2
import com.diyorbek.navigation.adapter.ViewPageAdapter
import com.diyorbek.navigation.adapter.ViewPageAdapterTwo
import com.zhpan.indicator.IndicatorView
import com.zhpan.indicator.enums.IndicatorSlideMode

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        supportActionBar?.hide()
        WindowInsetsControllerCompat(window, window.decorView)
            .hide(WindowInsetsCompat.Type.statusBars())
        val viewPage: ViewPager2 = findViewById(R.id.viewPager)
        val indicator: IndicatorView = findViewById(R.id.indicator)
        viewPage.adapter = ViewPageAdapterTwo(supportFragmentManager, lifecycle)
        indicator.apply {
            setSliderColor(Color.BLUE, Color.GREEN)
            setSliderWidth(20f)
            setSliderHeight(20f)
            setSlideMode(IndicatorSlideMode.SMOOTH)
            setPageSize(viewPage.adapter?.itemCount!!)
            notifyDataChanged()
        }
        indicator.setupWithViewPager(viewPage)
    }
}