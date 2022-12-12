package Services;

import Classes.Passport;

import java.util.List;

public interface PersonService {

    List<Passport> getAllPassport();
    String getPassByFirstName();
    void getAllCountries();
    void createAPassport();

}
