package Classes;

import Enums.Country;
import Enums.Gender;

import java.time.LocalDate;

public class Passport {
    private int id;
    private String firstName, lastName;
    private LocalDate dateOfBirth;
    private Country country;
    private Gender gender;

    public Passport(int id, String firstName, String lastName, LocalDate dateOfBirth, Country country, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.gender = gender;
    }

    public Passport() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "     id=" + id +
                "\n     firstName='" + firstName +
                "\n     lastName='" + lastName +
                "\n     dateOfBirth=" + dateOfBirth +
                "\n     country=" + country +
                "\n     gender=" + gender;
    }
}
