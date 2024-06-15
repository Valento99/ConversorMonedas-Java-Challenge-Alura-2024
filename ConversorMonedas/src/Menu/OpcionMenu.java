package Menu;

public class OpcionMenu {
    private String actual = "";
    private String cambio = "";

    public void convertirMoneda(int entrada) {
        switch (entrada) {
            case 1:
                System.out.println("Opcion 1");
                actual = "USD";
                cambio = "ARS";
                break;
            case 2:
                System.out.println("opcion 2");
                actual = "ARS";
                cambio = "USD";
                break;
            case 3:
                System.out.println("opcion 3");
                actual = "USD";
                cambio = "BRL";
                break;
            case 4:
                System.out.println("opcion 4");
                actual = "BRL";
                cambio = "USD";
                break;
            case 5:
                System.out.println("opcion 5");
                actual = "USD";
                cambio = "COP";
                break;
            case 6:
                System.out.println("opcion 6");
                actual = "COP";
                cambio = "USD";
                break;
            default:
        }
    }

    public String getActual() {
        return actual;
    }

    public String getCambio() {
        return cambio;
    }
}
