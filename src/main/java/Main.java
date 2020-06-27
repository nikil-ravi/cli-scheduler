public class Main {
    public static void main(String[] argv) throws Exception {

        Engine engine = new Engine(argv);

        engine.runScheduler();
    }
}
