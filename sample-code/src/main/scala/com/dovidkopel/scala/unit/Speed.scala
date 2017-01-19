package com.dovidkopel.scala.unit

/**
  * Created by dkopel on 1/18/17.
  */
case class Speed[T <: SpeedUnit[_ <: LengthUnit, _ <: TimeUnit]]
(value: Double, unit: SpeedUnit[_ <: LengthUnit, _ <: TimeUnit]) extends Ordered[Speed[_]] {
    def toKMH: Double = value * unit.kmh

    override def compare(that: Speed[_]): Int = value.compareTo(that(unit).value)

    def apply[U <: SpeedUnit[_ <: LengthUnit, _ <: TimeUnit]](nUnit: U): Speed[U] = {
        if (unit == nUnit) Speed(value, unit)
        else Speed(toKMH * nUnit.kmh, nUnit)
    }
}
