package com.sgrailways.resteasy;

import com.sgrailways.resteasy.resources.Locomotives;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class HeyWorldApplication extends Application {
    @Override public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(Locomotives.class);
        return classes;
    }

    @Override public Set<Object> getSingletons() {
        return super.getSingletons();
    }
}
