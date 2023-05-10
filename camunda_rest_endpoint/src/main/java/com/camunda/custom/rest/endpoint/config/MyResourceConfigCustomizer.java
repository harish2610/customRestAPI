package com.camunda.custom.rest.endpoint.config;
//
//import com.camunda.custom.rest.endpoint.controller.TaskController;
//import org.glassfish.jersey.server.ResourceConfig;
//import org.springframework.boot.autoconfigure.jersey.ResourceConfigCustomizer;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MyResourceConfigCustomizer implements ResourceConfigCustomizer {
//
//  @Override
//  public void customize(ResourceConfig config) {
//    config.register(TaskController.class);
//  }
//}

import com.camunda.custom.rest.endpoint.controller.TaskController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.autoconfigure.jersey.ResourceConfigCustomizer;
import org.springframework.stereotype.Component;

@Component
public class MyResourceConfigCustomizer implements ResourceConfigCustomizer {

    @Override
    public void customize(ResourceConfig config) {
        System.out.println("Inside MyResourceConfigCustomizer");
        config.register(TaskController.class);
    }
}
