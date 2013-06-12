package com.sgrailways.resteasy.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "locomotives")
public class Locomotive {

    @DatabaseField(id = true)
    private int id;
    @DatabaseField
    private String name;

    public Locomotive() {
        // ORMLite needs a no-arg constructor
    }

    public Locomotive(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
