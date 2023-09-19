package L08;

public class PT {

    protected int a;
    protected int b;
    protected int c;


    public PT(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public PT(PT other) {
        this.a = other.a;
        this.b = other.b;
        this.c = other.c;
    }

}

class A{
    protected int a;
    protected void func(){
        System.out.println("A");
    }
}
class B extends A{
    protected int b;
    protected void func(){
        System.out.println("B");
    }
}
class C extends B{
    protected int c;
    protected void func(){
        System.out.println("C");
    }
}
class D extends C{
    protected int d;
    protected void func(){
        System.out.println("D");
    }
}

class PTTest{

    public static void main(String[] args) {
        PT pt = new PT(1,2,3);
        PT pt1 = new PT(pt.a,pt.b,pt.c);

        PT pt2 = new PT(pt);

        pt=pt1;

        A a = new A();
        A b = new B();
        A c = new C();
        A d = new D();


        B b1 = new B();
        B c1 = new C();
        B d1 = new D();

        C c2 = new C();
        C d2 = new D();

        D d3 = new D();


        a.func();// out -> A
        b.func();// out -> B
        c.func();// out -> C
        d.func();// out -> D

        b1.func();// out -> B
        c1.func();// out -> C
        d1.func();// out -> D

        c2.func();// out -> C
        d2.func();// out -> D

        d3.func();// out -> D



    }
}
