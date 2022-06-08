package com.app.appfirst.activity_favorite

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.appfirst.R
import com.app.appfirst.activity_days.*
import com.app.appfirst.activity_detail.DetailTuesdayActivity
import com.app.appfirst.adapter_days.TuesdayAdapter
import com.app.appfirst.all_data.DataTuesday

class FavoriteTuesdayActivity : AppCompatActivity() {

    companion object {
        val key = "favoriteTuesdayKey"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuesday_favorite)
        supportActionBar?.title = "Избранное"
        intent.getParcelableArrayListExtra<DataTuesday>(key)?.let { initList(it) }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
    }

    // инициализация списка. Если список избранных пустой, отобразить текст
    private fun initList(list: ArrayList<DataTuesday>) {
        val favoriteList = list.filter { item -> item.isFavorite }
        if (favoriteList.isEmpty()) {
            findViewById<AppCompatTextView>(R.id.tv_empty).visibility = View.VISIBLE
        } else {
            val recyclerView: RecyclerView = findViewById<RecyclerView>(R.id.rv_favorite)
            recyclerView.layoutManager =
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            recyclerView.adapter = TuesdayAdapter(favoriteList as ArrayList<DataTuesday>, {
                navigateToDetail(it)
            }, {}, false)
        }
    }

    private fun navigateToDetail(item: DataTuesday) {
        Intent(this, DetailTuesdayActivity::class.java).also {
            it.putExtra(DetailTuesdayActivity.key, item)
            startActivity(it)
        }
    }

    fun onBack(view: View): Boolean {
        onBackPressed()
        return true
    }

    // перенаправить на экран Понедельник
    fun onMonday(view: View) {
        val toMonday = Intent(this, MondayActivity::class.java)
        startActivity(toMonday)
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