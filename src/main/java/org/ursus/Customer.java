package org.ursus;

import javax.validation.constraints.*;

public class Customer {
    private String firstName;

    @NotEmpty(message = "is required (@NotEmpty)")
    @Size(min = 1, message = "is required (@Size)")
    private String lastName;

    @Min(value = 0, message = "> 0")
    @Max(value = 10, message = "< 10")
    private int freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 char")
    private String postalCode;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

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
