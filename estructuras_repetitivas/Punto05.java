package estructuras_repetitivas;

import java.util.Scanner;

public class Punto05 {
        public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );

        System.out.print( " > Ingrese la cantidad de alumnos (N): " );
        int inputNumber = scanner.nextInt();

        int aprobados = 0;
        int reprobados = 0;
        double sumaAprobados = 0;
        double sumaReprobados = 0;
        double sumaTotal = 0;

        for ( int i = 1; i <= inputNumber; i++ ) {
            System.out.print(" > Ingrese la calificación del alumno " + i + ": ");
            double calificacion = scanner.nextDouble();

            sumaTotal += calificacion;

            if ( calificacion >= 3.0 && calificacion <= 5.0 ) {
                aprobados++;
                sumaAprobados += calificacion;
            } else {
                reprobados++;
                sumaReprobados += calificacion;
            }
        }

        double promedioAprobados = aprobados == 0 ? 0 : sumaAprobados / aprobados;
        double promedioReprobados = reprobados == 0 ? 0 : sumaReprobados / reprobados;
        double promedioTotal = sumaTotal / inputNumber;


        System.out.println( "*** Resultados ***" );
        System.out.println( "# de aprobados: " + aprobados );
        System.out.println( "# de reprobados: " + reprobados );
        System.out.println( "- Promedio de notas de los aprobados: " + promedioAprobados );
        System.out.println( "- Promedio de notas de los no aprobados: " + promedioReprobados );
        System.out.println( "- Promedio de notas de todos los alumnos: " + promedioTotal );
    }
}
