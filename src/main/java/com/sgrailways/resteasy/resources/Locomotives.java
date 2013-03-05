package com.sgrailways.resteasy.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("/locomotives")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Locomotives {

    @GET
    public List<Map<String, String>> list() {
        List<Map<String, String>> locomotives = new ArrayList<Map<String, String>>();
        Map<String, String> one = new HashMap<String, String>();
        one.put("name", "Baldwin Consolidation 2-8-0");
        Map<String, String> two = new HashMap<String, String>();
        two.put("name", "American 4-4-0");
        locomotives.add(one);
        locomotives.add(two);
        return locomotives;
    }
}
