import interfaces.Reminder;
import factory.ReminderFactory;

public class DemoApp {
    public static void main(String[] args) {
        ReminderFactory reminderFactory = new ReminderFactory();
        Reminder reminder;
        reminder = reminderFactory.createReminder("SMS");
        reminder.remind();
        reminder = reminderFactory.createReminder("Email");
        reminder.remind();
        reminder = reminderFactory.createReminder("Chat");
        reminder.remind();
        reminder = reminderFactory.createReminder("PhOnE");
        reminder.remind();
    }
}
