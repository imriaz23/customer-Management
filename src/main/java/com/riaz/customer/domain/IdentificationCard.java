package com.riaz.customer.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class IdentificationCard {
    @NotBlank
    private String type;
    @NotBlank
    private String number;
    @NotNull
    private ExpirationDate expirationDate;
    private String issuer;
    private String createdBy;
    private String createdON;
    private String lastModifiedBy;
    private String getLastModifiedOn;

    public IdentificationCard(){}

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(final String number) {
        this.number = number;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(final ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(final String issuer) {
        this.issuer = issuer;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedON() {
        return createdON;
    }

    public void setCreatedON(String createdON) {
        this.createdON = createdON;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getGetLastModifiedOn() {
        return getLastModifiedOn;
    }

    public void setGetLastModifiedOn(String getLastModifiedOn) {
        this.getLastModifiedOn = getLastModifiedOn;
    }
}
