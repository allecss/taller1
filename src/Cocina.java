import java.util.Scanner;

/**
 * Created by Chisko on 8/06/15.
 */
public class Cocina implements AccionesPastel, AccionesCarne {

    int numeroDePasteles = 0;
    int numdeCarnes = 0;

    public static void main(String[] args) {
        Carne carne;
        // Cambie tu arreglo de numeros por palabras para que sea mas legible la salida (acuerdate que ahorita es puro texto)
        String[] terminoLetras = {"medio", "3/4", "bien cocido"};

        System.out.println("Bienvenido a mi Restaurant. Que chingados qieres?");
        System.out.println("1 - Pastel");
        System.out.println("2 - Sopa");
        System.out.println("3 - Carne");
        System.out.println("Tu opcion: ");

        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        switch (i) {
            case 1:
                Pastel p = new Pastel();
                break;

            case 2:

                break;

            case 3:
                System.out.println("Que termino la quieres: ");
                System.out.println("1 - Medio");
                System.out.println("2 - Tres cuartos");
                System.out.println("3 - Bien cocida");
                int opcion = in.nextInt();

                switch (opcion) {
                    case 1:
                        carne = new Carne(terminoLetras[0]); // o...
                        carne = new Carne(terminoLetras[opcion - 1]);  // tambien se puede
                        break;

                    case 2:
                        carne = new Carne(terminoLetras[1]);
                        carne = new Carne(terminoLetras[opcion - 1]);
                        break;

                    case 3:
                        carne = new Carne(terminoLetras[2]);
                        carne = new Carne(terminoLetras[opcion - 1]);
                        break;

                    default:
                        System.out.println("Tas tonto? Ese número no es opción!");
                }
                break;

            default:
                System.out.println("Esa opcion no existe");
                break;
        }
    }

    @Override
    public void cocinarPastel() {
        numeroDePasteles++;
    }

    @Override
    public void venderPastel() {
        numeroDePasteles--;
    }

    @Override
    public void cocinarCarne(String termino) {
        numdeCarnes++;
        // tenias   numdecarnes++   pero fijate como la C es mayuscula cuando declaras la variable, Java diferencía
        // entre mayúsculas y minusculas, si la cambias no va a correr porque no esta declarada, no existe y quieres
        // hacerle una modificacion, sumarle uno, en este caso;
        System.out.println("Hay " + numdeCarnes + "pasteles");
    }

    @Override
    public void venderCarne() {
        numdeCarnes--;
    }

}

