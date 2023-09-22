package FinalProjectStudent.Controller;

import FinalProject.Zoo;

public class ZooSystem {

    public static void main(String[] args) {
        Zoo zoo = new Zoo.ZooBuilder().setZooName("Safari").setManager(null).build();
        System.out.println("Welcome to the Zoo");
        while (true) {
            int num = MainMenu();
            switch (num) {
                case 1:
                    AnimalMenu();
                    break;
                case 2:
                    EmployeeMenu();
                    break;
                case 3:
                    EnclosureMenu();
                    break;
                case 4:
                    ManagerMenu();
                    break;
                case 5:
                    VisitorMenu();
                    break;
                case 6:
                    System.out.println("Bye Bye");
                    return;

            }
        }

    }

    static int MainMenu() {
        System.out.println("Menu");
        System.out.println("Select the desired option");
        System.out.println("1. Animal Menu");
        System.out.println("2. Employee Menu");
        System.out.println("3. Enclosure Menu");
        System.out.println("4. Manager Menu");
        System.out.println("5. Visitor Menu");
        System.out.println("6. Exit");
        return 0;
    }

    static int EmployeeMenu() {
        System.out.println("EmployeeMenu Menu");

        return 0;
    }

    static int EnclosureMenu() {
        System.out.println("Enclosure Menu");

        return 0;

    }

    static int VisitorMenu() {
        System.out.println("Visitor Menu");

        return 0;
    }

    static int ManagerMenu() {
        System.out.println("Manager Menu");

        return 0;
    }

    static int AnimalMenu() {
        System.out.println("Animal Menu");

        return 0;
    }
}
