package dev.mtoto.ecommerce.ui.products

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import com.squareup.picasso.Picasso
import dev.mtoto.ecommerce.R
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        val title = intent.getStringExtra("title")
        val photo_url = intent.getStringExtra("photo_url")
        product_name.text = title
        Picasso.get().load(photo_url).into(photo)
        action_availability.setOnClickListener {
            AlertDialog.Builder(this)
                .setMessage("Hey, $title is in Stock!")
                .setPositiveButton("OK") { p0, p1 ->

                }
                .create()
                .show()
        }
    }
}
