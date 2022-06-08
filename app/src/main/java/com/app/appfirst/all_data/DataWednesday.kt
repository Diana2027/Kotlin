package com.app.appfirst.all_data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataWednesday(
    val id: Int,
    val fullWay: String,
    var isFavorite: Boolean,
    val detail: List<DetailWednesday>
): Parcelable {
    companion object {
        fun initData() =
            arrayListOf(
                DataWednesday(1,
                    "Москва — Баку",
                    false,
                    arrayListOf(
                        DetailWednesday(
                            "Внуково",
                            "09:42 — 14:05"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "11:00 — 15:40"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "11:00 — 15:30"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "13:50 — 17:40"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "14:25 — 19:05"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "19:40 — 23:40"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "21:10 — 01:50"
                        )
                    )
                ),
                DataWednesday(2,
                    "Москва — Душанбе",
                    false,
                    arrayListOf(
                        DetailWednesday(
                            "Жуковский",
                            "02:15 — 08:25"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "05:00 — 11:20"
                        ),
                        DetailWednesday(
                            "Жуковский",
                            "10:00 — 16:10"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "11:45 — 17:45"
                        ),
                        DetailWednesday(
                            "Жуковский",
                            "13:15 — 19:25"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "18:00 — 23:55"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "22:15 — 04:30"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "23:20 — 05:10"
                        )
                    )
                ),
                DataWednesday(3,
                    "Москва — Екатеринбург",
                    false,
                    arrayListOf(
                        DetailWednesday(
                            "Шереметьево",
                            "01:55 — 06:25"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "06:45 — 11:10"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "08:25 — 12:45"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "08:30 — 12:55"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "09:25 — 13:55"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "10:00 — 14:20"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "11:55 — 16:15"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "13:25 — 17:50"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "13:35 — 17:55"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "15:20 — 19:50"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "15:55 — 20:15"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "17:35 — 22:00"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "17:45 — 22:05"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "19:05 — 23:40"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "20:35 — 00:55"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "21:30 — 01:55"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "22:00 — 02:20"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "22:30 — 02:55"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "23:45 — 04:05"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "23:45 — 04:10"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "23:50 — 04:20"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "23:55 — 04:20"
                        )
                    )
                ),
                DataWednesday(4,
                    "Москва — Ереван",
                    false,
                    arrayListOf(
                        DetailWednesday(
                            "Шереметьево",
                            "00:10 — 05:20"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "03:00 — 07:30"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "07:00 — 11:45"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "07:35 — 12:40"
                        ),
                        DetailWednesday(
                            "Жуковский",
                            "09:05 — 13:50"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "10:10 — 15:05"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "11:00 — 15:30"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "11:10 — 16:10"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "12:10 — 17:10"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "12:45 — 17:20"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "13:35 — 17:10"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "16:00 — 20:40"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "16:40 — 21:30"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "17:10 — 20:50"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "17:45 — 22:35"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "19:25 — 00:30"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "21:05 — 01:35"
                        )
                    )
                ),
                DataWednesday(5,
                    "Москва — Калининград",
                    false,
                    arrayListOf(
                        DetailWednesday(
                            "Шереметьево",
                            "06:40 — 08:20"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "07:40 — 09:25"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "07:45 — 09:40"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "07:55 — 09:35"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "09:00 — 10:45"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "09:55 — 11:35"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "10:15 — 11:55"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "10:40 — 12:25"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "11:30 — 13:15"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "13:40 — 15:20"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "13:55 — 15:40"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "14:00 — 15:55"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "15:00 — 16:40"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "16:00 — 17:45"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "16:35 — 18:15"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "17:35 — 19:20"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "18:30 — 20:10"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "20:05 — 21:50"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "20:05 — 21:45"
                        )
                    )
                ),
                DataWednesday(6,
                    "Москва — Минеральные Воды",
                    false,
                    arrayListOf(
                        DetailWednesday(
                            "Домодедово",
                            "01:45 — 04:55"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "07:00 — 10:40"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "7:45 — 10:10"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "08:05 — 11:50"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "08:15 — 12:10"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "08:30 — 12:15"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "08:50 — 12:35"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "09:55 — 13:40"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "10:05 — 12:35"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "10:10 — 14:00"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "10:50 — 14:45"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "12:10 — 15:50"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "12:15 — 16:05"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "12:30 — 16:10"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "13:00 — 15:40"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "13:00 — 16:40"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "14:45 — 17:15"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "15:00 — 18:50"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "15:40 — 19:20"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "16:00 — 19:40"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "16:30 — 18:55"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "19:10 — 22:55"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "21:05 — 23:25"
                        )
                    )
                ),
                DataWednesday(7,
                    "Москва — Минск",
                    false,
                    arrayListOf(
                        DetailWednesday(
                            "Шереметьево",
                            "08:40 — 10:10"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "09:55 — 11:15"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "12:20 — 13:40"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "14:35 — 16:15"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "15:05 — 16:25"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "18:35 — 20:10"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "19:55 — 21:15"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "20:20 — 21:40"
                        )
                    )
                ),
                DataWednesday(8,
                    "Москва — Санкт-Петербург",
                    false,
                    arrayListOf(
                        DetailWednesday(
                            "Шереметьево",
                            "00:40 — 02:00"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "06:00 — 07:25"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "06:45 — 08:05"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "06:55 — 08:25"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "07:30 — 09:10"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "07:30 — 08:55"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "08:20 — 09:50"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "08:30 — 09:50"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "09:40 — 11:10"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "09:55 — 11:30"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "10:05 — 11:30"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "10:10 — 11:25"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "10:15 — 11:35"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "10:35 — 12:00"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "10:40 — 12:05"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "11:35 — 12:55"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "11:35 — 13:00"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "11:40 — 13:10"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "11:50 — 13:20"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "12:00 — 13:30"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "12:25 — 13:55"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "12:30 — 14:00"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "12:55 — 14:30"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "13:35 — 15:05"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "14:00 — 15:25"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "14:20 — 15:40"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "14:30 — 16:00"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "14:55 — 16:30"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "15:20 — 16:45"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "16:00 — 17:30"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "16:25 — 17:50"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "16:45 — 18:05"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "17:05 — 18:40"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "17:10 — 18:35"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "18:00 — 19:35"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "18:00 — 19:30"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "18:05 — 19:25"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "18:20 — 19:55"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "18:45 — 20:15"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "18:45 — 20:40"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "19:50 — 21:25"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "19:50 — 21:20"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "20:15 — 21:35"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "20:30 — 22:00"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "21:00 — 22:30"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "21:30 — 23:00"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "21:45 — 23:15"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "22:30 — 23:50"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "23:10 — 00:30"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "23:15 — 00:40"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "23:50 — 01:25"
                        )
                    )
                ),
                DataWednesday(9,
                    "Москва — Самара",
                    false,
                    arrayListOf(
                        DetailWednesday(
                            "Внуково",
                            "01:35 — 04:25"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "06:25 — 09:10"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "08:10 — 10:55"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "08:20 — 11:00"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "10:10 — 12:55"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "11:25 — 14:20"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "13:30 — 16:15"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "13:45 — 16:35"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "14:45 — 17:30"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "16:45 — 19:30"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "17:05 — 19:50"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "17:50 — 20:35"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "19:10 — 22:00"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "19:30 — 22:15"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "22:35 — 01:25"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "23:55 — 02:40"
                        )
                    )
                ),
                DataWednesday(10,
                    "Москва — Сочи",
                    false,
                    arrayListOf(
                        DetailWednesday(
                            "Шереметьево",
                            "01:45 — 06:00"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "04:30 — 08:40"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "04:30 — 08:30"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "04:30 — 08:45"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "04:35 — 08:35"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "05:40 — 09:40"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "06:05 — 10:15"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "06:10 — 10:15"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "06:40 — 10:45"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "06:50 — 11:10"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "07:50 — 11:55"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "08:20 — 12:20"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "08:40 — 12:40"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "08:40 — 12:40"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "09:05 — 13:10"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "09:20 — 13:30"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "09:20 — 13:30"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "09:25 — 13:20"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "09:35 — 13:40"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "09:50 — 14:00"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "10:00 — 14:15"
                        ),
                        DetailWednesday(
                            "Жуковский",
                            "10:30 — 14:30"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "10:35 — 14:55"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "10:45 — 14:45"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "10:55 — 15:15"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "10:55 — 15:15"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "11:00 — 15:10"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "11:05 — 15:30"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "11:20 — 15:40"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "11:40 — 15:35"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "11:50 — 16:00"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "12:25 — 16:45"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "12:30 — 16:40"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "12:50 — 16:50"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "13:00 — 17:00"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "13:10 — 17:20"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "13:15 — 17:25"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "13:55 — 17:55"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "14:15 — 18:30"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "14:20 — 18:30"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "14:30 — 18:45"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "15:15 — 19:25"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "15:50 — 19:50"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "15:55 — 19:55"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "15:55 — 19:55"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "16:55 — 21:10"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "18:25 — 22:35"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "18:45 — 22:55"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "19:10 — 23:25"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "20:00 — 00:15"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "21:30 — 01:45"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "21:30 — 01:30"
                        )
                    )
                ),
                DataWednesday(11,
                    "Москва — Стамбул",
                    false,
                    arrayListOf(
                        DetailWednesday(
                            "Внуково",
                            "06:20 — 10:25"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "08:35 — 14:15"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "08:50 — 14:10"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "11:50 — 15:50"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "15:10 — 18:35"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "15:15 — 19:15"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "16:40 — 22:05"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "17:55 — 21:20"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "19:15 — 23:20"
                        ),
                        DetailWednesday(
                            "Жуковский",
                            "19:20 — 01:00"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "20:15 — 01:40"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "22:50 — 04:20"
                        )
                    )
                ),
                DataWednesday(12,
                    "Москва — Ташкент",
                    false,
                    arrayListOf(
                        DetailWednesday(
                            "Внуково",
                            "11:10 — 16:45"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "11:45 — 17:30"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "19:55 — 01:45"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "20:50 — 02:45"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "20:50 — 02:50"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "21:00 — 02:45"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "21:20 — 03:35"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "23:00 — 04:45"
                        )
                    )
                ),
                DataWednesday(13,
                    "Москва — Тюмень",
                    false,
                    arrayListOf(
                        DetailWednesday(
                            "Внуково",
                            "00:30 — 05:15"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "01:30 — 06:20"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "01:30 — 06:15"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "08:25 — 13:10"
                        ),

                        DetailWednesday(
                            "Шереметьево",
                            "11:30 — 16:20"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "14:00 — 18:50"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "20:00 — 00:45"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "23:40 — 04:25"
                        )
                    )
                ),
                DataWednesday(14,
                    "Москва — Челябинск",
                    false,
                    arrayListOf(
                        DetailWednesday(
                            "Шереметьево",
                            "00:05 — 04:40"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "01:15 — 05:45"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "10:55 — 15:25"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "14:00 — 18:30"
                        ),
                        DetailWednesday(
                            "Домодедово",
                            "14:35 — 19:05"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "17:45 — 22:25"
                        ),
                        DetailWednesday(
                            "Шереметьево",
                            "19:20 — 23:55"
                        ),
                        DetailWednesday(
                            "Внуково",
                            "23:50 — 04:15"
                        )
                    )
                )
            )
    }
}

@Parcelize
data class DetailWednesday(
    val station: String,
    val time: String
): Parcelable