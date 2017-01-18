package com.dovidkopel.scala

/**
  * Created by dkopel on 1/18/17.
  */
case class Feature(value: String) extends AnyVal
object CarFeatures {
    val ABS = Feature("ABS")
    val SUNROOF = Feature("SUNROOF")
    val SPOILER = Feature("SPOILER")
    val LEATHER = Feature("LEATHER")
    val AUTO_PARK = Feature("AUTO_PARK")
    val HYBRID = Feature("HYBRID")
}
