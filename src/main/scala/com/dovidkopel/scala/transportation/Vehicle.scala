package com.dovidkopel.scala.transportation

import com.dovidkopel.scala.PhysicalDimensions
import squants.motion.Velocity
import squants.space.Area

/**
  * Created by dkopel on 1/18/17.
  */
trait Vehicle extends PhysicalDimensions {
    def passengers: Int

    def maxSpeed: Velocity

    def cargoCapacity: Area
}
