package com.rob.app;

//import the rest service you created!
import com.rob.rest.implementation.HelloRestService;
import com.rob.rest.implementation.VendingItemResourceImp;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;


public class VendingApplication extends Application {
    private Set<Object> singletons = new HashSet<Object>();

    public VendingApplication() {
        // Register our services
        singletons.add(new HelloRestService());
        singletons.add(new VendingItemResourceImp());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
