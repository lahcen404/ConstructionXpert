package com.Task.Model;

import java.util.Date;

public class Task {
    private int id;
    private int projectId;
    private String description;
    private Date start_date;
    private Date end_date;

    public Task(int id, int projectId, String description, Date start_date, Date end_date) {
        this.id = id;
        this.projectId = projectId;
        this.description = description;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public Task(int projectId, String description, Date start_date, Date end_date) {
        this.projectId = projectId;
        this.description = description;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", description='" + description + '\'' +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                '}';
    }
}
