package practice;


public class Main {
    public static void main(String[] args) {
        Codecooler codecooler = new Codecooler();
        Thread codecool = new Codecool(codecooler);
        Thread life = new Life(codecooler);

        codecool.start();
        life.start();
    }
}
