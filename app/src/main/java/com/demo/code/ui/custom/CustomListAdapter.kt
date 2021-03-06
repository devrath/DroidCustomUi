package com.demo.code.ui.custom

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.demo.code.R

class CustomListAdapter () : RecyclerView.Adapter<CustomListAdapter.ViewHolder>() {

    private val itemList = arrayOf("Russia","America","China","India","Germany","France")

    private var callback : Callback? = null

    interface Callback { fun onCustomItemSelected(position : Int, name : String) }

    fun setCallback(callback: Callback) { this.callback = callback }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        // Bind your data
        
        // Set click events
        viewHolder.itemView.setOnClickListener {
            callback?.onCustomItemSelected(position, itemList[position])
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_cust_view, parent, false))
    }

    override fun getItemCount(): Int { return itemList.size }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}