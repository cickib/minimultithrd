package practice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;


public class AbstractThread extends Thread {
    final Codecooler codecooler;

    public AbstractThread(Codecooler codecooler) {
        this.codecooler = codecooler;
    }

    // yields included solely to randomize thread execution even more
    void runCodecooler(int from, int to) {
        yield();
        // Codecooler object needed for the thread to run the actions
        synchronized (codecooler) {
            yield();
            // calling all the methods of Codecooler using reflection
            for (Method method : Arrays.asList(codecooler.getClass().getMethods()).subList(from, to)) {
                yield();
                try {
                    yield();
                    method.invoke(codecooler);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
