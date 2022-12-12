package Services.impl;

import Classes.Passport;
import Enums.Country;
import Enums.Gender;
import Services.PersonService;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PersonServiceImpl implements PersonService {
    List<Passport> passports = new LinkedList<>();

    @Override
    public List<Passport> getAllPassport() {
        return passports;
    }

    @Override
    public String getPassByFirstName() {
        System.out.print("Write the first name: ");
        String name = new Scanner(System.in).next();
        for (Passport passport : this.passports) {
            if (passport.getFirstName().equals(name)) {
                System.out.println(passport);
            }
        }
        return null;
    }

    @Override
    public void getAllCountries() {
        for (Country value : Country.values()) {
            System.out.println(value);
        }
    }

    @Override
    public void createAPassport() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the ID: ");
        int id = scanner.nextInt();
        System.out.print("Write name: ");
        String name = scanner.next();
        System.out.print("Write Last name: ");
        String lastName = scanner.next();
        System.out.print("Write date of birth  (yyyy, mm, dd): ");
        LocalDate dateOfBirth = LocalDate.of(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        System.out.print("Write country: ");
        Country country = Country.valueOf(scanner.next());
        System.out.print("Write gender: ");
        Gender gender = Gender.valueOf(scanner.next());
        Passport passport = new Passport(id, name, lastName, dateOfBirth, country, gender);
        passports.add(passport);
        System.out.println("YOUR PASSPORT IS READY!!");
        System.out.println(passport);
    }
}
