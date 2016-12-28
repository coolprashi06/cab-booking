package com.prashast.model;


public class Order {

    private String orderNumber;
    private Driver driver;
    private Customer customer;

    public Order(String orderNumber, Customer customer, Driver driver){
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.driver = driver;
    }

    public Order(){

    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String toString(){
        return "{Order:" +
                "orderNumber: "+ this.getOrderNumber()+ "," +
                "customerName:"+ this.getCustomer().getName()+","+
                "customerLatitude:"+this.getCustomer().getLocation().getLatitude()+","+
                "customerLongitude:"+this.getCustomer().getLocation().getLongitude()+
                "driverName:"+ this.getDriver().getName()+","+
                "driverLatitude:"+this.getDriver().getLocation().getLatitude()+","+
                "driverLongitude:"+this.getDriver().getLocation().getLongitude()+
                "}";
    }
}
