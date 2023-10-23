package logica_secuencial;

import java.util.Scanner;

public class Punto06 {
    public static void main( String[] args ) {
        // Declaramos las variables
        int distancia;
        double velocidad;
        double tiempo;

        // Leemos los valores
        Scanner sc = new Scanner( System.in );
        System.out.print( " > Ingrese la distancia entre las ciudades en kilómetros: " );
        distancia = sc.nextInt();
        System.out.print( " > Ingrese la velocidad de la bicicleta en kilómetros por hora: " );
        velocidad = sc.nextDouble();

        // Calculamos el tiempo
        tiempo = distancia / velocidad;

        // Imprimimos el tiempo
        System.out.println("*** El tiempo de viaje es: " + tiempo + " horas ***");
    }
}
