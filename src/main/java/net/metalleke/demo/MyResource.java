package net.metalleke.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.time.LocalDate;

@Path("/")
public class MyResource {

    @GET
    @Produces("text/plain")
    public String get() {
        // Prove we can use an external dependency and weird JDK classes.
        return "Howdy at " + LocalDate.now() + ".  Have a JDK class: " + javax.security.auth.login.LoginException.class.getName();
    }
}