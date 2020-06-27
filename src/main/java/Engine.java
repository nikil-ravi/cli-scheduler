import com.beust.jcommander.JCommander;

import java.sql.Time;

public class Engine {

    private static Args args;

    private Task task;

    private Time taskStartTime = null;

    private Time taskEndTime = null;

    Time time;

    public Engine(String[] argv) {
        args = new Args();
        JCommander.newBuilder()
                .addObject(args)
                .build()
                .parse(argv);
        args.run();
    }

    public void runScheduler() throws Exception {
        System.out.println(args.endTime);

        double timeSpent = 0;

        if (args.startTime < 0) {
            taskStartTime = new Time(System.currentTimeMillis());
        } else {
            // task = new Task(args.startTime);
            taskStartTime = new Time(args.startTime);
        }

        if (args.endTime > 0) {
            taskEndTime = new Time(args.endTime);
            // task = new Task(args.startTime, args.endTime);
        }/* else {
            while (taskEndTime == null) {
                // TODO
            }
        }*/

        /*if (areTImesValid()) {
            timeSpent = CalculateTimeElapsed();
            System.out.println(timeSpent);
        }*/
    }

    /*public long startTimer() {
        taskTime = System.currentTimeMillis();
    }*/

    public long getTimeElapsed() {
        return taskEndTime.getTime() - taskStartTime.getTime();
    }

    public void createTask() {
        
    }

    public double CalculateTimeElapsed() throws Exception {
        if (taskEndTime != null) {
            System.out.println("EndTime: " + taskEndTime + " StartTime: " + taskStartTime + " Dif.: ");
            return taskEndTime.getTime() - taskStartTime.getTime();
        } else {
            throw new Exception("End time not provided");
        }
    }

    public void areTImesValid() throws Exception {
        if (taskStartTime.getTime() < System.currentTimeMillis()) {
            throw new Exception("Start time is before NOW- invalid!");
        }
        if (taskEndTime.getTime() < System.currentTimeMillis() || taskEndTime.getTime() < taskStartTime.getTime()) {
            throw new Exception("End time is invalid");
        }
    }
}
