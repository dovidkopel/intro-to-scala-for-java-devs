package com.dovidkopel.java;

import org.junit.Test;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * Created by dkopel on 1/24/17.
 */
public class PersonTest {

    @Test
    public void testPerson() {
        Person uho = new Person("bah", null);
        Person tom = new Person("Tom", Optional.empty());
        Person bob = new Person("Bob", Optional.of(new Location() {
            @Override
            public Double getLatitude() {
                return null;
            }

            @Override
            public Double getLongitude() {
                return null;
            }
            })
        );
        System.out.println(uho);
        System.out.println(tom);
        System.out.println(bob);
    }

    @Test
    public void testLambda() {
        Runnable myRunner = new Runnable() {
            @Override
            public void run() {
                System.out.println("hi!");
            }
        };
        new Thread(myRunner).run();
        new Thread(() -> System.out.println("hi in lambda!")).run();

        new Thread(() -> {
            Consumer<Integer> take = (a) -> {

//                Integer b = a;
                System.out.println(a);
            };
            take.accept(10);
        }).run();

        FooDoer.doFoo(() -> System.out.println("foooo!!!"));

    }

    static class FooDoer {
        static void doFoo(Foo foo) {
           foo.doBar();
        }
    }

    @FunctionalInterface
    interface Foo {
        default void noBar() {
        }

        void doBar();
    }
}
