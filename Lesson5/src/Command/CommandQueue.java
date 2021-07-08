package Command;

import Command.Invokers.Command;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CommandQueue {

    private final BlockingQueue<Command> commandQueue;
    private final Thread[] commandThreads;
    private volatile boolean shutdown;

    public CommandQueue(int n) {
        commandQueue = new LinkedBlockingQueue<>();
        commandThreads = new Thread[n];

        for (int i = 0; i < n; i++) {
            commandThreads[i] = new Worker("PoolThread_" + i);
            commandThreads[i].start();
        }
    }

    public void addCommand(Command command) {
        try {
            commandQueue.put(command);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void shutdownPool() {
        while (!commandQueue.isEmpty()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        shutdown = true;
        for (Thread workerThread : commandThreads) {
            workerThread.interrupt();
        }
    }

    private class Worker extends Thread {

        public Worker(String name) {
            super(name);
        }

        public void run() {
            while (!shutdown) {
                try {
                    Command command = commandQueue.take();
                    command.run();
                } catch (InterruptedException e) {
                }
            }
        }
    }

}
