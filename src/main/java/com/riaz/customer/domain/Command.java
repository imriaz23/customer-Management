package com.riaz.customer.domain;

import javax.validation.constraints.NotNull;

public final class Command {
    public enum Action{
        ACTIVE,
        CLOSE,
        LOCK,
        UNLOCK,
        REOPEN
    }
    @NotNull
    private Action action;
    private String comment;
    private String createdBy;
    private String createdOn;
    public Command(){
        super();
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }
}
