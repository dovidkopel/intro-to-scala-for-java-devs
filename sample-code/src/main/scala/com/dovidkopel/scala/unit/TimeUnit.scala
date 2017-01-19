package com.dovidkopel.scala.unit

/**
  * Created by dkopel on 1/19/17.
  */
class TimeUnit(
              val abbreviation: String,
              val name: String,
              val seconds: Double
              )
class Second extends TimeUnit("s", "second", 1)
object Second extends Second
class Minute extends TimeUnit("m", "minute", 60)
object Minute extends Minute
class Hour extends TimeUnit("h", "hour", 60 * 60)
object Hour extends Hour
class Day extends TimeUnit("d", "day", 864000)
object Day extends Day
