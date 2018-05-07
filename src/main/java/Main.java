import java.time.LocalDate;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        SMSCSender smsc = new SMSCSender ("username", "password", "UTF-8", true);
        smsc.sendSms ("number_tel", "message", 1, "", "", 0, "", "");
    }
}
