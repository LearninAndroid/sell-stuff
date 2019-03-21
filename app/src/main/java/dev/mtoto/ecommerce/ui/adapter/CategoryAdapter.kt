package dev.mtoto.ecommerce.ui.adapter

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import dev.mtoto.ecommerce.R
import kotlinx.android.synthetic.main.category_row.view.*

class CategoryAdapter(private val categories: List<String>) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_row, parent, false)
        val holder = ViewHolder(view)

        view.setOnClickListener{
            Toast.makeText(parent.context, categories[holder.position],Toast.LENGTH_SHORT).show()

            
        }
        return holder
    }

    override fun getItemCount(): Int = categories.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.categoryName.text = categories[position]
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val categoryName: TextView = view.categoryName
    }
}