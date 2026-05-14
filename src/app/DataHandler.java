package app;

import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

    private final DataRepository dataRepository;

    public DataHandler(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public void getOutput() {

        StringBuilder sb = new StringBuilder();
        String[] fruits = dataRepository.getData();
        int count = 0;
        for (String fruit : fruits) {
            sb.append(String.format("(%d) %s ", ++count, fruit));
        }
        System.out.println(Thread.currentThread().getName() + ": " + sb);
    }
}
