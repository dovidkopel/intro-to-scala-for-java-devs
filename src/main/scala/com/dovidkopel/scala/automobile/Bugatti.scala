package com.dovidkopel.scala.automobile

import com.dovidkopel.scala.Company
import squants.mass.Kilograms
import squants.motion.KilometersPerHour
import squants.space.Millimeters

/**
  * Created by dkopel on 1/19/17.
  */
object Bugatti {
    private val company = Company("Bugatti")

    def veyron: CarFactory = {
        CarFactory.factory
            .make(company)
            .model("Veyron")
            .doors(2)
            .passengers(2)
            .wheelbase(Millimeters(2710))
            .length(Millimeters(4462))
            .height(Millimeters(1159))
            .weight(Kilograms(1888))
            .maxSpeed(KilometersPerHour(435.31))
    }
}
