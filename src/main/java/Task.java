public class Task {

    private double startTime;

    private double endTime = -1;

    Task() {
        startTime = System.currentTimeMillis();
    }

    Task(double startTimeArg) {
        startTime = startTimeArg;
    }

    Task(double startTimeArg, double endTimeArg) {
        startTime = startTimeArg / 1000000;
        endTime = endTimeArg / 1000000;
        System.out.println(endTime);
        System.out.println(System.currentTimeMillis());
    }


}
