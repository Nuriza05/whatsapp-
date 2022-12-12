import Services.impl.PersonServiceImpl;
import Services.impl.WhatsAppServiceImpl;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            PersonServiceImpl person = new PersonServiceImpl();
            WhatsAppServiceImpl whatsApp = new WhatsAppServiceImpl();
            while (true) {
            System.out.println("""
                    >>>>>>>>>>>>> Commands <<<<<<<<<<<<
                    1. Get all countries ->
                    2. Create a passport ->
                    3. Get passport by first name ->
                    4. Get all passport ->
                    5. Go to your profile ->
                    6. Get all status ->
                    7. Install whatsapp ->
                    8. Get all whatsapp ->
                    9. Change status ->
                    10. Add contact ->
                    11. Send a massage ->
                    12. See a status ->
                    13. See messages ->
                     """);
            int number = new Scanner(System.in).nextInt();
          switch (number){
                case 1 -> person.getAllCountries();
                case 2 -> person.createAPassport();
                case 3 -> System.out.println(person.getPassByFirstName());
                case 4 -> System.out.println(person.getAllPassport());
                case 5 -> System.out.println(whatsApp.yourProfile());
                case 6 -> whatsApp.allStatus();
                case 7 -> System.out.println(whatsApp.installWhatsApp(person));
                case 8 -> System.out.println(whatsApp.getAllWhatsApp());
                case 9 -> System.out.println(whatsApp.changeStatus());
                case 10 -> System.out.println(whatsApp.addContact());
                case 11 -> System.out.println(whatsApp.sendMassage());
                case 12 ->
                        System.out.println(whatsApp.seeStatus());
                case 13 -> {
                    for (String s : whatsApp.seeMassage()) {
                        System.out.println(s);
                    }
                }
            }
        }
    }
}
