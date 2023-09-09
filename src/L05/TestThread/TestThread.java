package L05.TestThread;

public class TestThread extends Thread {
    private String name;

    public TestThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true)
            System.out.println(name);
    }
}

class testThread extends Thread {
    public void run() {
        while (true)
            System.out.println("pizza");
    }
}

class TestRunnable implements Runnable {
    private String name;
    private String LName;

    public TestRunnable() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }


    @Override
    public void run() {
        while (true)
            System.out.println("pizza");
    }
}

class testRunnable implements Runnable {
    private String name;
    private String LName;

    public testRunnable() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }


    @Override
    public void run() {
        while (true)
            System.out.println("pizza");
    }
}

class TestMain {
    public static void main(String[] args) {
        //--------------- with extend Thread -------------------
        TestThread[] TArray = new TestThread[10];
        for (int i = 0; i < 10; i++) {
            TArray[i] = new TestThread("Th-" + i);
        }
        for (int i = 0; i < 10; i++) {
            TArray[i].start();
            try {
                TArray[i].join(500);
            } catch (Exception e) {

            }
        }
        //--------------- with impl Runnable -------------------
        testRunnable tr = new testRunnable();
//        TestRunnable Tr = new TestRunnable();

        Thread t1 = new Thread(tr);
//        Thread t2 = new Thread(Tr);

        t1.start();
//        t2.start();


    }
}
