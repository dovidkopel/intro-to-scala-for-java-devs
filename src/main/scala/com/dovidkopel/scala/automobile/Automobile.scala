package com.dovidkopel.scala.automobile

import java.time.Year

import com.dovidkopel.scala.transportation.{Land, Vehicle}
import com.dovidkopel.scala.{Color, Company}
import squants.space.Length

/**
  * Created by dkopel on 1/18/17.
  */
trait Automobile extends Vehicle
    with Land {
    def make: Company

    def model: String

    def year: Year

    def doors: Int

    def features: Set[Feature]

    def transmission: Transmission

    def color: Color

    def wheelbase: Length
}