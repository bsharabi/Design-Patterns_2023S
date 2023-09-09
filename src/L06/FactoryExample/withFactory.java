package L06.FactoryExample;

public class withFactory {

    public static void main(String[] args) {
        Pasta pasta = SimplePastaFactory.CreatePasta(PastaType.Bolognese);
    }

}

class SimplePastaFactory {
    public static Pasta CreatePasta(PastaType pastaType) {
        switch (pastaType) {
            case Bolognese:
                return new Bolognese();

            case FettuccineAlfredo:
                return new FettuccineAlfredo();

            case SeafoodPasta:
                return new SeafoodPasta();

            case SpinachRavioli:
                return new SpinachRavioli();

            case VeggiePasta:
                return new VeggiePasta();
            default:
                return null;
        }
    }
}
