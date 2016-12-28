package com.prashast.service;

import com.prashast.model.Location;

public class GeographicDistance {

    private final static int EARTH_RADIUS = 6371;


    public static double calculate(Location a, Location b){

        double latDiff = toRadians(b.getLatitude() - a.getLatitude());
        double longDiff = toRadians(b.getLongitude() - a.getLongitude());

        double one = Math.sin(latDiff/2) * Math.sin(latDiff/2) + Math.cos(toRadians(a.getLatitude())) * Math.cos(toRadians(b.getLatitude())) * Math.sin(longDiff/2) * Math.sin(longDiff/2);
        double two = 2 * Math.atan2(Math.sqrt(one), Math.sqrt(1-one));

        return EARTH_RADIUS * two; //distance between two locations in kms
    }

    private static double toRadians(double degree){
        return degree * Math.PI/180;
    }

}
