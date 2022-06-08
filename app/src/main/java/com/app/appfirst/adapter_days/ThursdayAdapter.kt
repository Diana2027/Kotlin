package com.app.appfirst.adapter_days

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.AppCompatImageButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.app.appfirst.R
import com.app.appfirst.all_data.DataThursday

import java.util.*
import kotlin.collections.ArrayList

class ThursdayAdapter(private val data: ArrayList<DataThursday>,
                      val onClick:(item: DataThursday) -> Unit,
                      val onFavoriteClick:(index: Int) -> Unit, val isMainPage: Boolean)
    : RecyclerView.Adapter<ThursdayAdapter.ViewHolder>(), Filterable {

    private var dataFiltered: ArrayList<DataThursday> = ArrayList()

    init {
        dataFiltered = data
    }

    inner class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        private val tvFullWay = view.findViewById<AppCompatTextView>(R.id.tv_full_way)
        val ibFavorite = view.findViewById<AppCompatImageButton>(R.id.ib_favorite)
        fun bind(data: DataThursday) {
            tvFullWay.text = data.fullWay
            if (isMainPage) {
                if (data.isFavorite) {
                    ibFavorite.setImageDrawable(
                        AppCompatResources.getDrawable(
                            view.context,
                            R.drawable.ic_baseline_star_25
                        )
                    )
                } else {
                    ibFavorite.setImageDrawable(
                        AppCompatResources.getDrawable(
                            view.context,
                            R.drawable.ic_baseline_star_border_24
                        )
                    )
                }
            } else {
                ibFavorite.visibility = View.GONE
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataFiltered[position]
        holder.bind(item)
        holder.itemView.setOnClickListener {
            onClick.invoke(item)
        }
        holder.ibFavorite.setOnClickListener {
            onFavoriteClick.invoke(position)
        }
    }

    override fun getItemCount() = dataFiltered.size

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(charSequence: CharSequence?): FilterResults {
                val charSearch = charSequence.toString()
                if (charSearch.isEmpty()) {
                    dataFiltered = data
                } else {
                    val resultList = ArrayList<DataThursday>()
                    for (row in data) {
                        if (row.fullWay.lowercase(Locale.ROOT).contains(charSearch.lowercase(Locale.ROOT))) {
                            resultList.add(row)
                        }
                    }
                    dataFiltered = resultList
                }
                val filterResults = FilterResults()
                filterResults.values = dataFiltered
                return filterResults
            }
            override fun publishResults(p0: CharSequence?, results: FilterResults?) {
                dataFiltered = results?.values as ArrayList<DataThursday>
                notifyDataSetChanged()
            }
        }
    }
}