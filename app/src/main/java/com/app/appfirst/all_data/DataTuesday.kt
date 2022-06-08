package com.app.appfirst.all_data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataTuesday(
    val id: Int,
    val fullWay: String,
    var isFavorite: Boolean,
    val detail: List<DetailTuesday>
): Parcelable {
    companion object {
        fun initData() =
            arrayListOf(
                DataTuesday(1,
                    "Москва — Баку",
                    false,
                    arrayListOf(
                        DetailTuesday(
                            "Внуково",
                            "09:41 — 14:05"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "11:00 — 15:40"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "11:00 — 15:30"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "13:50 — 17:40"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "14:25 — 19:05"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "19:40 — 23:40"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "21:10 — 01:50"
                        )
                    )
                ),
                DataTuesday(2,
                    "Москва — Душанбе",
                    false,
                    arrayListOf(
                        DetailTuesday(
                            "Жуковский",
                            "02:15 — 08:25"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "05:00 — 11:20"
                        ),
                        DetailTuesday(
                            "Жуковский",
                            "10:00 — 16:10"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "11:45 — 17:45"
                        ),
                        DetailTuesday(
                            "Жуковский",
                            "13:15 — 19:25"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "18:00 — 23:55"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "22:15 — 04:30"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "23:20 — 05:10"
                        )
                    )
                ),
                DataTuesday(3,
                    "Москва — Екатеринбург",
                    false,
                    arrayListOf(
                        DetailTuesday(
                            "Шереметьево",
                            "01:55 — 06:25"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "06:45 — 11:10"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "08:25 — 12:45"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "08:30 — 12:55"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "09:25 — 13:55"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "10:00 — 14:20"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "11:55 — 16:15"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "13:25 — 17:50"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "13:35 — 17:55"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "15:20 — 19:50"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "15:55 — 20:15"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "17:35 — 22:00"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "17:45 — 22:05"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "19:05 — 23:40"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "20:35 — 00:55"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "21:30 — 01:55"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "22:00 — 02:20"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "22:30 — 02:55"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "23:45 — 04:05"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "23:45 — 04:10"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "23:50 — 04:20"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "23:55 — 04:20"
                        )
                    )
                ),
                DataTuesday(4,
                    "Москва — Ереван",
                    false,
                    arrayListOf(
                        DetailTuesday(
                            "Шереметьево",
                            "00:10 — 05:20"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "03:00 — 07:30"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "07:00 — 11:45"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "07:35 — 12:40"
                        ),
                        DetailTuesday(
                            "Жуковский",
                            "09:05 — 13:50"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "10:10 — 15:05"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "11:00 — 15:30"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "11:10 — 16:10"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "12:10 — 17:10"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "12:45 — 17:20"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "13:35 — 17:10"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "16:00 — 20:40"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "16:40 — 21:30"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "17:10 — 20:50"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "17:45 — 22:35"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "19:25 — 00:30"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "21:05 — 01:35"
                        )
                    )
                ),
                DataTuesday(5,
                    "Москва — Калининград",
                    false,
                    arrayListOf(
                        DetailTuesday(
                            "Шереметьево",
                            "06:40 — 08:20"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "07:40 — 09:25"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "07:45 — 09:40"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "07:55 — 09:35"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "09:00 — 10:45"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "09:55 — 11:35"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "10:15 — 11:55"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "10:40 — 12:25"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "11:30 — 13:15"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "13:40 — 15:20"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "13:55 — 15:40"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "14:00 — 15:55"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "15:00 — 16:40"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "16:00 — 17:45"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "16:35 — 18:15"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "17:35 — 19:20"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "18:30 — 20:10"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "20:05 — 21:50"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "20:05 — 21:45"
                        )
                    )
                ),
                DataTuesday(6,
                    "Москва — Минеральные Воды",
                    false,
                    arrayListOf(
                        DetailTuesday(
                            "Домодедово",
                            "01:45 — 04:55"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "07:00 — 10:40"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "7:45 — 10:10"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "08:05 — 11:50"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "08:15 — 12:10"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "08:30 — 12:15"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "08:50 — 12:35"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "09:55 — 13:40"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "10:05 — 12:35"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "10:10 — 14:00"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "10:50 — 14:45"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "12:10 — 15:50"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "12:15 — 16:05"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "12:30 — 16:10"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "13:00 — 15:40"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "13:00 — 16:40"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "14:45 — 17:15"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "15:00 — 18:50"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "15:40 — 19:20"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "16:00 — 19:40"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "16:30 — 18:55"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "19:10 — 22:55"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "21:05 — 23:25"
                        )
                    )
                ),
                DataTuesday(7,
                    "Москва — Минск",
                    false,
                    arrayListOf(
                        DetailTuesday(
                            "Шереметьево",
                            "08:40 — 10:10"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "09:55 — 11:15"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "12:20 — 13:40"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "14:35 — 16:15"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "15:05 — 16:25"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "18:35 — 20:10"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "19:55 — 21:15"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "20:20 — 21:40"
                        )
                    )
                ),
                DataTuesday(8,
                    "Москва — Санкт-Петербург",
                    false,
                    arrayListOf(
                        DetailTuesday(
                            "Шереметьево",
                            "00:40 — 02:00"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "06:00 — 07:25"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "06:45 — 08:05"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "06:55 — 08:25"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "07:30 — 09:10"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "07:30 — 08:55"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "08:20 — 09:50"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "08:30 — 09:50"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "09:40 — 11:10"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "09:55 — 11:30"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "10:05 — 11:30"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "10:10 — 11:25"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "10:15 — 11:35"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "10:35 — 12:00"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "10:40 — 12:05"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "11:35 — 12:55"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "11:35 — 13:00"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "11:40 — 13:10"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "11:50 — 13:20"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "12:00 — 13:30"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "12:25 — 13:55"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "12:30 — 14:00"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "12:55 — 14:30"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "13:35 — 15:05"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "14:00 — 15:25"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "14:20 — 15:40"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "14:30 — 16:00"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "14:55 — 16:30"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "15:20 — 16:45"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "16:00 — 17:30"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "16:25 — 17:50"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "16:45 — 18:05"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "17:05 — 18:40"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "17:10 — 18:35"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "18:00 — 19:35"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "18:00 — 19:30"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "18:05 — 19:25"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "18:20 — 19:55"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "18:45 — 20:15"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "18:45 — 20:40"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "19:50 — 21:25"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "19:50 — 21:20"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "20:15 — 21:35"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "20:30 — 22:00"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "21:00 — 22:30"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "21:30 — 23:00"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "21:45 — 23:15"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "22:30 — 23:50"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "23:10 — 00:30"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "23:15 — 00:40"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "23:50 — 01:25"
                        )
                    )
                ),
                DataTuesday(9,
                    "Москва — Самара",
                    false,
                    arrayListOf(
                        DetailTuesday(
                            "Внуково",
                            "01:35 — 04:25"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "06:25 — 09:10"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "08:10 — 10:55"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "08:20 — 11:00"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "10:10 — 12:55"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "11:25 — 14:20"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "13:30 — 16:15"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "13:45 — 16:35"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "14:45 — 17:30"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "16:45 — 19:30"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "17:05 — 19:50"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "17:50 — 20:35"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "19:10 — 22:00"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "19:30 — 22:15"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "22:35 — 01:25"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "23:55 — 02:40"
                        )
                    )
                ),
                DataTuesday(10,
                    "Москва — Сочи",
                    false,
                    arrayListOf(
                        DetailTuesday(
                            "Шереметьево",
                            "01:45 — 06:00"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "04:30 — 08:40"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "04:30 — 08:30"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "04:30 — 08:45"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "04:35 — 08:35"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "05:40 — 09:40"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "06:05 — 10:15"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "06:10 — 10:15"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "06:40 — 10:45"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "06:50 — 11:10"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "07:50 — 11:55"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "08:20 — 12:20"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "08:40 — 12:40"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "08:40 — 12:40"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "09:05 — 13:10"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "09:20 — 13:30"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "09:20 — 13:30"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "09:25 — 13:20"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "09:35 — 13:40"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "09:50 — 14:00"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "10:00 — 14:15"
                        ),
                        DetailTuesday(
                            "Жуковский",
                            "10:30 — 14:30"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "10:35 — 14:55"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "10:45 — 14:45"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "10:55 — 15:15"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "10:55 — 15:15"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "11:00 — 15:10"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "11:05 — 15:30"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "11:20 — 15:40"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "11:40 — 15:35"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "11:50 — 16:00"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "12:25 — 16:45"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "12:30 — 16:40"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "12:50 — 16:50"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "13:00 — 17:00"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "13:10 — 17:20"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "13:15 — 17:25"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "13:55 — 17:55"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "14:15 — 18:30"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "14:20 — 18:30"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "14:30 — 18:45"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "15:15 — 19:25"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "15:50 — 19:50"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "15:55 — 19:55"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "15:55 — 19:55"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "16:55 — 21:10"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "18:25 — 22:35"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "18:45 — 22:55"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "19:10 — 23:25"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "20:00 — 00:15"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "21:30 — 01:45"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "21:30 — 01:30"
                        )
                    )
                ),
                DataTuesday(11,
                    "Москва — Стамбул",
                    false,
                    arrayListOf(
                        DetailTuesday(
                            "Внуково",
                            "06:20 — 10:25"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "08:35 — 14:15"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "08:50 — 14:10"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "11:50 — 15:50"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "15:10 — 18:35"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "15:15 — 19:15"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "16:40 — 22:05"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "17:55 — 21:20"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "19:15 — 23:20"
                        ),
                        DetailTuesday(
                            "Жуковский",
                            "19:20 — 01:00"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "20:15 — 01:40"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "22:50 — 04:20"
                        )
                    )
                ),
                DataTuesday(12,
                    "Москва — Ташкент",
                    false,
                    arrayListOf(
                        DetailTuesday(
                            "Внуково",
                            "11:10 — 16:45"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "11:45 — 17:30"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "19:55 — 01:45"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "20:50 — 02:45"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "20:50 — 02:50"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "21:00 — 02:45"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "21:20 — 03:35"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "23:00 — 04:45"
                        )
                    )
                ),
                DataTuesday(13,
                    "Москва — Тюмень",
                    false,
                    arrayListOf(
                        DetailTuesday(
                            "Внуково",
                            "00:30 — 05:15"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "01:30 — 06:20"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "01:30 — 06:15"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "08:25 — 13:10"
                        ),

                        DetailTuesday(
                            "Шереметьево",
                            "11:30 — 16:20"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "14:00 — 18:50"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "20:00 — 00:45"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "23:40 — 04:25"
                        )
                    )
                ),
                DataTuesday(14,
                    "Москва — Челябинск",
                    false,
                    arrayListOf(
                        DetailTuesday(
                            "Шереметьево",
                            "00:05 — 04:40"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "01:15 — 05:45"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "10:55 — 15:25"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "14:00 — 18:30"
                        ),
                        DetailTuesday(
                            "Домодедово",
                            "14:35 — 19:05"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "17:45 — 22:25"
                        ),
                        DetailTuesday(
                            "Шереметьево",
                            "19:20 — 23:55"
                        ),
                        DetailTuesday(
                            "Внуково",
                            "23:50 — 04:15"
                        )
                    )
                )
            )
    }
}

@Parcelize
data class DetailTuesday(
    val station: String,
    val time: String
): Parcelable