import com.beust.jcommander.JCommander;

public class Main {

    public static void main(String[] argv) {
        Args args = new Args();
        JCommander.newBuilder()
                .addObject(args)
                .build()
                .parse(argv);
        args.run();

        Task task;
        System.out.println(args.endTime);
        double timeSpent = 0;
        if (args.endTime < 0) {
            task = new Task(args.startTime);
        } else {
            task = new Task(args.startTime, args.endTime);
        }

        timeSpent = task.CalculateTimeElapsed();
        System.out.println(timeSpent);
    }

}
