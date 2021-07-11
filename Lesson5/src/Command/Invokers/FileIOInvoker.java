package Command.Invokers;

import Command.Actions.FileIO;

public class FileIOInvoker implements Command{

    private FileIO fileIO;

    public void setFileIO(FileIO fileIO) {
        this.fileIO = fileIO;
    }

    @Override
    public void run() {
        System.out.println("CurrentThread ID: " + Thread.currentThread().getId() + ". Выполняется файловая операция (fileIO).");
        if (fileIO != null) {
            fileIO.execute();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
