package reminders;

import interfaces.Reminder;

public class EmailReminder implements Reminder {
    @Override
    public void remind()
    {
        System.out.println("Send via e-mail");
    }
}
