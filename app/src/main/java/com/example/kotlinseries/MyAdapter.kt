package com.example.kotlinseries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private  val data: ArrayList<ItemViewModel>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemview,parent,false)

        return  ViewHolder(view);
    }

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        val  ItemViewModel = data[position]
        holder.imageView.setImageResource(ItemViewModel.image)
        holder.textview.text= ItemViewModel.text
    }

    override fun getItemCount(): Int {
        return  data.size
    }
    class ViewHolder (ItemView: View): RecyclerView.ViewHolder(ItemView){
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textview : TextView = itemView.findViewById(R.id.textView)

    }



}