package com.dovidkopel.scala

/**
  * Created by dkopel on 1/18/17.
  */
case class Speed(value: Double, unit: SpeedUnit) {
    def toKMH: Double = value * unit.kmh
    def convert(otherUnit: SpeedUnit): Speed = Speed(toKMH * otherUnit.kmh, otherUnit)
}
