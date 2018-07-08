package fizzbuzz;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.List;

@Path("fizzBuzz")
public class FizzBuzzResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(FizzBuzzResource.class);

    @Inject
    FizzBuzzService fizzBuzzService;

    @Path("generate")
    @GET
    public String generate(@QueryParam("numbers") String numbersStr)  {
        try {
            List<Integer> numbers = fizzBuzzService.split(numbersStr);
            return fizzBuzzService.processNumbers(numbers);
        }
        catch (Exception e){
            LOGGER.error("exception", e);
            return e.getCause().toString();
        }
    }
}
