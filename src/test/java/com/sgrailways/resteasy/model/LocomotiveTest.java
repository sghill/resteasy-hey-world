package com.sgrailways.resteasy.model;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class LocomotiveTest {

    @Test
    public void shouldExposeNameAndId(){
        Locomotive locomotive = new Locomotive("name");
        assertThat(locomotive.getName(), is("name"));
    }

}
