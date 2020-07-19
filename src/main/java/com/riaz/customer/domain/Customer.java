package com.riaz.customer.domain;

import com.amazonaws.services.route53domains.model.ContactDetail;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

public final class Customer {
    public enum Type{
        PERSON,
        BUSINESS
    }
    public enum State{
        PENDING,
        ACTIVE,
        LOCKED,
        CLOSED
    }
    @NotBlank
    private String identifier;
    @NotNull
    private Type type;
    @NotBlank
    private String firstName;
    private String middleName;
    @NotBlank
    private String lastName;
    @NotBlank
    private Date dateOfBirth;
    @NotNull
    private Boolean member;
    private String accountBeneficiary;
    private String referenceCustomer;
    private String assignedOffice;
    private String assignedEmployee;
    @NotNull
    private Address address;
    private List<ContactDetail> contactDetails;
    private State currentState;
    private String applicationDate;
    private List<Value> customValue;
    private String createdBy;
    private String createdOn;
    private String lastMidifiedBy;
    private String lastModifiedOn;

    public Customer(){
        super();
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getMember() {
        return member;
    }

    public void setMember(Boolean member) {
        this.member = member;
    }

    public String getAccountBeneficiary() {
        return accountBeneficiary;
    }

    public void setAccountBeneficiary(String accountBeneficiary) {
        this.accountBeneficiary = accountBeneficiary;
    }

    public String getReferenceCustomer() {
        return referenceCustomer;
    }

    public void setReferenceCustomer(String referenceCustomer) {
        this.referenceCustomer = referenceCustomer;
    }

    public String getAssignedOffice() {
        return assignedOffice;
    }

    public void setAssignedOffice(String assignedOffice) {
        this.assignedOffice = assignedOffice;
    }

    public String getAssignedEmployee() {
        return assignedEmployee;
    }

    public void setAssignedEmployee(String assignedEmployee) {
        this.assignedEmployee = assignedEmployee;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<ContactDetail> getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(List<ContactDetail> contactDetails) {
        this.contactDetails = contactDetails;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }

    public List<Value> getCustomValue() {
        return customValue;
    }

    public void setCustomValue(List<Value> customValue) {
        this.customValue = customValue;
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

    public String getLastMidifiedBy() {
        return lastMidifiedBy;
    }

    public void setLastMidifiedBy(String lastMidifiedBy) {
        this.lastMidifiedBy = lastMidifiedBy;
    }

    public String getLastModifiedOn() {
        return lastModifiedOn;
    }

    public void setLastModifiedOn(String lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }
}
