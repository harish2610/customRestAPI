package com.camunda.custom.rest.endpoint.service;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class TaskCompletionService implements ITaskCompletionService  {

    @Autowired
    ProcessEngine engine;



    @Override
    public String completeUserTask(String taskId, Map<String, Object> variables) {
        System.out.println("Inside Service : completeUserTask");
        //ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        TaskService taskService = engine.getTaskService();
        taskService.complete(taskId, variables);

        String Name = "Harish";

        return Name;
    }
}
