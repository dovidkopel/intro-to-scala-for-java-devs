package com.dovidkopel.scala

/**
  * Created by dkopel on 1/18/17.
  */
trait Vehicle extends PhysicalDimensions {
    def passengers: Int

    def doors: Int

    def features: Set[Feature]

    def transmission: Transmission

    def cargoCapacity: Double
}
