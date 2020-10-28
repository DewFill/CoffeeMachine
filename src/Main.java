import java.util.Scanner;

public class Main {
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;
    public static void main(String[] args) {
        writeAction();
    }
    static void buyAction() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        Scanner buy = new Scanner(System.in);
        switch (buy.next()) {
            case "1":
                if (water >= 250) {
                    if (beans >= 16) {
                        System.out.println("I have enough resources, making you a coffee!");
                        water -= 250;
                        beans -= 16;
                        cups -= 1;
                        money += 4;
                    } else {
                        System.out.println("Sorry, not enough coffee beans!");
                    }
                } else {
                    System.out.println("Sorry, not enough water!");
                }
                break;
            case "2":
                if (water >= 350) {
                    if (milk >= 75) {
                        if (beans >= 20) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 350;
                            milk -= 75;
                            beans -= 20;
                            cups -= 1;
                            money += 7;
                        } else {
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                    } else {
                        System.out.println("Sorry, not enough milk!");
                    }
                } else {
                    System.out.println("Sorry, not enough water!");
                }
                break;
            case "3":
                if (water >= 200) {
                    if (milk >= 100) {
                        if (beans >= 12) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 200;
                            milk -= 100;
                            beans -= 12;
                            cups -= 1;
                            money += 6;
                        } else {
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                    } else {
                        System.out.println("Sorry, not enough milk!");
                    }
                } else {
                    System.out.println("Sorry, not enough water!");
                }
                break;
            case "back":
                break;
        }
    }
    static void fillAction() {
        Scanner fill = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add: ");
        water += fill.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        milk += fill.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        beans += fill.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        cups += fill.nextInt();
    }
    static void takeAction() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
    static void writeAction() {

        Scanner sc = new Scanner(System.in);
        boolean stopped = true;
        while (stopped) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            switch (sc.next()) {
                case "buy":
                    buyAction();
                    break;
                case "fill":
                    fillAction();
                    break;
                case "take":
                    takeAction();
                    break;
                case "remaining":
                    printState();
                    break;
                case "exit":
                    stopped = false;
                    break;
            }
        }
    }
    static void printState() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + "$ of money");
    }
}
