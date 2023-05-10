package com.camunda.custom.rest.endpoint.service;

import java.util.Map;

public interface ITaskCompletionService {
    String completeUserTask(String taskId, Map<String, Object> variables);
}
