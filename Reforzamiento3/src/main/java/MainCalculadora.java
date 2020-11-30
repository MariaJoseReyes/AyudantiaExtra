public class MainCalculadora {
    public static void main(String[] args) {

        int minimo = Calculadora.crearMenor();
        int maximo = Calculadora.crearMayor(minimo);
        Calculadora.mostrarNumeros(minimo, maximo);

        Calculadora.numAleatorio(minimo,maximo);

        int largo = Calculadora.largoArreglo();
        int[] arreglo = Calculadora.crearArreglo(largo);

        

    }
}
