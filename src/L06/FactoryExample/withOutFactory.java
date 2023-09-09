package L06.FactoryExample;


import java.util.ArrayList;
import java.util.List;

public class withOutFactory {

    public static void main(String[] args) {
        Pasta pasta = Pasta.OrderPasta("");
    }
}

class Bolognese extends Pasta {
    public void CreateIngredients() {
        System.out.println("Bolognese");
    }
}

class FettuccineAlfredo extends Pasta {
    public void CreateIngredients() {
        System.out.println("FettuccineAlfredo");
    }
}

class SeafoodPasta extends Pasta {
    public void CreateIngredients() {
        System.out.println("SeafoodPasta");
    }
}

class SpinachRavioli extends Pasta {
    public void CreateIngredients() {
        System.out.println("SpinachRavioli");
    }
}

class VeggiePasta extends Pasta {
    public void CreateIngredients() {
        System.out.println("VeggiePasta");
    }
}

abstract class Pasta {
    private List<String> _ingredients = new ArrayList<>();

    public Pasta() {
        CreateIngredients();
    }

    public abstract void CreateIngredients();

    public void prepare() {

    }

    public void cook() {

    }

    public void box() {

    }

    public static Pasta OrderPasta(String type) {
        Pasta pasta;
        if (type.equals("Bolognese")) {
            pasta = new Bolognese();
        } else if (type.equals("FettuccineAlfredo")) {
            pasta = new FettuccineAlfredo();
        } else if (type.equals("SeafoodPasta")) {
            pasta = new SeafoodPasta();
        } else if (type.equals("SpinachRavioli")) {
            pasta = new SpinachRavioli();
        } else {
            pasta = new VeggiePasta();
        }

        pasta.prepare();
        pasta.cook();
        pasta.box();
        return pasta;

    }


}