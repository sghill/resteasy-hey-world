package com.sgrailways.resteasy.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "locomotives")
public class Locomotive {

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private String name;

    public Locomotive() {
        // ORMLite needs a no-arg constructor
    }

    public Locomotive(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
