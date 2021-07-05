package factory;

import interfaces.Reminder;
import reminders.ChatReminder;
import reminders.EmailReminder;
import reminders.PhoneCallReminder;
import reminders.SmsReminder;

import java.util.Locale;

public class ReminderFactory {

    public Reminder createReminder(String type) {

        if (type == null || type.isEmpty()) return null; // вернуть null, если не указан тип напоминания

        type = type.toLowerCase(Locale.ROOT); // привести к нижнему регистру, чтобы не было "разночтений"

        // создать объект нужного типа или бросить исключение
        if ("sms".equals(type)) {
            return new SmsReminder();
        } else if ("email".equals(type)) {
            return new EmailReminder();
        } else if ("chat".equals(type)) {
            return new ChatReminder();
        } else if ("phone".equals(type)) {
            return new PhoneCallReminder();
        } else {
            throw new IllegalArgumentException(String.format("Unknown reminder type %s", type));
        }

    }

}
