package com.dovidkopel.scala

import java.time.Year

/**
  * Created by dkopel on 1/18/17.
  */
trait Automobile extends Vehicle with Land {
    def make: String

    def model: String

    def year: Year

    def color: Color

    def maxSpeed: Speed
}