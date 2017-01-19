package com.dovidkopel.scala

import squants.mass.Mass
import squants.space.Length

/**
  * Created by dkopel on 1/18/17.
  */
trait PhysicalDimensions {
    def length: Length

    def height: Length

    def width: Length

    def weight: Mass
}