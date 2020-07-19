package com.riaz.customer.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public final class ContactDetail {
    public enum Type{
        EMAIL,
        PHONE,
        MOBILE;
    }
    public enum Group{
        BUSINESS,
        PRIVATE;
    }

    @NotNull
    private Type type;
    @NotNull
    private Group group;
    @NotBlank
    private String value;

    private Integer preferenceLevel;
    private boolean validated;

    public ContactDetail(){
        super();
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getPreferenceLevel() {
        return preferenceLevel;
    }

    public void setPreferenceLevel(Integer preferenceLevel) {
        this.preferenceLevel = preferenceLevel;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }
}
