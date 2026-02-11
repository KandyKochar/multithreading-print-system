package Lab4;

public class Printer {

    // synchronized: printer can only handle one job at a time
    public synchronized void print(PrintJob job) {
    	System.out.println(Thread.currentThread().getName()
    	        + " START -> " + job.getDescription());

    	try {
    	    Thread.sleep(job.getDuration());
    	} catch (InterruptedException e) {
    	    System.out.println("Print interrupted.");
    	}

        System.out.println(Thread.currentThread().getName()
                + " END -> " + job.getDescription());


    // inner class implementing Runnable (required)
    class PrintTask implements Runnable {
        private PrintJob job;

        public PrintTask(PrintJob job) {
            this.job = job;
        }

        @Override
        public void run() {
            print(job);
        }
    }

    // helper to create the runnable task
    public Runnable createTask(PrintJob job) {
        return new PrintTask(job);
    }
}
