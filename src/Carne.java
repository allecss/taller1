/**
 * Created by Chisko on 13/06/15.
 */
public class Carne {

    String corte;
    String termino;
    double precio;
    Cocina cocina;

    public Carne(String termino) {
        corte = ""; /*esta linea no tiene mucho sentido de ser, porque al declararla en la linea 6 esto se hace solito,
        crea una palabra que se llama corte y tiene como valor nada (ojo, esto no es lo mismo que null ni void   */

        /* Asi se inicializa un arreglo, aqui estas diciendo quiero un arreglo con 3 posiciones de numeros con punto decimal  */
//        termino = new double[3];

        /* Asi se le da valores, recuerda que los INDICES siempre empiezan en cero... */
//        termino[0] = 0.5;
//        termino[1] = 0.75;
//        termino[2] = 1.0;
        /* PERO    Pensandolo un poco mejor, tampoco esta bien hacer esto aqui, porque esto se corre cada que creas una carne nueva
        y no vas a querer tener tres diferentes datos para cada una porque no se van a usar dos, y esto a la larga se
        traduce en memoria desperdiciada. Es mejor que el arreglo exista en la Cocina y aqui sea una variable normal, sin arreglo      */

        precio = 299.00;

        /* Esta situacion tambien nos servira para explicarte algo que se llama Scope (o rango o alcance) de una variable
        Ve como el dato que se recibe es naranja y es una VARIABLE LOCAL
        y el miembro de la clase es verdecita, en otros lenguajes le dicen VARIABLE GLOBAL
        ¿Qué define dónde empieza y termina un scope? Los corchetes: {  y  }                                            */
        this.termino = termino;

        /* SCOPE DE UNA VARIABLE
        Este método recibe una variable que se llama termino. Pero oh sorpresa, ya tienes un miembro de la clase con ese
        mismo nombre de variable. No se pueden tener dos variables con el mismo nombre porque internamente la variable
        se traduce a una REFERENCIA a una dirección de memoria. (Ver HEXADECIMAL al final)  */

        /* Aqui hay que llamar al metodo cocinar para que se vea algo y tu cocina cocine la carne
         * Si no, como el SCOPE DEL METODO termina en la linea 44, no se ejecuta  */
        cocinar();
        /*  PERO  si lo haces asi va a tronar, porque aunque tienes la varible declarada, en ningún lugar le das un valor
         Esto es un error, "excepción" en el Java lingo, llamado null pointer exception, porque tienes una variable
          que nunca ASIGNASTE o le diste un valor mediante un "igual a"                           */
    }

    public void cocinar() {
        System.out.println("Alguien pidio una carne asada termino " + termino);
        /*Aqui cambie a "Alguien pidio", porque a pesar de que se llama el metodo en la siguiente linea, no puedes
        asegurar que se va a completar o se va a poder llamar, porque es parte de una variable que no esta inicializada   */
        cocina.cocinarCarne(termino);
    }

    public void vender() {
        System.out.println("Carne vendida!!!");
        cocina.venderCarne();
    }
}

/*
Acuerdate que un metodo puede recibir y regresar datos para hacer cosas. Cuando se reciben datos éstos vienen entre
parentesis y están escritos como si los declararas miembros de la clase o variables locales, o sea:
(TipoDeDato nombre)

Si un metodo recibe mas de un dato se separan por comas:
(TipoDato1 dato1, TipoDato2 dato2, TipoDato3 dato3)

Y solo se puede regresar un tipo de dato que va en lugar del void


HEXADECIMAL
NOTA: No te tienes que memorizar esto, pero es importante que lo sepas. Ahi esta la calculadora de Windows que hace esto
Es costumbre y casi exigido que cuando hablas de datos en hexadecimal se les ponga un "0x" antes. Hexadecimal no es
otra cosa que un sistema de numeros con 16 simbolos: los simbolos del 0 al 9 y las letras de la A a la F.
¿Por qué se usan 16 simbolos? No estoy muy seguro, pero creo que sabes la unidad minima digital es un byte, que son 8 bits. Y 8x2 = 16
Para poder representar, por ejemplo, direcciones de memoria, es mas facil hacerlo en hexadecimal porque pemite poner
cantidades muy grandes en pocos "numeros", ademas de que es muchisimo mas facil de recordar
 Ej:

ABCD = 43,981                  necesitaste 4 "numeros" para una cifra de 5
FFFF FFFF = 4,294,967,295      necesitaste 8 "numeros" para una cifra de 10

Dec     Hex
0       0
1       1
...     ...
8       8
9       9
10      A
11      B
12      C
13      D
14      E
15      F

No se si lo llegaste a ver en ingeniería, pero, por ejemplo, el sistema decimal funciona asi:

CENTENAS         +  DECENAS       +  UNIDADES
x10 al cuadrado  + x10 a la uno      x10 a la cero

   4                    7                 2
 x100                 x10                x1
-------          -----------       ------------
  400            +    70                 2       = 472

Entonces:

   A=                  B=                 C=               D=
   10                  11                 12               13
  x16 al cubo          x16 al cuadrado    x16              x16 a la cero
---------------------------------------------------------------------------
   10                  11                 12               13
x4096                  x256               x16              x1
---------------------------------------------------------------------------


 */

