package com.app.appfirst.adapter_detail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.app.appfirst.all_data.DetailThursday
import com.app.appfirst.R

class DetailThursdayAdapter(private val data: ArrayList<DetailThursday>)
    : RecyclerView.Adapter<DetailThursdayAdapter.ViewHolder>() {

    inner class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        private val tvStation = view.findViewById<AppCompatTextView>(R.id.tv_station)
        private val tvTime = view.findViewById<AppCompatTextView>(R.id.tv_time)
        fun bind(detail: DetailThursday) {
            tvStation.text = detail.station
            tvTime.text = detail.time
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_detail, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size
}