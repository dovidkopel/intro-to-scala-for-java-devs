package com.dovidkopel.scala

import com.dovidkopel.scala.unit.{Distance, Weight}

/**
  * Created by dkopel on 1/18/17.
  */
trait PhysicalDimensions {
    def length: Distance

    def height: Distance

    def width: Distance

    def weight: Weight
}