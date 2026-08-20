package Day4;
public class ThreadLifecycleExample {

    public static void main(String[] args)
            throws InterruptedException {

        Thread worker = new Thread(() -> {

            try {
                System.out.println("Thread is running...");

                Thread.sleep(2000);

            } catch (InterruptedException e) {

                System.out.println("Thread interrupted.");
                Thread.currentThread().interrupt();
            }
        });

        // Thread is created but not started
        System.out.println(
                "Before start: " + worker.getState()
        );

        // Start the thread
        worker.start();

        // Give the worker time to enter sleep
        Thread.sleep(100);

        System.out.println(
                "During execution: " + worker.getState()
        );

        // Wait for worker to finish
        worker.join();

        // Thread has completed
        System.out.println(
                "After completion: " + worker.getState()
        );
    }
}