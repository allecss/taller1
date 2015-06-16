import java.util.Scanner;

/**
 * Created by Chisko on 8/06/15.
 */
public class Cocina implements AccionesPastel, AccionesCarne {

    public static void main(String[] args) {
        int numdepasteles = 0;
        int numdeCarnes = 0;
        System.out.println("Bienvenido a mi Restaurant. Que chingados qieres?");
        System.out.println("1 - Pastel");
        System.out.println("2 - Sopa");
        System.out.println("3 - Carne");
        System.out.println("Tu opcion: ");

        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        switch(i) {
            case 1:
                Pastel p = new Pastel();
                break;

            case 2:

                break;

            case 3:

                break;

            default:
                System.out.println("Esa opcion no existe");
                break;
        }

        System.out.println("Hay " + numdepasteles);

    }

    @Override
    public void cocinarPastel() {
//        numdepasteles++;
    }

    @Override
    public void venderPastel() {
//        numdepasteles--;

    @Override
    public void cocinarCarne(){
            numdecarnes++;
        }
    @Override
    public void venderCarne(){
            numdeCarnes--;
        }

