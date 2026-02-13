package Lab4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer();

        // users run concurrently (multithreaded submission)
        ExecutorService userExecutor = Executors.newFixedThreadPool(3);

        // printer runs jobs in submission order (FIFO)
        ExecutorService printExecutor = Executors.newSingleThreadExecutor();

        userExecutor.execute(new User("User A", printer, printExecutor));
        userExecutor.execute(new User("User B", printer, printExecutor));
        userExecutor.execute(new User("User C", printer, printExecutor));

        userExecutor.shutdown();
        printExecutor.shutdown();
    }
}
