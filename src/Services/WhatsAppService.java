package Services;

import Classes.Profile;
import Classes.WhatsApp;
import Enums.Status;
import Services.impl.PersonServiceImpl;
import jdk.jshell.Snippet;

import java.util.List;
import java.util.Queue;

public interface WhatsAppService {
    List<Profile> getAllWhatsApp();
    String yourProfile();
    void allStatus();
    String installWhatsApp(PersonServiceImpl person);
    String changeStatus();
    String addContact();
    String sendMassage();
    Queue<String> seeMassage();
    Status seeStatus();
}
