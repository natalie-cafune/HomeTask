package HomeTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name - ");
        String name = scanner.nextLine();
        System.out.print("Enter your surname - ");
        String surname = scanner.nextLine();
        System.out.println("Enter '0' if you're man or '1' if you're woman");
        byte sex = scanner.nextByte();
        switch (sex) {
            case 0:
                Human humanMan = new Man(name, surname);
                System.out.println("Hello " + humanMan.getName() + " " + humanMan.getSurname());
                humanMan.menuPrint();
                break;
            case 1:
                Human humanWoman = new Woman(name, surname);
                System.out.println("Hello " + humanWoman.getName() + " " + humanWoman.getSurname());
                humanWoman.menuPrint();
                break;
        }
    }
}
