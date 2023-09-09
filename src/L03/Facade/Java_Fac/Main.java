package L03.Facade.Java_Fac;


public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {
        System.out.print(ANSI_CYAN);
        System.out.println("------------------ HOME ------------------");
        System.out.print(ANSI_BLUE);

        HomeActionFacade d = HomeActionFacade.GetInstance();
        d.ExitTheHouse();
        d.Sleep();

        System.out.print(ANSI_CYAN);
        System.out.println("------------------ ATM ------------------");
        System.out.print(ANSI_BLUE);
        ATMFacade facade = new ATMFacade();

            System.out.print(ANSI_PURPLE);
        if (facade.WithDrawMoney()) {
            System.out.println("Enjoy your money");
        } else {
            System.out.println("Something went wrong...");
        }
        System.out.print(ANSI_RESET);
    }
}
