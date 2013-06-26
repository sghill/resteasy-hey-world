package com.sgrailways.resteasy.repositories;

import com.google.inject.Inject;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.sgrailways.resteasy.model.Locomotive;

import java.sql.SQLException;
import java.util.List;

import static com.j256.ormlite.dao.DaoManager.createDao;

public class LocomotivesRepository {
    private Dao<Locomotive, Integer> locomotiveDao;


    @Inject
    public LocomotivesRepository(ConnectionSource connectionSource) {
        try {
             locomotiveDao = createDao(connectionSource, Locomotive.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Locomotive> list() throws SQLException {
            return locomotiveDao.queryForAll();

    }

    public Locomotive create(Locomotive locomotive) throws SQLException {
        locomotiveDao.create(locomotive);
        return locomotive;
    }
}
