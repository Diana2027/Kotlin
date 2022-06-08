package com.app.appfirst.activity_detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.appfirst.R
import com.app.appfirst.activity_days.*
import com.app.appfirst.adapter_detail.DetailMondayAdapter
import com.app.appfirst.all_data.DataMonday
import com.app.appfirst.all_data.Detail

class DetailMondayActivity : AppCompatActivity() {

    companion object {
        val key = "detailKey"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monday_detail)
        val data = intent.getParcelableExtra<DataMonday>(key)
        val fullWay = data?.fullWay
        supportActionBar?.title = data?.fullWay
        findViewById<AppCompatTextView>(R.id.title_fullWay).text = "$fullWay"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        initList(data?.detail)

    }

    private fun initList(detail: List<Detail>?) {
        val recyclerView: RecyclerView = findViewById<RecyclerView>(R.id.rv_detail)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        detail?.let { recyclerView.adapter = DetailMondayAdapter(it as ArrayList) }
    }

    // прослушиватель нажатия кнопки назад
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home) {
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    fun onBack(view: View): Boolean {
        onBackPressed()
        return true
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