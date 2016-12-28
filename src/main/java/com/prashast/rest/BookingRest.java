package com.prashast.rest;

import com.prashast.model.Customer;
import com.prashast.model.NearestDriver;
import com.prashast.service.Booking;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.FormParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/booking")
public class BookingRest {

    @Autowired
    Booking bookingService;

    private final Logger log = Logger.getLogger(BookingRest.class);


    @Path("/findNearestDriver")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNearestDriver(@FormParam("customer")Customer customer){

        log.info("customer "+ customer.getName() + "attempting to find nearest driver to his location");
        List<NearestDriver> nearestDrivers = bookingService.findNearestDriver(customer);
        if(nearestDrivers.size() > 0){
            return Response.status(Response.Status.OK).entity(nearestDrivers).type(MediaType.APPLICATION_JSON).build();
        }else {
            log.error("No nearby drivers found to customer "+ customer.toString());
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}
