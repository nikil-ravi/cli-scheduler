import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

public class Main {

    @Parameter(names={"--start", "-s"})
    int startTime;
    @Parameter(names={"--end", "-e"})
    int endTime;
    @Parameter(names={"--task", "-t"})
    String taskName;

    public static void main(String[] argv) {

        Main main = new Main();
        JCommander.newBuilder()
                .addObject(main)
                .build()
                .parse(argv);
        main.run();

    }

    public void run() {
        System.out.printf("%d %d", startTime, endTime);
        System.out.println(" " + taskName);
    }
}
