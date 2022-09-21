package ru.vladleesi.utils

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

const val DATE_PATTERN: String = "MM/dd/yyyy HH:mm"

fun String.toDate(pattern: String = DATE_PATTERN): Date? = try {
    SimpleDateFormat(pattern).parse(this)
} catch (ex: ParseException) {
    null
}

fun String.toTime(pattern: String = DATE_PATTERN): Long? =
    this.toDate(pattern)?.time
