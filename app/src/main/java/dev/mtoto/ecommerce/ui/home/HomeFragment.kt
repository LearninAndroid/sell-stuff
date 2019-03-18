package dev.mtoto.ecommerce.ui.home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.mtoto.ecommerce.R
import dev.mtoto.ecommerce.model.Product
import dev.mtoto.ecommerce.ui.adapter.ProductAdapter
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val products = arrayListOf<Product>()
        for (i in 0..100) {
            products.add(Product("Organic Juice $i", "http://via.placeholder.com/350/dddddd/000000", 18.99))
        }
        root.recycler_view.apply {
            layoutManager = GridLayoutManager(activity, 2)
            adapter = ProductAdapter(products)
        }
        return root
    }
}