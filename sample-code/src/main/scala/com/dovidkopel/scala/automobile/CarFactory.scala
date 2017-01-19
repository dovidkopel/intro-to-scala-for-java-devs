package com.dovidkopel.scala.automobile

import java.time.Year

import com.dovidkopel.scala._
import com.dovidkopel.scala.unit._

/**
  * Created by dkopel on 1/18/17.
  */
class CarFactory private {
    protected var _color: Color = _
    protected var _make: Company = _
    protected var _model: String = _
    protected var _year: Year = _
    protected var _maxSpeed: Speed[_] = _
    protected var _passengers: Int = 4
    protected var _doors: Int = 4
    protected var _features: Set[Feature] = Set.empty
    protected var _transmission: Transmission = Automatic
    protected var _cargoCapacity: Double = _
    protected var _length: Distance = _
    protected var _height: Distance = _
    protected var _width: Distance = _
    protected var _wheelbase: Distance = _
    protected var _weight: Weight = _


    def color(color: Color): CarFactory = {
        _color = color
        this
    }

    def make(make: Company): CarFactory = {
        _make = make
        this
    }

    def model(model: String): CarFactory = {
        _model = model
        this
    }

    def year(year: Year): CarFactory = {
        _year = year
        this
    }

    def maxSpeed(speed: Speed[_ <: SpeedUnit[_ <: LengthUnit, _ <: TimeUnit]])(unit: SpeedUnit[_ <: LengthUnit, _ <: TimeUnit]): CarFactory = {
        _maxSpeed = speed(unit)
        this
    }

    def passengers(passengers: Int): CarFactory = {
        _passengers = passengers
        this
    }

    def doors(doors: Int): CarFactory = {
        _doors = doors
        this
    }

    def features(features: Set[Feature]): CarFactory = {
        _features = features
        this
    }

    def transmission(transmission: Transmission): CarFactory = {
        _transmission = transmission
        this
    }

    def cargoCapacity(capacity: Double): CarFactory = {
        _cargoCapacity = capacity
        this
    }

    def length(length: Distance): CarFactory = {
        _length = length
        this
    }

    def wheelbase(wheelbase: Distance): CarFactory = {
        _wheelbase = wheelbase
        this
    }

    def width(width: Distance): CarFactory = {
        _width = width
        this
    }

    def weight(weight: Weight): CarFactory = {
        _weight = weight
        this
    }

    def height(height: Distance): CarFactory = {
        _height = height
        this
    }

    def build: Automobile = new Automobile {
        val color: Color = _color
        val make: Company = _make
        val model: String = _model
        val year: Year = _year
        val maxSpeed: Speed[_] = _maxSpeed
        val passengers: Int = _passengers
        val doors: Int = _doors
        val features: Set[Feature] = _features
        val transmission: Transmission = _transmission
        val cargoCapacity: Double = _cargoCapacity
        val length: Distance = _length
        val height: Distance = _height
        val width: Distance = _width
        val wheelbase: Distance = _wheelbase
        val weight: Weight = _weight
    }
}
object CarFactory {
    def factory: CarFactory = new CarFactory()
}