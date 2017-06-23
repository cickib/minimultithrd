package practice;


import java.util.Random;

public final class Codecooler {
    private volatile int energy = new Random().nextInt(10);
    private volatile boolean motivation = true;
    private volatile boolean time = true;

    private void printThread(String name){
        System.out.print(String.format("%s :: ", name));
    }

    public void arriveOnTime() {
        if (checkEnergy()) {
            printThread("codecool");
            setEnergy(energy - 1);
            switchTime(true);
            System.out.println("Arrived on time. Energy level decreased.");
        } else {
            sleep();
            printThread("codecool");
            System.out.println("10 minutes of community work. Great...");
        }
    }

    private boolean checkEnergy() {
        return energy >= 5;
    }

    public void studyAlgo() {
        printThread("codecool");
        if (checkEnergy()) {
            setEnergy(energy - 2);
            switchMotivation(false);
            switchTime(false);
            System.out.println("Studied bfs. Motivation is low.");
        } else {
            System.out.println("Algos? No way, too tired.");
        }
    }

    public void fillOutTeammates() {
        printThread("codecool");
        if (checkEnergy()) {
            setEnergy(energy - 5);
            switchMotivation(false);
            switchTime(false);
            System.out.println("TEAMMATES-time: I copy-pasted 'nothing to add, sry' 4 times. Energy levels are converging to zero.");
        } else {
            System.out.println("I 'forgot' to fill out TEAMMATES.");
        }
    }

    public void slacking() {
        printThread("codecool");
        setEnergy(8);
        switchMotivation(true);
        switchTime(false);
        System.out.println("Let's drink a coffee and chat for half an hour...");
    }

    public void sleep() {
        printThread("life");
        setEnergy(10);
        switchMotivation(true);
        switchTime(true);
        System.out.println("Sweet sleeping...");
    }

    public void lookingBusyWhileDoingNothing() {
        printThread("codecool / life");
        setEnergy(6);
        switchMotivation(false);
        switchTime(false);
        System.out.println("Focusing hard. JK, watching cat videos.");
    }

    public void socializing() {
        printThread("life");
        setEnergy(8);
        switchMotivation(true);
        switchTime(false);
        System.out.println("I'm a social being, I need to socialize.");
    }

    public void watchingSeries() {
        printThread("life");
        setEnergy(8);
        switchMotivation(false);
        switchTime(false);
        System.out.println("Algos can wait, I need to binge-watch _____.");
    }

    private void switchTime(boolean flag) {
        time = flag;
    }

    private void switchMotivation(boolean flag) {
        motivation = flag;
    }

    private void setEnergy(int level) {
        energy = (level >= 0 && level <= 10) ? level : 10;
    }

}