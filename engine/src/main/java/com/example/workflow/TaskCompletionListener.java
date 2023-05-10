package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

public class TaskCompletionListener implements ExecutionListener {

    @Override
    public void notify(DelegateExecution delegateExecution) throws Exception {


        System.out.println("Say Hello Task Completed");
        delegateExecution.setVariable("Name", "Harish Gupta");
        System.out.println("Name: "+ delegateExecution.getVariable("Name"));
    }
}

