package com.dovidkopel.scala

import com.dovidkopel.scala.transportation.{Imperial, Metric, UnitFamily}

/**
  * Created by dkopel on 1/18/17.
  */
class LengthUnit(value: String, family: UnitFamily)
object Miles extends LengthUnit("Miles", Imperial)
object NauticalMiles extends LengthUnit("NauticalMile", Imperial)
object Kilometers extends LengthUnit("Kilometers", Metric)
object Meters extends LengthUnit("Meters", Metric)
object MilliMeter extends LengthUnit("MilliMeter", Metric)