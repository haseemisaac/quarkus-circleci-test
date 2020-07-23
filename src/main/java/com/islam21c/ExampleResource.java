package com.islam21c;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Object hello() {
        return new Object(){
            int a = 1;
            int b = 3;

            public int getA() {
                return a;
            }

            public int getB() {
                return b;
            }
        };
    }
}