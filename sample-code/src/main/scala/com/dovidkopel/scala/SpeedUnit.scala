package com.dovidkopel.scala

import scala.concurrent.duration
import scala.concurrent.duration.TimeUnit

/**:
  * Created by dkopel on 1/18/17.
  */
class SpeedUnit(val value: String, val name: String, val lengthUnit: LengthUnit, val timeUnit: TimeUnit, val kmh: Double)
object MPH extends SpeedUnit("MPH", "Miles Per Hour", LengthUnits.Miles, duration.HOURS, 1.609344)
object KPH extends SpeedUnit("KPH", "Kilometers Per Hour", LengthUnits.Kilometers, duration.HOURS, 1)
object MS extends SpeedUnit("MS", "Meters Per Second",LengthUnits.Meters, duration.SECONDS, .277778)
object KT extends SpeedUnit("KT", "Knot", LengthUnits.NauticalMiles, duration.HOURS, .539957)