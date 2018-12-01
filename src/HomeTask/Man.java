package HomeTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Man extends Human {

    private ArrayList<Car> cars;

    public Man(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void menuPrint() {
        boolean checker = true;
        Scanner scanner = new Scanner(System.in);
        this.cars = new ArrayList<>();

        while (checker) {
            System.out.println("Enter what you want to do : ");
            System.out.println("0 : Add car");
            System.out.println("1 : Replace existing car");
            System.out.println("2 : Remove one car");
            System.out.println("3 : Remove all cars");
            System.out.println("4 : Print all cars");
            System.out.println("5 : Exit");
            Scanner sc = new Scanner(System.in);
            byte choice = sc.nextByte();
            switch (choice) {
                case 0:
                    System.out.print("What mark of car do you want to add ? - ");
                    String mark = scanner.nextLine();
                    Car car = new Car(mark);
                    cars.add(car);
                    System.out.println("You added " + car.getMark() + "to list");
                    break;
                case 1:
                    System.out.print("What index of car do you want to replace - ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("What mark of car do you want to add? - ");
                    String newMark = scanner.nextLine();
                    Car carOne = new Car(newMark);
                    cars.set(index, carOne);
                    break;
                case 2:
                    System.out.print("What index of car do you want to remove ? - ");
                    int removeCar = scanner.nextInt();
                    cars.remove(removeCar);
                    break;
                case 3:
                    cars.clear();
                    System.out.println("You removed all cars!");
                    break;
                case 4:
                    if (cars.size() == 0) {
                        System.out.println("List is empty!");
                    } else {
                        for (int i = 0; i < cars.size(); i++) {
                            System.out.println((cars.get(i)).getMark());
                        }
                    }
                    break;
                case 5:
                    checker = false;
                    break;
            }
        }
    }
}


