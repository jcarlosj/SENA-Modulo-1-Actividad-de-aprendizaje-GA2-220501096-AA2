package estructuras_repetitivas;

import java.util.Scanner;

public class Punto04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Ingrese la cantidad de alumnos (N): " );
        int N = scanner.nextInt();

        int sumaEdades = 0;

        for ( int i = 1; i <= N; i++ ) {
            System.out.print( " > Ingrese la edad del alumno " + i + ": " );
            int edad = scanner.nextInt();
            sumaEdades = sumaEdades + edad;
        }

        double edadPromedio = (double) sumaEdades / N;
        System.out.println( "*** La edad promedio de los alumnos es: " + edadPromedio + " ***" );
    }
}
