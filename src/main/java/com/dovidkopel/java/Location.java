package com.dovidkopel.java;

/**
 * Created by dkopel on 1/18/17.
 */
public interface Location {
    Double getLatitude();

    Double getLongitude();

    default Double getAltitude() {
        return 0.0D;
    }

    default String stringify() {
        return "lat: "+getLatitude()+", long: "+getLongitude()+", alt: "+getAltitude();
    }
}