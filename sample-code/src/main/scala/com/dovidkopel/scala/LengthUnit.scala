package com.dovidkopel.scala

/**
  * Created by dkopel on 1/18/17.
  */
case class LengthUnit(value: String, family: UnitFamily)
object LengthUnits {
    val Miles = LengthUnit("Miles", Imperial)
    val NauticalMiles = LengthUnit("NauticalMile", Imperial)
    val Kilometers = LengthUnit("Kilometers", Metric)
    val Meters = LengthUnit("Meters", Metric)
}
