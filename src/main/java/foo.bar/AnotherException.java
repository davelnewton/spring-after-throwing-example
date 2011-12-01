package foo.bar;

public class AnotherException extends Exception {
    public AnotherException() {
    }

    public AnotherException(String s) {
        super(s);
    }

    public AnotherException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public AnotherException(Throwable throwable) {
        super(throwable);
    }
}
