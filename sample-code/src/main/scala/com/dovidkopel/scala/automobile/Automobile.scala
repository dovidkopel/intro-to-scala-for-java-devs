package com.dovidkopel.scala.automobile

import java.time.Year

import com.dovidkopel.scala.transportation.{Land, Vehicle}
import com.dovidkopel.scala.unit.{Distance, Speed}
import com.dovidkopel.scala.{Color, Company}

/**
  * Created by dkopel on 1/18/17.
  */
trait Automobile extends Vehicle
    with Land {
    def make: Company

    def model: String

    def year: Year

    def color: Color

    def maxSpeed: Speed[_]

    def wheelbase: Distance
}