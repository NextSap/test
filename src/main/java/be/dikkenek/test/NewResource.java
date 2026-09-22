package be.dikkenek.test;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/new-resource")
public class NewResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "New, resources!";
    }
}
