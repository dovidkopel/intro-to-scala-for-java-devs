package com.dovidkopel.scala

import com.dovidkopel.scala.automobile.{Automobile, CarFactory}

/**
  * Created by dkopel on 1/18/17.
  */
object SpeedTest extends App {
    val mph100 = Speed(100D, MPH)
    val kph = mph100.convert(KMH)
    val ms = mph100.convert(MS)
    val kt = mph100.convert(KT)
    println(s"KPH: $kph")
    println(s"MS: $ms")
    println(s"KT: $kt")

    val ferrari488: Automobile = CarFactory.factory
        .make(Company("Ferrari"))
        .model("488 GTB")
        .color(White)
        .doors(2)
        .passengers(2)
        .wheelbase(Distance(2650, MilliMeter))
        .length(Distance(4568, MilliMeter))
        .width(Distance(1952, MilliMeter))
        .weight(Weight(1544, KiloGrams))
        .maxSpeed(Speed(330, KMH))
        .build

    val bugattiVeyron: Automobile = CarFactory.factory
        .make(Company("Bugatti"))
        .model("Veyron")
        .color(Black)
        .doors(2)
        .passengers(2)
        .wheelbase(Distance(2710, MilliMeter))
        .length(Distance(4462, MilliMeter))
        .height(Distance(1159, MilliMeter))
        .weight(Weight(1888, KiloGrams))
        .maxSpeed(Speed(435.31, KMH))
        .build

    val cars = ferrari488 :: bugattiVeyron :: Nil
    val faster = cars.sorted.reverse.head
    println(faster.model)


    class Foo(v: String) {
        var value: String = v
    }

    class Bar(v: String) {
        var value: String = v
    }

    implicit def fooToBar(foo: Foo): Bar = new Bar(foo.value)

    def +(a: Int, b: Int): Int = a + b

    def something(bar: Bar)(str: String): String = {
        println(s"${bar.value} -> $str")
        str
    }

    val f = new Foo("FINRA")
    val z: Function1[String, String] = something(f)(_:String)
    //String=>String == Function1[String, String]

    val concat = (str1: String, str2: String) => str1 + str2

    z("CAT uh oh")
    z("sometihng else")
    println(concat("foo", "bar"))

    case class Food(value: String)

    val ff = Food("coffee")

}
