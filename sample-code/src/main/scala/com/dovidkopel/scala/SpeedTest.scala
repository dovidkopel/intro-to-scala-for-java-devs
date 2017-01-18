package com.dovidkopel.scala

/**
  * Created by dkopel on 1/18/17.
  */
object SpeedTest extends App {
    val mph100 = Speed(100D, SpeedUnits.MPH)
    val kph = mph100.convert(SpeedUnits.KPH)
    val ms = mph100.convert(SpeedUnits.MS)
    val kt = mph100.convert(SpeedUnits.KT)
    println(s"KPH: $kph")
    println(s"MS: $ms")
    println(s"KT: $kt")


    class Foo(v: String) {
        var value: String = v
    }

    class Bar(v: String) {
        var value: String = v
    }

    implicit def fooToBar(foo: Foo): Bar = new Bar(foo.value)
//    def fooToBar2(foo: Foo): Bar = new Bar(foo.value)

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
