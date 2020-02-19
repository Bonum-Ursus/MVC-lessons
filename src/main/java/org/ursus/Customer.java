package org.ursus;

import javax.validation.constraints.*;

public class Customer {
    private String firstName;

    @NotEmpty(message = "is required (@NotEmpty)")
    @Size(min = 1, message = "is required (@Size)")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
