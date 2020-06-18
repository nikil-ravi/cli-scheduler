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

    public double CalculateTimeElapsed() {
        if (endTime < 0) {
            endTime = System.currentTimeMillis() / 1000000;
            System.out.println(endTime);
        }
        System.out.println("EndTime: " + endTime + " StartTime: " + startTime + " Dif.: ");
        return endTime - startTime;
    }
}
