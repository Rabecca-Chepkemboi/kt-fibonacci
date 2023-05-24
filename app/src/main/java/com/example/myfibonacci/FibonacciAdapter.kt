package com.example.myfibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class FibonacciAdapter(private val fibonacciList: List<Int>): RecyclerView.Adapter<FibonacciAdapter>.ViewHolder() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTextView: TextView = itemView.findViewById(android.R.id.text1)
    }

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
        return ViewHolder(view)
    }

    fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTextView.text = fibonacciList[position].toString()
    }

    fun getItemCount(): Int {
        return fibonacciList.size
    }
}
