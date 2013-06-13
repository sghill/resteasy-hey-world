package com.sgrailways.resteasy.service;

import com.sgrailways.resteasy.model.Locomotive;
import com.sgrailways.resteasy.repositories.LocomotivesRepository;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LocomotivesService {
    private LocomotivesRepository locomotivesRepository;

    @Inject
    public LocomotivesService(LocomotivesRepository locomotivesRepository) {
        this.locomotivesRepository = locomotivesRepository;
    }

    public List<Locomotive> list() {
        return locomotivesRepository.list();
    }

}
