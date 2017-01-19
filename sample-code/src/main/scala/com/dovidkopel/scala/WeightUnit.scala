package com.dovidkopel.scala

import com.dovidkopel.scala.transportation.{Imperial, Metric, UnitFamily}

/**
  * Created by dkopel on 1/18/17.
  */
class WeightUnit(value: String, family: UnitFamily)
object Grams extends WeightUnit("Grams", Metric)
object KiloGrams extends WeightUnit("KiloGrams", Metric)
object Pounds extends WeightUnit("Pounds", Imperial)