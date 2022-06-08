package com.app.appfirst.all_data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataFriday(
    val id: Int,
    val fullWay: String,
    var isFavorite: Boolean,
    val detail: List<DetailFriday>
): Parcelable {
    companion object {
        fun initData() =
            arrayListOf(
                DataFriday(1,
                    "Москва — Баку",
                    false,
                    arrayListOf(
                        DetailFriday(
                            "Внуково",
                            "09:44 — 14:05"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "11:00 — 15:40"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "11:00 — 15:30"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "13:50 — 17:40"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "14:25 — 19:05"
                        ),
                        DetailFriday(
                            "Внуково",
                            "19:40 — 23:40"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "21:10 — 01:50"
                        )
                    )
                ),
                DataFriday(2,
                    "Москва — Душанбе",
                    false,
                    arrayListOf(
                        DetailFriday(
                            "Жуковский",
                            "02:15 — 08:25"
                        ),
                        DetailFriday(
                            "Внуково",
                            "05:00 — 11:20"
                        ),
                        DetailFriday(
                            "Жуковский",
                            "10:00 — 16:10"
                        ),
                        DetailFriday(
                            "Внуково",
                            "11:45 — 17:45"
                        ),
                        DetailFriday(
                            "Жуковский",
                            "13:15 — 19:25"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "18:00 — 23:55"
                        ),
                        DetailFriday(
                            "Внуково",
                            "22:15 — 04:30"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "23:20 — 05:10"
                        )
                    )
                ),
                DataFriday(3,
                    "Москва — Екатеринбург",
                    false,
                    arrayListOf(
                        DetailFriday(
                            "Шереметьево",
                            "01:55 — 06:25"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "06:45 — 11:10"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "08:25 — 12:45"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "08:30 — 12:55"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "09:25 — 13:55"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "10:00 — 14:20"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "11:55 — 16:15"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "13:25 — 17:50"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "13:35 — 17:55"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "15:20 — 19:50"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "15:55 — 20:15"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "17:35 — 22:00"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "17:45 — 22:05"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "19:05 — 23:40"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "20:35 — 00:55"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "21:30 — 01:55"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "22:00 — 02:20"
                        ),
                        DetailFriday(
                            "Внуково",
                            "22:30 — 02:55"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "23:45 — 04:05"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "23:45 — 04:10"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "23:50 — 04:20"
                        ),
                        DetailFriday(
                            "Внуково",
                            "23:55 — 04:20"
                        )
                    )
                ),
                DataFriday(4,
                    "Москва — Ереван",
                    false,
                    arrayListOf(
                        DetailFriday(
                            "Шереметьево",
                            "00:10 — 05:20"
                        ),
                        DetailFriday(
                            "Внуково",
                            "03:00 — 07:30"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "07:00 — 11:45"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "07:35 — 12:40"
                        ),
                        DetailFriday(
                            "Жуковский",
                            "09:05 — 13:50"
                        ),
                        DetailFriday(
                            "Внуково",
                            "10:10 — 15:05"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "11:00 — 15:30"
                        ),
                        DetailFriday(
                            "Внуково",
                            "11:10 — 16:10"
                        ),
                        DetailFriday(
                            "Внуково",
                            "12:10 — 17:10"
                        ),
                        DetailFriday(
                            "Внуково",
                            "12:45 — 17:20"
                        ),
                        DetailFriday(
                            "Внуково",
                            "13:35 — 17:10"
                        ),
                        DetailFriday(
                            "Внуково",
                            "16:00 — 20:40"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "16:40 — 21:30"
                        ),
                        DetailFriday(
                            "Внуково",
                            "17:10 — 20:50"
                        ),
                        DetailFriday(
                            "Внуково",
                            "17:45 — 22:35"
                        ),
                        DetailFriday(
                            "Внуково",
                            "19:25 — 00:30"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "21:05 — 01:35"
                        )
                    )
                ),
                DataFriday(5,
                    "Москва — Калининград",
                    false,
                    arrayListOf(
                        DetailFriday(
                            "Шереметьево",
                            "06:40 — 08:20"
                        ),
                        DetailFriday(
                            "Внуково",
                            "07:40 — 09:25"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "07:45 — 09:40"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "07:55 — 09:35"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "09:00 — 10:45"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "09:55 — 11:35"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "10:15 — 11:55"
                        ),
                        DetailFriday(
                            "Внуково",
                            "10:40 — 12:25"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "11:30 — 13:15"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "13:40 — 15:20"
                        ),
                        DetailFriday(
                            "Внуково",
                            "13:55 — 15:40"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "14:00 — 15:55"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "15:00 — 16:40"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "16:00 — 17:45"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "16:35 — 18:15"
                        ),
                        DetailFriday(
                            "Внуково",
                            "17:35 — 19:20"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "18:30 — 20:10"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "20:05 — 21:50"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "20:05 — 21:45"
                        )
                    )
                ),
                DataFriday(6,
                    "Москва — Минеральные Воды",
                    false,
                    arrayListOf(
                        DetailFriday(
                            "Домодедово",
                            "01:45 — 04:55"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "07:00 — 10:40"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "7:45 — 10:10"
                        ),
                        DetailFriday(
                            "Внуково",
                            "08:05 — 11:50"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "08:15 — 12:10"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "08:30 — 12:15"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "08:50 — 12:35"
                        ),
                        DetailFriday(
                            "Внуково",
                            "09:55 — 13:40"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "10:05 — 12:35"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "10:10 — 14:00"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "10:50 — 14:45"
                        ),
                        DetailFriday(
                            "Внуково",
                            "12:10 — 15:50"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "12:15 — 16:05"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "12:30 — 16:10"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "13:00 — 15:40"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "13:00 — 16:40"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "14:45 — 17:15"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "15:00 — 18:50"
                        ),
                        DetailFriday(
                            "Внуково",
                            "15:40 — 19:20"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "16:00 — 19:40"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "16:30 — 18:55"
                        ),
                        DetailFriday(
                            "Внуково",
                            "19:10 — 22:55"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "21:05 — 23:25"
                        )
                    )
                ),
                DataFriday(7,
                    "Москва — Минск",
                    false,
                    arrayListOf(
                        DetailFriday(
                            "Шереметьево",
                            "08:40 — 10:10"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "09:55 — 11:15"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "12:20 — 13:40"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "14:35 — 16:15"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "15:05 — 16:25"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "18:35 — 20:10"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "19:55 — 21:15"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "20:20 — 21:40"
                        )
                    )
                ),
                DataFriday(8,
                    "Москва — Санкт-Петербург",
                    false,
                    arrayListOf(
                        DetailFriday(
                            "Шереметьево",
                            "00:40 — 02:00"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "06:00 — 07:25"
                        ),
                        DetailFriday(
                            "Внуково",
                            "06:45 — 08:05"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "06:55 — 08:25"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "07:30 — 09:10"
                        ),
                        DetailFriday(
                            "Внуково",
                            "07:30 — 08:55"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "08:20 — 09:50"
                        ),
                        DetailFriday(
                            "Внуково",
                            "08:30 — 09:50"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "09:40 — 11:10"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "09:55 — 11:30"
                        ),
                        DetailFriday(
                            "Внуково",
                            "10:05 — 11:30"
                        ),
                        DetailFriday(
                            "Внуково",
                            "10:10 — 11:25"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "10:15 — 11:35"
                        ),
                        DetailFriday(
                            "Внуково",
                            "10:35 — 12:00"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "10:40 — 12:05"
                        ),
                        DetailFriday(
                            "Внуково",
                            "11:35 — 12:55"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "11:35 — 13:00"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "11:40 — 13:10"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "11:50 — 13:20"
                        ),
                        DetailFriday(
                            "Внуково",
                            "12:00 — 13:30"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "12:25 — 13:55"
                        ),
                        DetailFriday(
                            "Внуково",
                            "12:30 — 14:00"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "12:55 — 14:30"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "13:35 — 15:05"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "14:00 — 15:25"
                        ),
                        DetailFriday(
                            "Внуково",
                            "14:20 — 15:40"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "14:30 — 16:00"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "14:55 — 16:30"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "15:20 — 16:45"
                        ),
                        DetailFriday(
                            "Внуково",
                            "16:00 — 17:30"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "16:25 — 17:50"
                        ),
                        DetailFriday(
                            "Внуково",
                            "16:45 — 18:05"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "17:05 — 18:40"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "17:10 — 18:35"
                        ),
                        DetailFriday(
                            "Внуково",
                            "18:00 — 19:35"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "18:00 — 19:30"
                        ),
                        DetailFriday(
                            "Внуково",
                            "18:05 — 19:25"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "18:20 — 19:55"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "18:45 — 20:15"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "18:45 — 20:40"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "19:50 — 21:25"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "19:50 — 21:20"
                        ),
                        DetailFriday(
                            "Внуково",
                            "20:15 — 21:35"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "20:30 — 22:00"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "21:00 — 22:30"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "21:30 — 23:00"
                        ),
                        DetailFriday(
                            "Внуково",
                            "21:45 — 23:15"
                        ),
                        DetailFriday(
                            "Внуково",
                            "22:30 — 23:50"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "23:10 — 00:30"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "23:15 — 00:40"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "23:50 — 01:25"
                        )
                    )
                ),
                DataFriday(9,
                    "Москва — Самара",
                    false,
                    arrayListOf(
                        DetailFriday(
                            "Внуково",
                            "01:35 — 04:25"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "06:25 — 09:10"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "08:10 — 10:55"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "08:20 — 11:00"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "10:10 — 12:55"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "11:25 — 14:20"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "13:30 — 16:15"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "13:45 — 16:35"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "14:45 — 17:30"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "16:45 — 19:30"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "17:05 — 19:50"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "17:50 — 20:35"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "19:10 — 22:00"
                        ),
                        DetailFriday(
                            "Внуково",
                            "19:30 — 22:15"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "22:35 — 01:25"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "23:55 — 02:40"
                        )
                    )
                ),
                DataFriday(10,
                    "Москва — Сочи",
                    false,
                    arrayListOf(
                        DetailFriday(
                            "Шереметьево",
                            "01:45 — 06:00"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "04:30 — 08:40"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "04:30 — 08:30"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "04:30 — 08:45"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "04:35 — 08:35"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "05:40 — 09:40"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "06:05 — 10:15"
                        ),
                        DetailFriday(
                            "Внуково",
                            "06:10 — 10:15"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "06:40 — 10:45"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "06:50 — 11:10"
                        ),
                        DetailFriday(
                            "Внуково",
                            "07:50 — 11:55"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "08:20 — 12:20"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "08:40 — 12:40"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "08:40 — 12:40"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "09:05 — 13:10"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "09:20 — 13:30"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "09:20 — 13:30"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "09:25 — 13:20"
                        ),
                        DetailFriday(
                            "Внуково",
                            "09:35 — 13:40"
                        ),
                        DetailFriday(
                            "Внуково",
                            "09:50 — 14:00"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "10:00 — 14:15"
                        ),
                        DetailFriday(
                            "Жуковский",
                            "10:30 — 14:30"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "10:35 — 14:55"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "10:45 — 14:45"
                        ),
                        DetailFriday(
                            "Внуково",
                            "10:55 — 15:15"
                        ),
                        DetailFriday(
                            "Внуково",
                            "10:55 — 15:15"
                        ),
                        DetailFriday(
                            "Внуково",
                            "11:00 — 15:10"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "11:05 — 15:30"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "11:20 — 15:40"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "11:40 — 15:35"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "11:50 — 16:00"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "12:25 — 16:45"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "12:30 — 16:40"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "12:50 — 16:50"
                        ),
                        DetailFriday(
                            "Внуково",
                            "13:00 — 17:00"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "13:10 — 17:20"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "13:15 — 17:25"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "13:55 — 17:55"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "14:15 — 18:30"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "14:20 — 18:30"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "14:30 — 18:45"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "15:15 — 19:25"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "15:50 — 19:50"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "15:55 — 19:55"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "15:55 — 19:55"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "16:55 — 21:10"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "18:25 — 22:35"
                        ),
                        DetailFriday(
                            "Внуково",
                            "18:45 — 22:55"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "19:10 — 23:25"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "20:00 — 00:15"
                        ),
                        DetailFriday(
                            "Внуково",
                            "21:30 — 01:45"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "21:30 — 01:30"
                        )
                    )
                ),
                DataFriday(11,
                    "Москва — Стамбул",
                    false,
                    arrayListOf(
                        DetailFriday(
                            "Внуково",
                            "06:20 — 10:25"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "08:35 — 14:15"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "08:50 — 14:10"
                        ),
                        DetailFriday(
                            "Внуково",
                            "11:50 — 15:50"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "15:10 — 18:35"
                        ),
                        DetailFriday(
                            "Внуково",
                            "15:15 — 19:15"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "16:40 — 22:05"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "17:55 — 21:20"
                        ),
                        DetailFriday(
                            "Внуково",
                            "19:15 — 23:20"
                        ),
                        DetailFriday(
                            "Жуковский",
                            "19:20 — 01:00"
                        ),
                        DetailFriday(
                            "Внуково",
                            "20:15 — 01:40"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "22:50 — 04:20"
                        )
                    )
                ),
                DataFriday(12,
                    "Москва — Ташкент",
                    false,
                    arrayListOf(
                        DetailFriday(
                            "Внуково",
                            "11:10 — 16:45"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "11:45 — 17:30"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "19:55 — 01:45"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "20:50 — 02:45"
                        ),
                        DetailFriday(
                            "Внуково",
                            "20:50 — 02:50"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "21:00 — 02:45"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "21:20 — 03:35"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "23:00 — 04:45"
                        )
                    )
                ),
                DataFriday(13,
                    "Москва — Тюмень",
                    false,
                    arrayListOf(
                        DetailFriday(
                            "Внуково",
                            "00:30 — 05:15"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "01:30 — 06:20"
                        ),
                        DetailFriday(
                            "Внуково",
                            "01:30 — 06:15"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "08:25 — 13:10"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "11:30 — 16:20"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "14:00 — 18:50"
                        ),
                        DetailFriday(
                            "Внуково",
                            "20:00 — 00:45"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "23:40 — 04:25"
                        )
                    )
                ),
                DataFriday(14,
                    "Москва — Челябинск",
                    false,
                    arrayListOf(
                        DetailFriday(
                            "Шереметьево",
                            "00:05 — 04:40"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "01:15 — 05:45"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "10:55 — 15:25"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "14:00 — 18:30"
                        ),
                        DetailFriday(
                            "Домодедово",
                            "14:35 — 19:05"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "17:45 — 22:25"
                        ),
                        DetailFriday(
                            "Шереметьево",
                            "19:20 — 23:55"
                        ),
                        DetailFriday(
                            "Внуково",
                            "23:50 — 04:15"
                        )
                    )
                )
            )
    }
}

@Parcelize
data class DetailFriday(
    val station: String,
    val time: String
): Parcelable