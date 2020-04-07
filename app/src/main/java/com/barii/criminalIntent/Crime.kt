package com.barii.criminalIntent

import java.util.*

data class Crime(
    val id: UUID = UUID.randomUUID(),
    var title: String = "",
    val date: Date = Date(),
    val isSolved: Boolean = false
)