package com.sgrailways.resteasy;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.name.Names;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.sgrailways.resteasy.controllers.LocomotivesController;
import com.sgrailways.resteasy.repositories.LocomotivesRepository;
import com.sgrailways.resteasy.service.LocomotivesService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

public class HeyWorldModule implements Module {
    @Override
    public void configure(Binder binder) {

        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/environments/dev/application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        Names.bindProperties(binder, properties);
        JdbcConnectionSource connectionSource = null;

        try {
            connectionSource = new JdbcConnectionSource(
                    properties.getProperty("databaseUrl"),
                    properties.getProperty("databaseUser"),
                    properties.getProperty("databasePassword"));
        } catch (SQLException e) {
            e.printStackTrace();
        }


        binder.bind(LocomotivesController.class);
        binder.bind(LocomotivesService.class);
        binder.bind(ConnectionSource.class).toInstance(connectionSource);
        binder.bind(LocomotivesRepository.class);
    }
}
