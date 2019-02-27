package dev.mtoto.ecommerce.ui.home
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager
import dev.mtoto.ecommerce.R
import dev.mtoto.ecommerce.model.Product
import dev.mtoto.ecommerce.ui.adapter.ProductAdapter
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.content_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)

        val products = arrayListOf<Product>()

        for(i in 0..100){
            products.add(Product("Organic Juice","http://via.placeholder.com/350/dddddd/000000",18.99))
        }
        recycler_view.apply {
            layoutManager = GridLayoutManager(this@Home,2)
            adapter = ProductAdapter(products)
        }

    }

}
