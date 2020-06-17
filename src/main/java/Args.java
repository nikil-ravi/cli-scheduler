import com.beust.jcommander.Parameter;

import java.util.ArrayList;
import java.util.List;

public class Args {

    @Parameter
    private List<String> parameters = new ArrayList<>();

    @Parameter(names = { "-task"}, description = "Name of the task")
    private String taskName  = "";

    @Parameter(names = "-s", description = "Start time")
    private double startTime = 0;

    @Parameter(names = "-e", description = "Debug mode")
    private double endTime = 0;
}
