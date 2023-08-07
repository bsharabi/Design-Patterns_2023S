package L01.Singleton.java;

public class App {
    public static void main(String[] args) {
        Singleton s1 = Singleton.GetInstance();
        Singleton s2 = Singleton.GetInstance();

        System.out.println(s1 == s2);  //--> true
        System.out.println(s1);  //--> Singleton@6a6824be
        System.out.println(s2);  //--> Singleton@6a6824be

        Singleton t1 = Singleton.GetInstance();
        Singleton t2 = Singleton.GetInstance();

        System.out.println(t1);
        System.out.println(t1);
        System.out.println(t1==t2);

    }

}
