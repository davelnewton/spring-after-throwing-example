package foo.bar;

public class AnException extends Exception {
    public AnException() {
    }

    public AnException(String s) {
        super(s);
    }

    public AnException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public AnException(Throwable throwable) {
        super(throwable);
    }
}
