package foo.bar;

public class LogException {
    public void logIt(AnException ex) {
        System.out.println("*** " + ex.getMessage());
    }
}
