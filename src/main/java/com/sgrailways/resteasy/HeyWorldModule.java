package com.sgrailways.resteasy;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.sgrailways.resteasy.controllers.LocomotivesController;
import com.sgrailways.resteasy.repositories.LocomotivesRepository;
import com.sgrailways.resteasy.service.LocomotivesService;

public class HeyWorldModule implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(LocomotivesController.class);
        binder.bind(LocomotivesService.class);
        binder.bind(LocomotivesRepository.class);
    }
}
