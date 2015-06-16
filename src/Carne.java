/**
 * Created by Chisko on 13/06/15.
 */
public class Carne {

    String corte;
    double termino;
    double precio;
    Cocina cocina;


    public Carne(){
           corte = "";
           termino = .5 .75 1;
           precio = 299.00;
    }

public void cocinar() {
    System.out.println("carne asada!!");
    cocina.cocinarCarne();
    }

public void vender() {
    System.out.println("carne vendida!!!")
    cocina.venderCarne();
}
}


