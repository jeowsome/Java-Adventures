package machine;

import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);
    static void printMachineInfo(int water, int milk, int beans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water%n", water);
        System.out.printf("%d ml of milk%n", milk);
        System.out.printf("%d g of coffee beans%n", beans);
        System.out.printf("%d disposable cups%n", cups);
        System.out.printf("$%d of money%n", money);
    }

    static Boolean canMakeCoffee(int totalWater, int totalMilk, int totalBeans) {
        if (totalBeans <= 0 || totalMilk <= 0 || totalWater <= 0) {
            String insufficientIng;
            if (totalBeans <= 0) {
                insufficientIng = "beans";
            } else if (totalMilk <= 0) {
                insufficientIng = "milk";
            } else {
                insufficientIng = "water";
            }
            System.out.printf("Sorry, not enough %s%n", insufficientIng);
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int inputWater = 400;
        int inputMilk = 540;
        int inputBeans = 120;
        int inputCups = 9;
        int inputMoney = 550;


        String choice;

        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            choice = scanner.next();
            switch (choice) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String coffeeFlavor = scanner.next();
                    switch (coffeeFlavor) {
                        case "1":
                            if (canMakeCoffee(inputWater - 250, inputMilk, inputBeans - 16)) {
                                inputWater -= 250;
                                inputBeans -= 16;
                                inputMoney += 4;
                                inputCups -= 1;
                            }
                            break;
                        case "2":
                            if (canMakeCoffee(inputWater - 350, inputMilk - 75, inputBeans - 20)) {
                                inputWater -= 350;
                                inputMilk -= 75;
                                inputBeans -= 20;
                                inputMoney += 7;
                                inputCups -= 1;
                            }
                            break;
                        case "3":
                            if (canMakeCoffee(inputWater - 200, inputMilk - 100, inputBeans - 12)) {
                                inputWater -= 200;
                                inputMilk -= 100;
                                inputBeans -= 12;
                                inputMoney += 6;
                                inputCups -= 1;
                            }
                            break;
                        case "back":
                            continue;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    inputWater += scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    inputMilk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    inputBeans += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    inputCups += scanner.nextInt();
                    break;
                case "take":
                    System.out.printf("I gave you $%d%n", inputMoney);
                    inputMoney = 0;
                    break;
                case "remaining":
                    printMachineInfo(inputWater, inputMilk, inputBeans, inputCups, inputMoney);
                    break;
            }
        } while (!Objects.equals(choice, "exit"));
    }
}
