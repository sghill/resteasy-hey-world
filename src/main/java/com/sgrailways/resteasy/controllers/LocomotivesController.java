package com.sgrailways.resteasy.controllers;

import com.google.inject.Inject;
import com.sgrailways.resteasy.model.Locomotive;
import com.sgrailways.resteasy.service.LocomotivesService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/locomotives")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LocomotivesController {
    private LocomotivesService locomotivesService;

    @Inject
    public LocomotivesController(LocomotivesService locomotivesService) {

        this.locomotivesService = locomotivesService;
    }

    @GET
    public List<Locomotive> list() {
        return locomotivesService.list();
    }


//    @GET
//    @Path("/id/{id}")
//    public List<Map<String, String>> list( @PathParam("id") String id) {
//
//        List<Map<String, String>> results = new ArrayList<Map<String, String>>();
//
//        for (Map<String, String> locomotive : locomotives) {
//            if (locomotive.get("id").contains(id))      {
//                results.add(locomotive);
//            }
//        }
//
//        return results;
//    }
}
