package app;

public class Main {

    static void main(String[] args) {

        DataRepository dataRepository = new DataRepository();
        DataHandler dataHandler = new DataHandler(dataRepository);
        MyThread myThread1 = new MyThread("Thread 1", dataHandler);
        MyThread myThread2 = new MyThread("Thread 2", dataHandler);
        myThread1.start();
        myThread2.start();
    }
}
