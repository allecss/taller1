/**
 * Created by Chisko on 13/06/15.
 */
public class Carne {

    String corte;
    double[] termino;
    double precio;
    Cocina cocina;

    public Carne() {
        corte = "";
        termino = new double[3];
//
        termino = {0.5f, 0.75f, 1.0f};
        precio = 299.00;
    }

public void cocinar() {
    double cantDeMat = 50 ;
    System.out.println("carne asada!!");
    cocina.cocinarCarne();
    }

public void vender() {
    System.out.println("carne vendida!!!")
    cocina.venderCarne();
}
}


