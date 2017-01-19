package com.dovidkopel.scala.airplane

import com.dovidkopel.scala.Company

/**
  * Created by dkopel on 1/19/17.
  */
object Boeing {
    val company = Company("Boeing")

    def dreamliner787: AirplaneFactory = {
        AirplaneFactory.factory
    }
}
