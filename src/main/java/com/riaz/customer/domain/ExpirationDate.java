package com.riaz.customer.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class ExpirationDate {
    @NotNull
    @Min(1000L)
    @Max(9999L)
    private Integer year;
    @NotNull
    @Min(1L)
    @Max(12L)
    private Integer month;
    @NotNull
    @Min(1L)
    @Max(31L)
    private Integer day;
    public ExpirationDate(){}

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
    public LocalDate toLocalDate(){
        return LocalDate.of(this.year,this.month,this.day);
    }
    public static ExpirationDate fromLocalDate(LocalDate localDate){
        ExpirationDate dateOfBirth = new ExpirationDate();
        dateOfBirth.setYear(localDate.getYear());
        dateOfBirth.setMonth(localDate.getMonthValue());
        dateOfBirth.setDay(localDate.getDayOfMonth());
        return dateOfBirth;
    }
}
