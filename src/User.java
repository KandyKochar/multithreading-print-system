package Lab4;

import java.util.concurrent.ExecutorService;

public class User implements Runnable {

    private String name;
    private Printer printer;
    private ExecutorService printExecutor; // single-thread executor for ordered printing

    public User(String name, Printer printer, ExecutorService printExecutor) {
        this.name = name;
        this.printer = printer;
        this.printExecutor = printExecutor;
    }

    @Override
    public void run() {

        // each user submits multiple print jobs
        for (int i = 1; i <= 3; i++) {

            PrintJob job = new PrintJob(name + " - Job " + i, 800);

            // submit to printer queue (single thread => order preserved)
            printExecutor.execute(printer.createTask(job));
        }
    }
}
