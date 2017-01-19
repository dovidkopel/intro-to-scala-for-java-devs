package com.dovidkopel.scala

/**
  * Created by dkopel on 1/18/17.
  */
case class Speed(value: Double, unit: SpeedUnit) extends Comparable[Speed] {
    def toKMH: Double = value * unit.kmh
    def convert(otherUnit: SpeedUnit): Speed = Speed(toKMH * otherUnit.kmh, otherUnit)

    override def compareTo(o: Speed): Int = value.compare(convert(o.unit).value)
}
