package dev.mtoto.ecommerce.ui.home

import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager
import dev.mtoto.ecommerce.R
import dev.mtoto.ecommerce.ui.adapter.ProductAdapter

import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.content_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)

        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@Home)
            adapter = ProductAdapter()
        }
    }

}
