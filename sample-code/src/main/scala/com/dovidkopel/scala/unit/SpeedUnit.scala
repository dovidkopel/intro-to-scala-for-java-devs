package com.dovidkopel.scala.unit

/**:
  * Created by dkopel on 1/18/17.
  */
class SpeedUnit[T <: LengthUnit, U <: TimeUnit](
                   val abbreviation: String,
                   val name: String,
                   val lengthUnit: T,
                   val timeUnit: U,
                   val kmh: Double
               )
class KMH extends SpeedUnit(
    "KMH",
    "Kilometers Per Hour",
    Kilometer,
    Hour,
    1
)
object KMH extends KMH
class MPH extends SpeedUnit(
    "MPH",
    "Miles Per Hour",
    Mile,
    Hour,
    1.609344
)
object MPH extends MPH
class MS extends SpeedUnit(
    "MS",
    "Meters Per Second",
    Meter,
    Second,
    0.277778
)
object MS extends MS
class KT extends SpeedUnit(
    "KT",
    "Knot",
    NauticalMile,
    Hour,
    0.539957
)
object KT extends KT