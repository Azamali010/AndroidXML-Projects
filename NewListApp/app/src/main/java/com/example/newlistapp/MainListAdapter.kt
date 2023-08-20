package com.example.newlistapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import org.w3c.dom.Text


class MainListAdapter(private val context:Context, private val list:ArrayList<String>) : BaseAdapter() {
    var layoutInflater = LayoutInflater.from(context)
    public fun addNewItem(item:String) {
        list.add(item)
        this.notifyDataSetChanged()
    }

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): String {
        return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View? {
        var convertView = p1
        if(convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item,p2,false)
        }
        convertView?.findViewById<TextView>(R.id.txt_title)?.text = list[p0]
        return convertView
    }
 }