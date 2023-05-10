package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

public class ST2ExecutionListener implements ExecutionListener {

    @Override
    public void notify(DelegateExecution delegateExecution) throws Exception {


        System.out.println("Say Hello Task Completed");
        delegateExecution.setVariable("Surname", "Gupta");
        System.out.println("Name: "+ delegateExecution.getVariable("Name"));


//        try {
//            int i= 0;
//            int j = 5;
//            int k = j/i;
//        }
//        // catch exception
//        catch (Exception x) {
//            System.out.println(
//                    "example of runtime exception");
//        }

    }
}

