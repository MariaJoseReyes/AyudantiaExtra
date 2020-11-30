import java.util.Scanner;
import java.util.Random;
public class Calculadora {

    /*
     1.metodo que reciba por parametros 2 enteros, un minimo y un maximo y generar un numero aleatorio entre ambos

     */

    public static int crearMenor (){
        Scanner leer = new Scanner (System.in);
        int numMen = 21;

        while (numMen<0 || numMen>19){
            System.out.println("Ingrese el numero menor");
            numMen = leer.nextInt();
            if (numMen<0 || numMen>19)
                System.out.println("Error, debe ser un numero entre 0 y 19");
        }
        return numMen;
    }

    public static int crearMayor (int condicion){
        Scanner leer = new Scanner(System.in);
        int numMay = 0;

        while (numMay<condicion || numMay>20){
            System.out.println("Debe ingresar el numero mayor, o sea, mayor a "+condicion+" y menor o igual 20");
            numMay = leer.nextInt();
            if (numMay<condicion)
                System.out.println("Error, debe ser mayor que "+ condicion);
            if (numMay>20)
                System.out.println("Error, debe ser menor o igual que 20");
        }
        return numMay;
    }
    public static void mostrarNumeros(int min, int max){
        System.out.println("Los numeros son:");
        System.out.println("El mayor es: "+max+" y el menor: "+min);
    }

    public static int numAleatorio (int min,int max){
        Random azar = new Random();
        //Hay que sacar un aleatorio entre ambos numeros.
        int diferencia = max - min;
        int aleatorio = azar.nextInt(diferencia)+min;

        System.out.println(aleatorio);
        return aleatorio;
    }

    public static int largoArreglo(){
        Scanner leer = new Scanner (System.in);
        int largo = 0;
        while (largo<1 || largo>10){
            System.out.println("Ingrese el largo que quiere su arreglo");
            largo = leer.nextInt();
            if (largo<1 || largo>10)
                System.out.println("Error, debe ser mayor a 0 y menor, o igual, a 10");
        }
        return largo;
    }

    public static int[] crearArreglo (int n){
        int[] arreglo = new int[n];
        //recuerda que parte del 0 al 4.
        for (int i=0; i< arreglo.length; i++){
            arreglo[i]=i;
            System.out.println(arreglo[i]);
        }
        //if (j-1==i)
        //break;
        return arreglo;
    }
}
