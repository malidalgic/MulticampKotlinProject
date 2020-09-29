package com.example.kotlinmulticamp.data

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.kotlinmulticamp.R
import com.example.kotlinmulticamp.data.model.Array
import kotlinx.android.synthetic.main.item_array.view.*
import kotlinx.android.synthetic.main.item_array.view.imageView


class ArrayAdapter(private val ArrayList: MutableList<Array>,
                   private val onClick: (Array) -> Unit
) :

    RecyclerView.Adapter<ArrayViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArrayViewHolder {
        return ArrayViewHolder(parent.inflate(R.layout.item_array))
    }

    override fun onBindViewHolder(holder: ArrayViewHolder, position: Int) {
        val camp = ArrayList[position]
        holder.bind(camp,onClick)
    }

    override fun getItemCount(): Int = ArrayList.size


}

class ArrayViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(array: Array, onClick: (Array) -> Unit) {
        itemView.imageView.load(array.banner)
        itemView.textViewName.text=array.name
        itemView.setOnClickListener {
            onClick(array)
        }
        }
    }
