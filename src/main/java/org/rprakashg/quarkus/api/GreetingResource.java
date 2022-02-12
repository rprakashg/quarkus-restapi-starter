package org.rprakashg.quarkus.api;

import org.rprakashg.quarkus.services.GreetingService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/greeting")
public class GreetingResource {

    @Inject
    GreetingService service;

    @GET
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello(@PathParam("name") String name ) {
        return Response.ok(service.getGreeting(name))
                .status(Response.Status.OK)
                .build();
    }
}