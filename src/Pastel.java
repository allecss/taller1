/**
 * Created by Chisko on 9/06/15.
 */
public class Pastel {

    String sabor;
    int numDeRebanadas;
    double precio;
    Cocina cocina;

    public Pastel() {
        sabor = "";
        numDeRebanadas = 12;
        precio = 150.50;
    }

    public void cocinar(){
        System.out.println("Pastel cocinado!");
        cocina.cocinarPastel();
    }

    public void vender(){
        System.out.print("pastel Vendido!");
        cocina.venderPastel();


    }

}
