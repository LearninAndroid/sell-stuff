package dev.mtoto.ecommerce.ui.home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.gson.Gson
import dev.mtoto.ecommerce.R
import dev.mtoto.ecommerce.model.Product
import dev.mtoto.ecommerce.ui.adapter.ProductAdapter
import kotlinx.android.synthetic.main.fragment_home.view.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.net.URL

class HomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false);
        doAsync {
            val json = URL("https://finepointmobile.com/data/products.json").readText()

            uiThread {
                val products = Gson().fromJson(json, Array<Product>::class.java).toList()
                root.recycler_view.apply {
                    layoutManager = GridLayoutManager(activity, 2)
                    adapter = ProductAdapter(products)
                }
            }
        }


        return root
    }
}