package com.dovidkopel.scala.airplane

import com.dovidkopel.scala.Company
import com.dovidkopel.scala.transportation.{Air, Vehicle}
import com.dovidkopel.scala.unit.{Distance, Speed}

/**
  * Created by dkopel on 1/19/17.
  */
trait Airplane extends Vehicle with Air {
    def make: Company

    def model: String

    def wingSpan: Distance

    def cabinWidth: Distance

    def cruisingSpeed: Speed[_]
}
