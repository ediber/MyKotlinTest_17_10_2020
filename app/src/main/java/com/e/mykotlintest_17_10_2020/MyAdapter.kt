package com.e.mykotlintest_17_10_2020

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val f: (String) -> Int): RecyclerView.Adapter<MyAdapter.ViewHolder>(){


    var data = listOf<String>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater
            .inflate(R.layout.row, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.txt.text = item

        holder.parent.setOnClickListener(View.OnClickListener {
            f(item)
        })


    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val txt: TextView = itemView.findViewById(R.id.textView)
        val parent: View = itemView.findViewById(R.id.parent)
    }





}