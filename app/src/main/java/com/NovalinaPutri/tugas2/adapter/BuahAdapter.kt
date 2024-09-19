package com.NovalinaPutri.tugas2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.NovalinaPutri.tugas2.R
import com.NovalinaPutri.tugas2.model.ModelBuah

class BuahAdapter(val itemList:ArrayList<ModelBuah>)
    : RecyclerView.Adapter<BuahAdapter.MyViewHolder>(){

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemText: TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar)
            itemText = itemView.findViewById(R.id.nama)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context).inflate(R.layout.item_custom_buah,
            parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemText.setText(itemList[position].judul)
    }
}
