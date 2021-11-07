package com.example.projectofproductofdevices

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>()
{
    private var titles = arrayOf("Iphone12","Samsung Galaxy S21 Ultra","Xiaomi 11T Pro","Huawei Y6p","Samsung Galaxy Z Flip3")
private var details = arrayOf("price 4500SR", "price 4000SR","price 3000Sr","price 2000 SR","price 4000 SR")

    private var images = intArrayOf(R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])

    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var itemImage:ImageView
        var itemTitle:TextView
        var itemDetail:TextView
        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
        }
    }
}