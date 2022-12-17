package com.example.consumingRest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Indicate that any properties not bound in this type should be ignored
@JsonIgnoreProperties(ignoreUnknown = true)
public class Todos {

    private long userId;
    private long id;
    private String title;
    private boolean completed;

    public Todos() {
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Todos{" +
                "userId=" + userId + '\'' +
                ", id=" + id + '\'' +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                "}";
    }
}
