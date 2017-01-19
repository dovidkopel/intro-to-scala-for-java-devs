package com.dovidkopel.scala.unit

/**
  * Created by dkopel on 1/18/17.
  */
class LengthUnit(value: String, family: UnitFamily)
class Mile extends LengthUnit("Mile", Imperial)
object Mile extends Mile
class NauticalMile extends LengthUnit("NauticalMile", Imperial)
object NauticalMile extends NauticalMile
class Kilometer extends LengthUnit("Kilometer", Metric)
object Kilometer extends Kilometer
class Meter extends LengthUnit("Meter", Metric)
object Meter extends Meter
class MilliMeter extends LengthUnit("MilliMeter", Metric)
object MilliMeter extends MilliMeter