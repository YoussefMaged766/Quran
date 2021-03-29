package com.example.quran

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class read_adapter( var items: List<String>) : RecyclerView.Adapter<read_adapter.viewholder>() {


    class viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            var sura_name: TextView = itemView.findViewById(R.id.sura_name)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.sura_item_recycler,parent,false)
        return viewholder(view)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        var  item : String = items.get(position)
        holder.sura_name.text = item

    }

    override fun getItemCount(): Int {
        return items.size
    }

}
