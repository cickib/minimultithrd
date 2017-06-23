package practice;


public class Life extends AbstractThread {
    Life(Codecooler codecooler) {
        super(codecooler);
    }

    @Override
    public void run() {
        yield();
        runCodecooler(6, 8);
    }
}
