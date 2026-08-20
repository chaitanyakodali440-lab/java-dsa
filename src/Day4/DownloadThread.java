package Day4;
class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {

            System.out.println(
                    "Downloading file... " + (i * 20) + "%"
            );

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println();
                System.out.println("Download Interrupted.");
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Download Completed");
    }
}

public class DownloadThread {

    public static void main(String[] args) {

        MyThread t = new MyThread();

        t.start();
    }
}