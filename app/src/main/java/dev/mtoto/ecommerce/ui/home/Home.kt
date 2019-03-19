package dev.mtoto.ecommerce.ui.home

import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v7.app.AppCompatActivity;
import android.util.Log.d
import android.view.MenuItem
import dev.mtoto.ecommerce.R

import dev.mtoto.ecommerce.ui.products.jeans.JeansFragment
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.main.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)

        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, HomeFragment()).commit()

        navigation_view.setNavigationItemSelectedListener {
            it.isChecked = true
            drawerLayout.closeDrawers()
            when (it.itemId) {
                R.id.action_home -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frameLayout, HomeFragment())
                        .commit()
                }
                R.id.action_shorts -> d("kamau", "Shorts was pressed")
                R.id.action_jeans -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frameLayout, JeansFragment())
                        .commit()
                }
            }
            true
        }

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp)
        }

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        drawerLayout.openDrawer(GravityCompat.START)
        return super.onOptionsItemSelected(item)
    }
}
