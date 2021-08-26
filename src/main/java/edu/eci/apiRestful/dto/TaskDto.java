package edu.eci.apiRestful.dto;

import edu.eci.apiRestful.enums.Status;

import java.util.Date;

public class TaskDto {

    String name;
    String description;
    Status state;
    String assignedTo;
    Date dueDate;
    Date created;

    public TaskDto(String name, String description, Status state, String assignedTo, Date dueDate) {
        this.name = name;
        this.description = description;
        this.state = state;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.created = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getState() {
        return state;
    }

    public void setState(Status state) {
        this.state = state;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
