package com.dovidkopel.scala

import scala.concurrent.duration
import scala.concurrent.duration.TimeUnit

/**:
  * Created by dkopel on 1/18/17.
  */
case class SpeedUnit(value: String, name: String, lengthUnit: LengthUnit, timeUnit: TimeUnit, kmh: Double)
object SpeedUnits {
    val MPH = SpeedUnit("MPH", "Miles Per Hour", LengthUnits.Miles, duration.HOURS, 1.609344)
    val KPH = SpeedUnit("KPH", "Kilometers Per Hour", LengthUnits.Kilometers, duration.HOURS, 1)
    val MS = SpeedUnit("MS", "Meters Per Second",LengthUnits.Meters, duration.SECONDS, .277778)
    val KT = SpeedUnit("KT", "Knot", LengthUnits.NauticalMiles, duration.HOURS, .539957)
}
