package reminders;

import interfaces.Reminder;

public class ChatReminder implements Reminder {
    @Override
    public void remind()
    {
        System.out.println("Send in chat");
    }
}
