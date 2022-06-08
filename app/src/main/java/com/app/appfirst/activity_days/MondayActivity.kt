package com.app.appfirst.activity_days

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.appfirst.R
import com.app.appfirst.activity_detail.DetailMondayActivity
import com.app.appfirst.activity_favorite.FavoriteMondayActivity
import com.app.appfirst.adapter_days.MondayAdapter
import com.app.appfirst.all_data.DataMonday

class MondayActivity : AppCompatActivity() {

    var data = DataMonday.initData()

    private val adapter by lazy {
        MondayAdapter(data, { item ->
            navigateToDetail(item)
        }, { index ->
            swapData(index)
       }, true)
    }

    companion object {
        val key = "MainKey"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monday)
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

    // инициализация списка на главном экране
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
    private fun navigateToDetail(item: DataMonday) {
        Intent(this, DetailMondayActivity::class.java).also {
            it.putExtra(DetailMondayActivity.key, item)
            startActivity(it)
        }
    }

    // перенаправить на экран Избранное
    fun onFavorite(view: View) {
        Intent(this, FavoriteMondayActivity::class.java).also {
            it.putExtra(FavoriteMondayActivity.key, data)
            startActivity(it)
        }
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

    // перенаправить на экран Воскресенье
    fun onSunday(view: View) {
        val toSunday = Intent(this, SundayActivity::class.java)
        startActivity(toSunday)
    }
}