package com.app.appfirst.all_data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataSaturday(
    val id: Int,
    val fullWay: String,
    var isFavorite: Boolean,
    val detail: List<DetailSaturday>
): Parcelable {
    companion object {
        fun initData() =
            arrayListOf(
                DataSaturday(1,
                    "Москва — Баку",
                    false,
                    arrayListOf(
                        DetailSaturday(
                            "Внуково",
                            "09:45 — 14:05"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "11:00 — 15:40"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "11:00 — 15:30"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "13:50 — 17:40"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "14:25 — 19:05"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "19:40 — 23:40"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "21:10 — 01:50"
                        )
                    )
                ),
                DataSaturday(2,
                    "Москва — Душанбе",
                    false,
                    arrayListOf(
                        DetailSaturday(
                            "Жуковский",
                            "02:15 — 08:25"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "05:00 — 11:20"
                        ),
                        DetailSaturday(
                            "Жуковский",
                            "10:00 — 16:10"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "11:45 — 17:45"
                        ),
                        DetailSaturday(
                            "Жуковский",
                            "13:15 — 19:25"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "18:00 — 23:55"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "22:15 — 04:30"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "23:20 — 05:10"
                        )
                    )
                ),
                DataSaturday(3,
                    "Москва — Екатеринбург",
                    false,
                    arrayListOf(
                        DetailSaturday(
                            "Шереметьево",
                            "01:55 — 06:25"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "06:45 — 11:10"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "08:25 — 12:45"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "08:30 — 12:55"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "09:25 — 13:55"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "10:00 — 14:20"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "11:55 — 16:15"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "13:25 — 17:50"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "13:35 — 17:55"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "15:20 — 19:50"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "15:55 — 20:15"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "17:35 — 22:00"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "17:45 — 22:05"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "19:05 — 23:40"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "20:35 — 00:55"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "21:30 — 01:55"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "22:00 — 02:20"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "22:30 — 02:55"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "23:45 — 04:05"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "23:45 — 04:10"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "23:50 — 04:20"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "23:55 — 04:20"
                        )
                    )
                ),
                DataSaturday(4,
                    "Москва — Ереван",
                    false,
                    arrayListOf(
                        DetailSaturday(
                            "Шереметьево",
                            "00:10 — 05:20"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "03:00 — 07:30"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "07:00 — 11:45"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "07:35 — 12:40"
                        ),
                        DetailSaturday(
                            "Жуковский",
                            "09:05 — 13:50"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "10:10 — 15:05"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "11:00 — 15:30"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "11:10 — 16:10"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "12:10 — 17:10"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "12:45 — 17:20"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "13:35 — 17:10"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "16:00 — 20:40"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "16:40 — 21:30"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "17:10 — 20:50"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "17:45 — 22:35"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "19:25 — 00:30"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "21:05 — 01:35"
                        )
                    )
                ),
                DataSaturday(5,
                    "Москва — Калининград",
                    false,
                    arrayListOf(
                        DetailSaturday(
                            "Шереметьево",
                            "06:40 — 08:20"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "07:40 — 09:25"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "07:45 — 09:40"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "07:55 — 09:35"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "09:00 — 10:45"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "09:55 — 11:35"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "10:15 — 11:55"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "10:40 — 12:25"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "11:30 — 13:15"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "13:40 — 15:20"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "13:55 — 15:40"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "14:00 — 15:55"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "15:00 — 16:40"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "16:00 — 17:45"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "16:35 — 18:15"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "17:35 — 19:20"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "18:30 — 20:10"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "20:05 — 21:50"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "20:05 — 21:45"
                        )
                    )
                ),
                DataSaturday(6,
                    "Москва — Минеральные Воды",
                    false,
                    arrayListOf(
                        DetailSaturday(
                            "Домодедово",
                            "01:45 — 04:55"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "07:00 — 10:40"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "7:45 — 10:10"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "08:05 — 11:50"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "08:15 — 12:10"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "08:30 — 12:15"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "08:50 — 12:35"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "09:55 — 13:40"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "10:05 — 12:35"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "10:10 — 14:00"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "10:50 — 14:45"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "12:10 — 15:50"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "12:15 — 16:05"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "12:30 — 16:10"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "13:00 — 15:40"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "13:00 — 16:40"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "14:45 — 17:15"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "15:00 — 18:50"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "15:40 — 19:20"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "16:00 — 19:40"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "16:30 — 18:55"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "19:10 — 22:55"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "21:05 — 23:25"
                        )
                    )
                ),
                DataSaturday(7,
                    "Москва — Минск",
                    false,
                    arrayListOf(
                        DetailSaturday(
                            "Шереметьево",
                            "08:40 — 10:10"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "09:55 — 11:15"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "12:20 — 13:40"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "14:35 — 16:15"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "15:05 — 16:25"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "18:35 — 20:10"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "19:55 — 21:15"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "20:20 — 21:40"
                        )
                    )
                ),
                DataSaturday(8,
                    "Москва — Санкт-Петербург",
                    false,
                    arrayListOf(
                        DetailSaturday(
                            "Шереметьево",
                            "00:40 — 02:00"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "06:00 — 07:25"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "06:45 — 08:05"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "06:55 — 08:25"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "07:30 — 09:10"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "07:30 — 08:55"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "08:20 — 09:50"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "08:30 — 09:50"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "09:40 — 11:10"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "09:55 — 11:30"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "10:05 — 11:30"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "10:10 — 11:25"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "10:15 — 11:35"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "10:35 — 12:00"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "10:40 — 12:05"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "11:35 — 12:55"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "11:35 — 13:00"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "11:40 — 13:10"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "11:50 — 13:20"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "12:00 — 13:30"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "12:25 — 13:55"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "12:30 — 14:00"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "12:55 — 14:30"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "13:35 — 15:05"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "14:00 — 15:25"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "14:20 — 15:40"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "14:30 — 16:00"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "14:55 — 16:30"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "15:20 — 16:45"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "16:00 — 17:30"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "16:25 — 17:50"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "16:45 — 18:05"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "17:05 — 18:40"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "17:10 — 18:35"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "18:00 — 19:35"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "18:00 — 19:30"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "18:05 — 19:25"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "18:20 — 19:55"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "18:45 — 20:15"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "18:45 — 20:40"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "19:50 — 21:25"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "19:50 — 21:20"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "20:15 — 21:35"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "20:30 — 22:00"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "21:00 — 22:30"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "21:30 — 23:00"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "21:45 — 23:15"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "22:30 — 23:50"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "23:10 — 00:30"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "23:15 — 00:40"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "23:50 — 01:25"
                        )
                    )
                ),
                DataSaturday(9,
                    "Москва — Самара",
                    false,
                    arrayListOf(
                        DetailSaturday(
                            "Внуково",
                            "01:35 — 04:25"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "06:25 — 09:10"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "08:10 — 10:55"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "08:20 — 11:00"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "10:10 — 12:55"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "11:25 — 14:20"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "13:30 — 16:15"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "13:45 — 16:35"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "14:45 — 17:30"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "16:45 — 19:30"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "17:05 — 19:50"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "17:50 — 20:35"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "19:10 — 22:00"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "19:30 — 22:15"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "22:35 — 01:25"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "23:55 — 02:40"
                        )
                    )
                ),
                DataSaturday(10,
                    "Москва — Сочи",
                    false,
                    arrayListOf(
                        DetailSaturday(
                            "Шереметьево",
                            "01:45 — 06:00"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "04:30 — 08:40"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "04:30 — 08:30"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "04:30 — 08:45"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "04:35 — 08:35"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "05:40 — 09:40"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "06:05 — 10:15"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "06:10 — 10:15"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "06:40 — 10:45"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "06:50 — 11:10"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "07:50 — 11:55"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "08:20 — 12:20"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "08:40 — 12:40"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "08:40 — 12:40"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "09:05 — 13:10"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "09:20 — 13:30"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "09:20 — 13:30"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "09:25 — 13:20"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "09:35 — 13:40"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "09:50 — 14:00"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "10:00 — 14:15"
                        ),
                        DetailSaturday(
                            "Жуковский",
                            "10:30 — 14:30"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "10:35 — 14:55"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "10:45 — 14:45"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "10:55 — 15:15"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "10:55 — 15:15"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "11:00 — 15:10"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "11:05 — 15:30"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "11:20 — 15:40"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "11:40 — 15:35"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "11:50 — 16:00"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "12:25 — 16:45"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "12:30 — 16:40"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "12:50 — 16:50"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "13:00 — 17:00"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "13:10 — 17:20"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "13:15 — 17:25"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "13:55 — 17:55"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "14:15 — 18:30"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "14:20 — 18:30"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "14:30 — 18:45"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "15:15 — 19:25"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "15:50 — 19:50"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "15:55 — 19:55"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "15:55 — 19:55"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "16:55 — 21:10"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "18:25 — 22:35"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "18:45 — 22:55"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "19:10 — 23:25"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "20:00 — 00:15"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "21:30 — 01:45"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "21:30 — 01:30"
                        )
                    )
                ),
                DataSaturday(11,
                    "Москва — Стамбул",
                    false,
                    arrayListOf(
                        DetailSaturday(
                            "Внуково",
                            "06:20 — 10:25"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "08:35 — 14:15"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "08:50 — 14:10"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "11:50 — 15:50"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "15:10 — 18:35"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "15:15 — 19:15"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "16:40 — 22:05"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "17:55 — 21:20"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "19:15 — 23:20"
                        ),
                        DetailSaturday(
                            "Жуковский",
                            "19:20 — 01:00"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "20:15 — 01:40"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "22:50 — 04:20"
                        )
                    )
                ),
                DataSaturday(12,
                    "Москва — Ташкент",
                    false,
                    arrayListOf(
                        DetailSaturday(
                            "Внуково",
                            "11:10 — 16:45"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "11:45 — 17:30"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "19:55 — 01:45"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "20:50 — 02:45"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "20:50 — 02:50"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "21:00 — 02:45"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "21:20 — 03:35"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "23:00 — 04:45"
                        )
                    )
                ),
                DataSaturday(13,
                    "Москва — Тюмень",
                    false,
                    arrayListOf(
                        DetailSaturday(
                            "Внуково",
                            "00:30 — 05:15"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "01:30 — 06:20"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "01:30 — 06:15"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "08:25 — 13:10"
                        ),

                        DetailSaturday(
                            "Шереметьево",
                            "11:30 — 16:20"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "14:00 — 18:50"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "20:00 — 00:45"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "23:40 — 04:25"
                        )
                    )
                ),
                DataSaturday(14,
                    "Москва — Челябинск",
                    false,
                    arrayListOf(
                        DetailSaturday(
                            "Шереметьево",
                            "00:05 — 04:40"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "01:15 — 05:45"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "10:55 — 15:25"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "14:00 — 18:30"
                        ),
                        DetailSaturday(
                            "Домодедово",
                            "14:35 — 19:05"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "17:45 — 22:25"
                        ),
                        DetailSaturday(
                            "Шереметьево",
                            "19:20 — 23:55"
                        ),
                        DetailSaturday(
                            "Внуково",
                            "23:50 — 04:15"
                        )
                    )
                )
            )
    }
}

@Parcelize
data class DetailSaturday(
    val station: String,
    val time: String
): Parcelable