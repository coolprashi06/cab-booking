package com.prashast.model;


public class Customer extends Person {

    public Customer(String name, Location location){
        super(name, location);
    }

    public String toString(){
        return "{Customer:" +
                "name: "+ this.getName()+ "," +
                "latitude:"+ this.getLocation().getLatitude()+","+
                "longitude:"+this.getLocation().getLongitude()+
                "}";
    }
}
