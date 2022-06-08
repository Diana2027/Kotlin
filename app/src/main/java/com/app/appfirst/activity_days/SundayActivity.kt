package com.app.appfirst.activity_days

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.appfirst.R
import com.app.appfirst.activity_detail.DetailSundayActivity
import com.app.appfirst.activity_favorite.FavoriteSundayActivity
import com.app.appfirst.adapter_days.SundayAdapter
import com.app.appfirst.all_data.DataSunday

class SundayActivity : AppCompatActivity() {

    var data = DataSunday.initData()

    private val adapter by lazy {
        SundayAdapter(data, { item ->
            navigateToDetail(item)
        }, { index ->
            swapData(index)
        }, true)
    }

    companion object {
        val key = "SundayKey"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sunday)
        supportActionBar?.title = getString(R.string.app_name)
        initList()

        findViewById<SearchView>(R.id.et_search).setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(it: String?): Boolean {
                val query = it.toString()
                adapter.filter.filter(query)
                return false
            }
        })
    }

    // инициализацию списка на главном экране
    private fun initList() {
        val recyclerView: RecyclerView = findViewById<RecyclerView>(R.id.rv_main)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter
    }

    // при клике на добавить в избранное необходимо поменять isFavorite в определенном элементе списка и уведомить адаптер об этом
    private fun swapData(index: Int) {
        val itemClickedId = data[index].id
        val itemInList = data.first { data -> data.id == itemClickedId }
        itemInList.isFavorite = !itemInList.isFavorite
        adapter.notifyItemChanged(index)
    }

    // перенаправить на экран с деталями направления
    private fun navigateToDetail(item: DataSunday) {
        Intent(this, DetailSundayActivity::class.java).also {
            it.putExtra(DetailSundayActivity.key, item)
            startActivity(it)
        }
    }

    // перенаправить на экран Избранное
    fun onFavorite(view: View) {
        Intent(this, FavoriteSundayActivity::class.java).also {
            it.putExtra(FavoriteSundayActivity.key, data)
            startActivity(it)
        }
    }

    // перенаправить на экран Понедельник
    fun onMonday(view: View) {
        val toMonday = Intent(this, MondayActivity::class.java)
        startActivity(toMonday)
    }

    // перенаправить на экран Вторник
    fun onTuesday(view: View) {
        val toTuesday = Intent(this, TuesdayActivity::class.java)
        startActivity(toTuesday)
    }

    // перенаправить на экран Среда
    fun onWednesday(view: View) {
        val toWednesday = Intent(this, WednesdayActivity::class.java)
        startActivity(toWednesday)
    }

    // перенаправить на экран Четверг
    fun onThursday(view: View) {
        val toThursday = Intent(this, ThursdayActivity::class.java)
        startActivity(toThursday)
    }

    // перенаправить на экран Пятница
    fun onFriday(view: View) {
        val toFriday = Intent(this, FridayActivity::class.java)
        startActivity(toFriday)
    }

    // перенаправить на экран Суббота
    fun onSaturday(view: View) {
        val toSaturday = Intent(this, SaturdayActivity::class.java)
        startActivity(toSaturday)
    }
}