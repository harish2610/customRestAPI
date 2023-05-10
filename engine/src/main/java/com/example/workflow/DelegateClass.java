package com.example.workflow;

import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.runtime.Execution;
import org.camunda.bpm.engine.task.Task;

import java.util.List;

public class DelegateClass implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Inside Delegate Class : execute ");
        TaskService taskService = delegateExecution.getProcessEngineServices().getTaskService();

        List<Task> taskList = taskService.createTaskQuery().processInstanceId(delegateExecution.getProcessInstanceId()).active().list();

        System.out.println("taskList: "+taskList.toString());

        for (int i = 0; i < taskList.size(); i++) {
            Execution execution = delegateExecution.getProcessEngineServices().getRuntimeService().createExecutionQuery().executionId(taskList.get(i).getExecutionId()).singleResult();
            System.out.println("execution: "+execution.toString());

            System.out.println("task: "+ taskList.get(i));

            System.out.println("TaskDefinitionKey: "+ taskList.get(i).getTaskDefinitionKey());

            System.out.println("task execution id: "+taskList.get(i).getExecutionId());

            System.out.println("pid: "+execution.getProcessInstanceId());

        }
    }
}
