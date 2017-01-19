package com.dovidkopel.scala.automobile

import com.dovidkopel.scala.Company
import squants.mass.Kilograms
import squants.motion.KilometersPerHour
import squants.space.Millimeters

/**
  * Created by dkopel on 1/19/17.
  */
object Ferrari {
    private val company = Company("Ferrari")

    def GTB488: CarFactory = {
        CarFactory.factory
            .make(company)
            .model("488 GTB")
            .doors(2)
            .passengers(2)
            .wheelbase(Millimeters(2650))
            .length(Millimeters(4568))
            .width(Millimeters(1952))
            .weight(Kilograms(1544))
            .maxSpeed(KilometersPerHour(330))
    }


}
