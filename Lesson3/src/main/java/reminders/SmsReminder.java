package reminders;

import interfaces.Reminder;

public class SmsReminder implements Reminder {
    @Override
    public void remind()
    {
        System.out.println("Send via SMS");
    }
}
