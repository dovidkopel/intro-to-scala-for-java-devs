package com.dovidkopel.scala.airplane

/**
  * Created by dkopel on 1/19/17.
  */
class AirplaneFactory private {
//    new Airplane {
//        protected var model: String = _
//        protected var _wingSpan: Distance = _
//        protected var _make: Company = _
//        protected var _cabinWidth: Distance = _
//        protected var _cruisingSpeed: Speed[_] = _
//        protected var _maxSpeed: Speed[_] = _
//        protected var _cargoCapacity: Double = _
//        protected var _passengers: Int = 0
//        protected var _weight: Weight = _
//
//        protected var _length = ???
//
//        override def height = ???
//
//        override def width = ???
//
//
//
//    }
}
object AirplaneFactory {
    def factory: AirplaneFactory = new AirplaneFactory
}
