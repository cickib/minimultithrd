package practice;


public class Codecool extends AbstractThread {

    Codecool(Codecooler codecooler) {
        super(codecooler);
    }

    @Override
    public void run() {
        yield();
        runCodecooler(0, 6);
    }

}
