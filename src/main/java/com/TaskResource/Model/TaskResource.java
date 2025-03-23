package com.TaskResource.Model;

public class TaskResource {
    private int id;
    private int taskId;
    private int resourceId;
    private int assignedQuantity;

    public TaskResource() {}

    public TaskResource(int id, int taskId, int resourceId, int assignedQuantity) {
        this.id = id;
        this.taskId = taskId;
        this.resourceId = resourceId;
        this.assignedQuantity = assignedQuantity;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getTaskId() { return taskId; }
    public void setTaskId(int taskId) { this.taskId = taskId; }
    public int getResourceId() { return resourceId; }
    public void setResourceId(int resourceId) { this.resourceId = resourceId; }
    public int getAssignedQuantity() { return assignedQuantity; }
    public void setAssignedQuantity(int assignedQuantity) { this.assignedQuantity = assignedQuantity; }
}