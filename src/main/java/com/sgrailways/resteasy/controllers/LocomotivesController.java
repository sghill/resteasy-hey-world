package com.sgrailways.resteasy.controllers;

import com.google.inject.Inject;
import com.sgrailways.resteasy.model.Locomotive;
import com.sgrailways.resteasy.service.LocomotivesService;

import javax.ws.rs.*;
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

    //GET /resteasy-hey-world/api/locomotives
    @GET
    public List<Locomotive> list() {
        return locomotivesService.list();
    }
    //GET /resteasy-hey-world/api/locomotives/count
    @GET
    @Path("/count")
    public int other() {
        return locomotivesService.list().size();
    }
}
