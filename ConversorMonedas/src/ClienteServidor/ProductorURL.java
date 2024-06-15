package ClienteServidor;

import java.util.Scanner;
public class ProductorURL {
    String url;
    double valor;
    public void resultado(String actual,String cambio){
        Scanner opcion=new Scanner(System.in);
        System.out.println("Por favor ingrese el valor a convertir");
        valor = opcion.nextDouble();
        String url = "https://v6.exchangerate-api.com/v6/8eb7436644dfc770bbe923a6/pair/" + actual + "/" + cambio + "/" + valor;
    }
    public String getUrl() {
        return url;
    }
    public double getValor(){
        return valor;
    }
}
