package com.dovidkopel.scala.automobile

import java.time.Year

import com.dovidkopel.scala.transportation.{Land, Vehicle}
import com.dovidkopel.scala.{Color, Company, Distance, Speed}

/**
  * Created by dkopel on 1/18/17.
  */
trait Automobile extends Vehicle
    with Land
    with Comparable[Automobile] {
    def make: Company

    def model: String

    def year: Year

    def color: Color

    def maxSpeed: Speed

    def wheelbase: Distance

    override def compareTo(o: Automobile): Int = maxSpeed.compareTo(o.maxSpeed)
}