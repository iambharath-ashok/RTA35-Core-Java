package com.bharath.learning.core.threads.interruption;

class FileDownloader implements Runnable {

    @Override
    public void run() {
        System.out.println("File Download started...");

        try {
            // Simulate file download
            for (int i = 1; i <= 10; i++) {
                //Simulate download progress
                Thread.sleep(500);
                System.out.println("Downloaded " + (i * 10) + "%");

                // Check if the thread is interrupted
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Download interrupted! Cleaning up...");
                    break;
                }
            }
            System.out.println("File download completed successfully.");
        } catch(InterruptedException e) {
            System.out.println("Download interrupted during sleep! Exiting safely...");
        }
    }
}


public class DownloadManager {

    public static void main(String[] args) {
        FileDownloader fileDownloader = new FileDownloader();
        Thread downloadThread = new Thread(fileDownloader);

        downloadThread.start();

        try {
            // Simulate some time before interrupting the download
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is interrupting the download thread.");
        downloadThread.interrupt(); // Request to interrupt the download thread
    }
}
