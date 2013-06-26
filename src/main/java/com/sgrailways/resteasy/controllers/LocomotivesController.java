package com.sgrailways.resteasy.controllers;

import com.google.inject.Inject;
import com.sgrailways.resteasy.model.Locomotive;
import com.sgrailways.resteasy.service.LocomotivesService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
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
    public Response list() {
        try {
            List<Locomotive> locomotives = locomotivesService.list();
            return Response
                    .status(Response.Status.OK)
                    .entity(locomotives)
                    .build();

        } catch (SQLException e) {
            return Response
                    .status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity(e)
                    .build();
        }
    }

    //POST /resteasy-hey-world/api/locomotives/new
    @POST
    @Path("/new")
        public Response newLocomotive(Locomotive locomotive) {
        try {
            Locomotive createdLocomotive = locomotivesService.create(locomotive);
            return Response
                    .status(Response.Status.CREATED)
                    .entity(createdLocomotive)
                    .build();
        } catch (SQLException e) {
            return   Response
                    .status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity(e)
                    .build();
        }
    }
}
