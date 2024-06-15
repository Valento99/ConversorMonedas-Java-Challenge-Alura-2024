package Principal;

import ClienteServidor.ClienteServidor;
import Menu.Menu;
import Menu.OpcionMenu;
import Moneda.Moneda;
import Moneda.MonedaAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        while(true) {

            var menu = new Menu();
            System.out.println(menu.getMenu());

            //inicializacion de lectura del numero de entrada
            Scanner opcion = new Scanner(System.in);
            int entrada = opcion.nextInt();
            if (entrada == 7) {
                System.out.println("Gracias por elegirnos, Hasta Pronto");
                break;
            }
            OpcionMenu opcionMenu=new OpcionMenu();
            opcionMenu.convertirMoneda(entrada);
            String actual=opcionMenu.getActual();
            String cambio=opcionMenu.getCambio();
            while (true){
                if (actual.equals("") || cambio.equals("")) {
                    System.out.println("Opción inválida. Por favor ingrese una opción del 1 al 7.");
                    System.out.println(menu.getMenu());
                    entrada = opcion.nextInt();
                    opcionMenu.convertirMoneda(entrada);
                    actual = opcionMenu.getActual();
                    cambio = opcionMenu.getCambio();
                }else {
                    break;
                }
            }
            System.out.println("Por favor ingrese el valor a convertir");
            double valor = opcion.nextDouble();
            String url = "https://v6.exchangerate-api.com/v6/8eb7436644dfc770bbe923a6/pair/" + actual + "/" + cambio + "/" + valor;
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            ClienteServidor clienteServidor = new ClienteServidor();
            String json = clienteServidor.ingreso(url);
            MonedaAPI monedaAPI = gson.fromJson(json, MonedaAPI.class);
            Moneda miMoneda = new Moneda(monedaAPI);
            System.out.println("El valor " + valor + " [" + actual + "] corresponde al valor final de ===> " + miMoneda + " [" + cambio + "]");
            valor = 0;
        }
    }
}
