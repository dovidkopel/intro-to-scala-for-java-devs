package com.dovidkopel.scala.airplane

import com.dovidkopel.scala.Company
import com.dovidkopel.scala.transportation.{Air, Vehicle}
import squants.motion.Velocity
import squants.space.Length

/**
  * Created by dkopel on 1/19/17.
  */
trait Airplane extends Vehicle with Air {
    def make: Company

    def model: String

    def wingSpan: Length

    def cabinWidth: Length

    def cruisingSpeed: Velocity
}
