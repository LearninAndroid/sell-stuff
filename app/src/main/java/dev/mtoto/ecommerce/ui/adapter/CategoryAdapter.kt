package dev.mtoto.ecommerce.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.mtoto.ecommerce.R

class CategoryAdapter(private val categories: List<String>) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_row,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int =  categories.size


    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

    }
}