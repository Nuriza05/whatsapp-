package Services.impl;

import Classes.Passport;
import Classes.Profile;
import Classes.WhatsApp;
import Enums.Status;
import Services.WhatsAppService;
import Services.impl.PersonServiceImpl;

import java.util.*;

public class WhatsAppServiceImpl implements WhatsAppService {
    Queue<String> sendMassages = new LinkedList<>();
    List<WhatsApp>whatsApps = new LinkedList<>();

    @Override
    public List<Profile> getAllWhatsApp() {
        List<Profile>profiles = new LinkedList<>();
        for (WhatsApp whatsApp : whatsApps) {
            profiles.add(whatsApp.getProfile());
        }
        return profiles;
    }

    @Override
    public String yourProfile() {
        System.out.print("Write your password: ");
        String password = new Scanner(System.in).next();
        for (WhatsApp whatsApp : this.whatsApps) {
            if (whatsApp.getPassword().equals(password)){
                System.out.println(whatsApp.getProfile());
            }
        }
        return "Your password is wrong!";
    }

    @Override
    public void allStatus() {
        for (Status value : Status.values()) {
            System.out.println(value);
        }
    }

    @Override
    public String installWhatsApp(PersonServiceImpl person){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your passport ID:");
        int id = scanner.nextInt();
        System.out.print("Write phone number: ");
        String phoneNumber = scanner.next();
        System.out.print("Write the user name: ");
        String userName = scanner.next();
        System.out.print("Write the password: ");
        String password = scanner.next();
        for (Passport passport : person.getAllPassport()) {
            if (passport.getId() == id) {
                Profile profile = new Profile(phoneNumber, Status.HELLO_I_AM_USING_WHATSAPP, "default image", userName);
                WhatsApp whatsApp = new WhatsApp(passport, password, profile);
                this.whatsApps.add(whatsApp);
                System.out.println(">>>>>>>>> Your whatsApp is successfully installed! \n" + profile);
                return "~~~~~~~~~~~~~~~~~~~~~~~~~";
            }
        }
        return "Wrong ID!";
    }

    @Override
    public String changeStatus() {
        System.out.print("Write your whatsApp password: ");
        String password = new Scanner(System.in).next();
        for (WhatsApp whatsApp : this.whatsApps) {
            if (whatsApp.getPassword().equals(password)) {
                System.out.println("Your current status is " + whatsApp.getProfile().getStatus());
                System.out.print("Write new status: ");
                Status status1 = Status.valueOf(new Scanner(System.in).next());
                whatsApp.getProfile().setStatus(status1);
                return "Your profile is successfully changed!";
            }
        }
            return "No such whatsApp users!";

    }

    @Override
    public String addContact() {
        System.out.print("Write the password: ");
        String password = new Scanner(System.in).next();
        System.out.print("Write the phone number: ");
        String phoneNumber = new Scanner(System.in).next();
        for (WhatsApp whatsApp : whatsApps) {
            if(whatsApp.getPassword().equals(password)){
                for (WhatsApp app : whatsApps) {
                    if(app.getProfile().getPhoneNumber().equals(phoneNumber))
                        whatsApp.getContacts().put(app.getProfile().getPhoneNumber(), app.getProfile().getUserName());
                    return "Person is successfully added!";
                }
            }
        }
        return "Wrong password!";
    }

    @Override
    public String sendMassage() {

        System.out.print("Write your password: ");
        String password = new Scanner(System.in).next();
        System.out.print("who do you want to write?");
        String userName = new Scanner(System.in).next();
        boolean correct = true;
        for (WhatsApp whatsApp : whatsApps) {
            if(whatsApp.getPassword().equals(password)){
                while (correct){
                    String massage = new Scanner(System.in).next();
                    if (massage.equals("SEND")){
                        correct = false;
                        return "massage successfully sent!";
                    }else {
                        this.sendMassages.add(whatsApp.getProfile().getUserName() +": " + massage);
                    }
                }
            }
        }
        return "";
    }

    @Override
    public Queue<String> seeMassage() {
        return this.sendMassages;
    }

    @Override
    public Status seeStatus() {
        System.out.print("Write the user Name: ");
        String userName = new Scanner(System.in).next();
        for (WhatsApp whatsApp : this.whatsApps) {
            if(whatsApp.getProfile().getUserName().equals(userName))
                return whatsApp.getProfile().getStatus();
        }
        return null;
    }
}
