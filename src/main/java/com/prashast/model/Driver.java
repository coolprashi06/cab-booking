package com.prashast.model;


public class Driver extends Person{

    private String currentlyServing;
    private DriverStatus status;

    public Driver(String name, Location location, String currentlyServing, DriverStatus status){
        super(name,location);
        this.currentlyServing = currentlyServing;
        this.status = status;
    }

    public DriverStatus getStatus() {
        return status;
    }

    public void setStatus(DriverStatus status) {
        this.status = status;
    }

    public String getCurrentlyServing() {
        return currentlyServing;
    }

    public void setCurrentlyServing(String currentlyServing) {
        this.currentlyServing = currentlyServing;
    }

    public String toString(){
        return "{Driver:" +
                "name: "+ this.getName()+ "," +
                "status:"+ this.getStatus()+ ","+
                "latitude:"+ this.getLocation().getLatitude()+","+
                "longitude:"+this.getLocation().getLongitude()+","+
                "currentlyServingCustomer:"+this.getCurrentlyServing()+","+
                "}";
    }
}
