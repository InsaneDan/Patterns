package Command.Invokers;

import Command.Actions.Sms;

public class SmsInvoker implements Command {

    private Sms sms;

    public void setSms(Sms sms) {
        this.sms = sms;
    }

    @Override
    public void run() {
        System.out.println("CurrentThread ID: " + Thread.currentThread().getId() + ". Выполняется отправка СМС (SMS).");
        if (sms != null) {
            sms.sendSms();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
