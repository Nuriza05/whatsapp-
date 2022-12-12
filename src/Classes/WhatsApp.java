package Classes;

import java.util.Map;

public class WhatsApp {
    private Passport person;
    private String password;
    private Profile profile;
    private Map<String , String> contacts;

    public WhatsApp(Passport person, String password, Profile profile) {
        this.person = person;
        this.password = password;
        this.profile = profile;
    }


    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Passport getPerson() {
        return person;
    }

    public void setPerson(Passport person) {
        this.person = person;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, String> getContacts() {
        return contacts;
    }

    public void setContacts(Map<String, String> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "person=" + person +
                "\npassword='" + password +
                "\nprofile=" + profile;
    }
}
