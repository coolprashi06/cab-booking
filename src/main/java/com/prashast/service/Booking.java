package com.prashast.service;


import com.prashast.model.*;

import java.util.ArrayList;
import java.util.List;

public class Booking {

    public List<NearestDriver> findNearestDriver(Customer customer){

        List<NearestDriver> nearestDrivers = new ArrayList<NearestDriver>();
        //TODO: REST service would get the Order object represented in JSON as below which would be converted to object using GSON library:
        /*
            {
             "name":"Prashast Saxena",
             "location":{
                        "latitude":41.507483,
                        "longitude":-99.436554
                        }
            }
         */

        Location customerLocation = customer.getLocation();

        //TODO: Query database to get the list of all the drivers whose Status != BUSY

        List<Driver> drivers = new ArrayList<Driver>();
        for(Driver driver : drivers){
            NearestDriver nearestDriver = new NearestDriver();
            nearestDriver.setDriver(driver);
            Location driverLocation = driver.getLocation();
            double distance = GeographicDistance.calculate(customerLocation,driverLocation);
            nearestDriver.setFarAwayKms(distance);
            nearestDrivers.add(nearestDriver);
        }

        return nearestDrivers;
    }

    public void bookDriver(Order order){

            /*
            {
            "orderNumber":"AXYZ384",
             "driver":{
                       "name":"D1",
                       "location":{
                                   "latitude":41.507483,
                                   "longitude":-99.436554
                                  }
                      },
             "customer:{
                        "name":"Prashast Saxena",
                        "location":{
                                    "latitude":41.507483,
                                    "longitude":-99.436554
                                   }
                      }
             }
            */

        //TODO: Save order details in OrderBooking table and set following in Driver table: DriverStatus = BUSY, Customer: customerName
    }

    public void endTrip(Order order){

        //TODO: Set DriverStatus as AVAILABLE and Customer as null in Driver Table.
    }

}
