package Moneda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Moneda {
    private double resultado;

    public Moneda(MonedaAPI monedaAPI){
    this.resultado = monedaAPI.conversion_result();
    }

    @Override
    public String toString() {
        return ""+this.resultado;
    }
}
