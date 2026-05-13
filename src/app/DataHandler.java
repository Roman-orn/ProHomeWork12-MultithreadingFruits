package app;

public class DataHandler {

    private final DataRepository dataRepository;
    private int count;

    public DataHandler(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public void getOutput() {

        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            String[] fruits = dataRepository.getData();
            for (String fruit : fruits) {
                sb.append(String.format("(%d) %s ", ++count, fruit));
            }
            System.out.println(Thread.currentThread().getName() + ": " + sb);
        }
    }
}
