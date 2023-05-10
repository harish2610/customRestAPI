package com.camunda.custom.rest.endpoint.controller;
/*
import com.camunda.custom.rest.endpoint.dto.TaskDataDTO;
import com.camunda.custom.rest.endpoint.service.ITaskCompletionService;
import com.camunda.custom.rest.endpoint.service.TaskCompletionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    ITaskCompletionService taskCompletionService;
    @PostMapping(path = "/completeTask", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> completeTask(@RequestBody TaskDataDTO taskDataDTO)
    {
        System.out.println("Inside Controller");
//completeTask
        String Name = taskCompletionService.completeUserTask(taskDataDTO.getTaskId(), taskDataDTO.getVariables());
//returns Name
        return new ResponseEntity<String>(Name, HttpStatus.OK);
    }
}
*/
import com.camunda.custom.rest.endpoint.dto.TaskDataDTO;
import com.camunda.custom.rest.endpoint.service.TaskCompletionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Component
@Path("/api")
public class TaskController {

    @Autowired
    TaskCompletionService taskCompletionService;
    @POST
    @Path("/completeTask")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response completeTask1(TaskDataDTO taskDataDTO){
        System.out.println("Inside Controller");
//completeTask
        String Name = taskCompletionService.completeUserTask(taskDataDTO.getTaskId(), taskDataDTO.getVariables());
//returns Name
        return Response.status(200)
                .entity(Name).build();
    }
}
