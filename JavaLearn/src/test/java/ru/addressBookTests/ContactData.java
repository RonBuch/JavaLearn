package ru.addressBookTests;

import java.util.Objects;

public final class ContactData {
    private final String firstName;
    private final String lastName;
    private final String addressOrg;
    private final String email;
    private final String phoneNumber;

    public ContactData(String firstName, String lastName, String addressOrg, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressOrg = addressOrg;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public String addressOrg() {
        return addressOrg;
    }

    public String email() {
        return email;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (ContactData) obj;
        return Objects.equals(this.firstName, that.firstName) &&
                Objects.equals(this.lastName, that.lastName) &&
                Objects.equals(this.addressOrg, that.addressOrg) &&
                Objects.equals(this.email, that.email) &&
                Objects.equals(this.phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, addressOrg, email, phoneNumber);
    }

    @Override
    public String toString() {
        return "ContactData[" +
                "firstName=" + firstName + ", " +
                "lastName=" + lastName + ", " +
                "addressOrg=" + addressOrg + ", " +
                "email=" + email + ", " +
                "phoneNumber=" + phoneNumber + ']';
    }

}