package com.dovidkopel.scala

import com.dovidkopel.scala.automobile.{Automobile, Bugatti, Ferrari}
import com.dovidkopel.scala.unit._

/**
  * Created by dkopel on 1/18/17.
  */
object SpeedTest extends App {
    val mph100 = Speed(100D, MPH)
    val kph = mph100(KMH)
    val ms = mph100(MS)
    val kt = mph100(KT)

    val ferrari488: Automobile = Ferrari.GTB488.color(Blue).build
    val bugattiVeyron: Automobile = Bugatti.veyron.color(Black).build

    val cars: List[Automobile] = ferrari488 :: bugattiVeyron :: Nil
    val carsSorted = cars.sortBy(_.maxSpeed)
    val faster = carsSorted.head
    println(faster.model+" : "+faster.maxSpeed)


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
