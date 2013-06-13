package com.sgrailways.resteasy.model;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class LocomotiveTest {

    @Test
    public void shouldExposeNameAndId(){
        Locomotive locomotive = new Locomotive(1, "name");
        assertThat(locomotive.getId(), is(1));
        assertThat(locomotive.getName(), is("name"));
    }
}
