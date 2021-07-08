package Command.Invokers;

import Command.Actions.Logging;

public class LoggingInvoker implements Command{

    private Logging logging;

    public void setLogging(Logging logging){
        this.logging = logging;
    }

    @Override
    public void run() {
        System.out.println("CurrentThread ID: " + Thread.currentThread().getId() + ". Выполняется операция логирования (logging).");
        if (logging != null) {
            logging.log();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
