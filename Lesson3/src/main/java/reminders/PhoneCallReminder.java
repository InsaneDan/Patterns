package reminders;

import interfaces.Reminder;

public class PhoneCallReminder implements Reminder {
    @Override
    public void remind()
    {
        System.out.println("Send by phone call");
    }
}
