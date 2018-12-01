package HomeTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Woman extends Human {

    private ArrayList<Lipstick> lipstickArrayList;

    public Woman(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void menuPrint() {
        boolean checker = true;
        Scanner scanner = new Scanner(System.in);
        this.lipstickArrayList = new ArrayList<>();

        while (checker) {
            System.out.println("Enter what you want to do : ");
            System.out.println("0 : Add lipstick");
            System.out.println("1 : Replace existing lipstick");
            System.out.println("2 : Remove one lipstick");
            System.out.println("3 : Remove all lipsticks");
            System.out.println("4 : Print all lipsticks");
            System.out.println("5 : Exit");
            Scanner sc = new Scanner(System.in);
            byte choice = sc.nextByte();
            switch (choice) {
                case 0:
                    System.out.print("What mark of lipstick do you want to add ? - ");
                    String name = scanner.nextLine();
                    Lipstick lipstick = new Lipstick(name);
                    lipstickArrayList.add(lipstick);
                    System.out.println("You added " + lipstick.getNameLipstick() + "to list");
                    break;
                case 1:
                    System.out.print("What index of lipstick do you want to replace ? - ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("What mark of lipstick do you want to add? - ");
                    String newMark = scanner.nextLine();
                    Lipstick lipstickOne = new Lipstick(newMark);
                    lipstickArrayList.add(index, lipstickOne);
                    break;
                case 2:
                    System.out.print("What index of lipstick do you want to remove ? - ");
                    int removeLipstickIndex = scanner.nextInt();
                    lipstickArrayList.remove(removeLipstickIndex);
                    break;
                case 3:
                    lipstickArrayList.clear();
                    System.out.println("You removed all lipsticks!");
                    break;
                case 4:
                    if (lipstickArrayList.size() == 0) {
                        System.out.println("List of lipsticks is empty!");
                    } else {
                        for (int i = 0; i < lipstickArrayList.size(); i++) {
                            System.out.println((lipstickArrayList.get(i)).getNameLipstick());
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
