package com.sgrailways.resteasy.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("/locomotives")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Locomotives {
    private final List<Map<String,String>> locomotives;

    public Locomotives() {
        locomotives = new ArrayList<Map<String, String>>();
        Map<String, String> one = new HashMap<String, String>();
        one.put("name", "Baldwin Consolidation 2-8-0");
        one.put("id", "00001");
        Map<String, String> two = new HashMap<String, String>();
        two.put("name", "American 4-4-0");
        two.put("id", "00002");
        locomotives.add(one);
        locomotives.add(two);
    }

    @GET
    public List<Map<String, String>> list() {
        return locomotives;
    }

    @GET
    @Path("/{number}")
    public List<Map<String, String>> list( @PathParam("number") String number) {

        List<Map<String, String>> results = new ArrayList<Map<String, String>>();

        for (Map<String, String> locomotive : locomotives) {
            if (locomotive.get("id").contains(number))      {
                results.add(locomotive);
            }
        }

        return results;
    }
}
