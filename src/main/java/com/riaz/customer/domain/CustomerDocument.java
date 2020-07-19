package com.riaz.customer.domain;

import javax.validation.constraints.NotBlank;
import java.util.Objects;

public class CustomerDocument {
    @NotBlank
    private String identifier;
    private String Description;
    private boolean completed;
    private String createdBy;
    private String createdOn;

    public CustomerDocument(){

    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDocument that = (CustomerDocument) o;
        return completed == that.completed &&
                Objects.equals(identifier, that.identifier) &&
                Objects.equals(Description, that.Description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, Description, completed);
    }

    @Override
    public String toString() {
        return "CustomerDocument{" +
                "identifier='" + identifier + '\'' +
                ", Description='" + Description + '\'' +
                ", completed=" + completed +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn='" + createdOn + '\'' +
                '}';
    }
}
