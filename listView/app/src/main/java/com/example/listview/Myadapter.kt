package com.example.listview

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class Myadapter(private  val newsList:ArrayList<News>) : RecyclerView.Adapter<Myadapter.MyViewHolder> (){




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.text_item,parent,false)
        return MyViewHolder(item)
    }

    override fun getItemCount(): Int {
        return  newsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val cur_item = newsList[position]
        holder.titleImage.setImageResource(cur_item.titleImge)
        holder.tvtxt.text = cur_item.heading

    }

    class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val titleImage :ShapeableImageView = itemView.findViewById(R.id.shap_img)
        val tvtxt : TextView = itemView.findViewById(R.id.text_View)

    }
}