/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import beans.CustomerService;
import entity.Customer;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author Fincode
 */
@Path("customer")
public class addCustomerResource {

    @Context
    private UriInfo context;
    
    @EJB
    private CustomerService customerService;

    /**
     * Creates a new instance of addCustomerResource
     */
    public addCustomerResource() {
    }

    /**
     * Retrieves representation of an instance of webservices.addCustomerResource
     * @param customer
     * @return an instance of java.lang.String
     */
    @Path("addCustomer")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addNewCustomer(Customer customer) {
        
        customerService.addCustomer(customer);
        
        return "new customer successfully added";
    }

    
}
