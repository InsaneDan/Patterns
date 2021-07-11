package Command;

import Command.Actions.*;
import Command.Invokers.*;

public class DemoAppCommand {

    public static void main(String[] args) {
        init();
    }

    private static void init() {

        CommandQueue pool = new CommandQueue(10);

        Email email = null;
        EmailInvoker emailInvoker = new EmailInvoker();

        FileIO fileIO = null;;
        FileIOInvoker fileIOInvoker = new FileIOInvoker();

        Logging logging = null;
        LoggingInvoker loggingInvoker = new LoggingInvoker();

        Sms sms = null;
        SmsInvoker smsInvoker = new SmsInvoker();

        // формируем очередь команд
        for (int i = 0; i < 5; i++) {
            email = new Email();
            emailInvoker.setEmail(email);

            fileIO = new FileIO();
            fileIOInvoker.setFileIO(fileIO);

            logging = new Logging();
            loggingInvoker.setLogging(logging);

            sms = new Sms();
            smsInvoker.setSms(sms);

            pool.addCommand(emailInvoker);
            pool.addCommand(fileIOInvoker);
            pool.addCommand(loggingInvoker);
            pool.addCommand(smsInvoker);
        }
        pool.shutdownPool();
    }
}

/* РЕЗУЛЬАТ (консоль)

CurrentThread ID: 18. Выполняется файловая операция (fileIO).
~~> Операции с файлом (FileIO).
CurrentThread ID: 20. Выполняется отправка СМС (SMS).
~~> Отправка СМС (SMS).
CurrentThread ID: 17. Выполняется отправка email.
~~> Отправка Email.
CurrentThread ID: 21. Выполняется отправка email.
~~> Отправка Email.
CurrentThread ID: 14. Выполняется файловая операция (fileIO).
~~> Операции с файлом (FileIO).
CurrentThread ID: 15. Выполняется операция логирования (logging).
CurrentThread ID: 19. Выполняется операция логирования (logging).
~~> Выполняется логирование (Logging).
~~> Выполняется логирование (Logging).
CurrentThread ID: 13. Выполняется отправка email.
~~> Отправка Email.
CurrentThread ID: 22. Выполняется файловая операция (fileIO).
~~> Операции с файлом (FileIO).
CurrentThread ID: 16. Выполняется отправка СМС (SMS).
~~> Отправка СМС (SMS).
CurrentThread ID: 16. Выполняется операция логирования (logging).
CurrentThread ID: 20. Выполняется отправка СМС (SMS).
CurrentThread ID: 21. Выполняется файловая операция (fileIO).
~~> Операции с файлом (FileIO).
~~> Выполняется логирование (Logging).
CurrentThread ID: 17. Выполняется отправка email.
~~> Отправка Email.
CurrentThread ID: 13. Выполняется файловая операция (fileIO).
~~> Операции с файлом (FileIO).
CurrentThread ID: 15. Выполняется отправка email.
~~> Отправка Email.
CurrentThread ID: 19. Выполняется отправка СМС (SMS).
~~> Отправка СМС (SMS).
~~> Отправка СМС (SMS).
CurrentThread ID: 14. Выполняется операция логирования (logging).
~~> Выполняется логирование (Logging).
CurrentThread ID: 22. Выполняется операция логирования (logging).
~~> Выполняется логирование (Logging).
CurrentThread ID: 18. Выполняется отправка СМС (SMS).
~~> Отправка СМС (SMS).

*/