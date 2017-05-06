package andre.ribeiro.jersey.jetty;

import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author andreribeiro
 */
@Path("/")
public class HelloWorld {
    
    /**
     * 
     * @return Hello World in Plain Text. 
     */
    @GET
    @Path("test")
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "Hello World";
    }
    
    /**
     * 
     * @return Hello World in Json format using Gson.
     */
    @GET
    @Path("testJson")
    @Produces(MediaType.APPLICATION_JSON)
    public String testJson() {
        Gson gson = new Gson();
        return gson.toJson("Hello World");
    }
    
}