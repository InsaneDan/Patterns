package Command.Invokers;

import Command.Actions.Email;

public class EmailInvoker implements Command{

    private Email email;

    public void setEmail(Email email) {
        this.email = email;
    }

    @Override
    public void run() {
        System.out.println("CurrentThread ID: " + Thread.currentThread().getId() + ". Выполняется отправка email.");
        if (email != null) {
            email.sendEmail();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

}
