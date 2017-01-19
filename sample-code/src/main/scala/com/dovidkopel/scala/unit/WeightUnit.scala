package com.dovidkopel.scala.unit

/**
  * Created by dkopel on 1/18/17.
  */
class WeightUnit(value: String, family: UnitFamily)
object Grams extends WeightUnit("Grams", Metric)
object KiloGrams extends WeightUnit("KiloGrams", Metric)
object Pounds extends WeightUnit("Pounds", Imperial)