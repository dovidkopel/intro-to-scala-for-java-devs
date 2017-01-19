package com.dovidkopel.scala.automobile

import java.time.Year

import com.dovidkopel.scala._
import squants.Area
import squants.mass.Mass
import squants.motion.{UsMilesPerHour, Velocity}
import squants.space.Length

/**
  * Created by dkopel on 1/18/17.
  */
class CarFactory private {
    protected var _color: Color = _
    protected var _make: Company = _
    protected var _model: String = _
    protected var _year: Year = _
    protected var _maxSpeed: Velocity = _
    protected var _passengers: Int = 4
    protected var _doors: Int = 4
    protected var _features: Set[Feature] = Set.empty
    protected var _transmission: Transmission = Automatic
    protected var _cargoCapacity: Area = _
    protected var _length: Length = _
    protected var _height: Length = _
    protected var _width: Length = _
    protected var _wheelbase: Length = _
    protected var _weight: Mass = _


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

    def maxSpeed(speed: Velocity): CarFactory = {
        _maxSpeed = speed
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

    def cargoCapacity(capacity: Area): CarFactory = {
        _cargoCapacity = capacity
        this
    }

    def length(length: Length): CarFactory = {
        _length = length
        this
    }

    def wheelbase(wheelbase: Length): CarFactory = {
        _wheelbase = wheelbase
        this
    }

    def width(width: Length): CarFactory = {
        _width = width
        this
    }

    def weight(weight: Mass): CarFactory = {
        _weight = weight
        this
    }

    def height(height: Length): CarFactory = {
        _height = height
        this
    }

    def build: Automobile = new Automobile {
        val color: Color = _color
        val make: Company = _make
        val model: String = _model
        val year: Year = _year
        val maxSpeed: Velocity = UsMilesPerHour(_maxSpeed.toUsMilesPerHour)
        val passengers: Int = _passengers
        val doors: Int = _doors
        val features: Set[Feature] = _features
        val transmission: Transmission = _transmission
        val cargoCapacity: Area = _cargoCapacity
        val length: Length = _length
        val height: Length = _height
        val width: Length = _width
        val wheelbase: Length = _wheelbase
        val weight: Mass = _weight
    }
}
object CarFactory {
    def factory: CarFactory = new CarFactory()
}