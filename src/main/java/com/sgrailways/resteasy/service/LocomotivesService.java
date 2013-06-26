package com.sgrailways.resteasy.service;

import com.sgrailways.resteasy.model.Locomotive;
import com.sgrailways.resteasy.repositories.LocomotivesRepository;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;

public class LocomotivesService {
    private LocomotivesRepository locomotivesRepository;

    @Inject
    public LocomotivesService(LocomotivesRepository locomotivesRepository) {
        this.locomotivesRepository = locomotivesRepository;
    }

    public List<Locomotive> list() throws SQLException {
        return locomotivesRepository.list();
    }

    public Locomotive create(Locomotive locomotive) throws SQLException {
       return locomotivesRepository.create(locomotive);
    }

}
