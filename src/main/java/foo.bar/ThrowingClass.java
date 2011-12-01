package foo.bar;

import java.util.Random;

public class ThrowingClass {
    public void foo() throws AnException, AnotherException {
        System.out.println("In foo");
        int rnd = new Random().nextInt(2);
        if (rnd == 0) {
            throw new AnException("rnd was 0");
        } else {
            throw new AnotherException("rnd wasn't 0");
        }
    }
}
