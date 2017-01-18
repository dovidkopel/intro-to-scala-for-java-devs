package com.dovidkopel.scala

import java.time.Year

/**
  * Created by dkopel on 1/18/17.
  */
class CarFactory private {
    protected var _color: Color = _
    protected var _make: String = _
    protected var _model: String = _
    protected var _year: Year = _
    protected var _maxSpeed: Speed = _
    protected var _passengers: Int = 4
    protected var _doors: Int = 4
    protected var _features: Set[Feature] = Set.empty
    protected var _transmission: Transmission = Automatic
    protected var _cargoCapacity: Double = _
    protected var _length: Int = _
    protected var _height: Int = _
    protected var _width: Int = _
    protected var _weight: Int = _

    def color(color: Color): CarFactory = {
        _color = color
        this
    }

    def make(make: String): CarFactory = {
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

    def maxSpeed(speed: Speed): CarFactory = {
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

    def cargoCapacity(capacity: Double): CarFactory = {
        _cargoCapacity = capacity
        this
    }

    def length(length: Int): CarFactory = {
        _length = length
        this
    }

    def width(width: Int): CarFactory = {
        _width = width
        this
    }

    def weight(weight: Int): CarFactory = {
        _weight = weight
        this
    }

    def height(height: Int): CarFactory = {
        _height = height
        this
    }

    def build: Automobile = new Automobile {
        val color: Color = _color
        val make: String = _make
        val model: String = _model
        val year: Year = _year
        val maxSpeed: Speed = _maxSpeed
        val passengers: Int = _passengers
        val doors: Int = _doors
        val features: Set[Feature] = _features
        val transmission: Transmission = _transmission
        val cargoCapacity: Double = _cargoCapacity
        val length: Int = _length
        val height: Int = _height
        val width: Int = _width
        val weight: Int = _weight
    }
}
object CarFactory {
    def factory: CarFactory = new CarFactory()
}