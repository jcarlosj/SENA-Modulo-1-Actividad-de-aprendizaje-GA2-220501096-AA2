package estructuras_selectivas;

import java.util.Scanner;

public class Punto06 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Ingrese las horas trabajadas: " );
        int horasTrabajadas = scanner.nextInt();
        System.out.print( "Ingrese el pago por hora: " );
        double pagoPorHora = scanner.nextDouble();

        double sueldoSemanal = calcularSueldoSemanal( horasTrabajadas, pagoPorHora );
        System.out.println( "*** El sueldo semanal del trabajador es: $" + sueldoSemanal + " ***" );
    }

    public static double calcularSueldoSemanal( int horasTrabajadas, double pagoPorHora ) {
        double sueldo = 0;

        if ( horasTrabajadas <= 40 ) {
            sueldo = horasTrabajadas * pagoPorHora;
        } else if ( horasTrabajadas <= 45 ) {
            sueldo = 40 * pagoPorHora + ( horasTrabajadas - 40 ) * 2 * pagoPorHora;
        } else if ( horasTrabajadas <= 50 ) {
            sueldo = 40 * pagoPorHora + 5 * 2 * pagoPorHora + ( horasTrabajadas - 45 ) * 3 * pagoPorHora;
        } else {
            System.out.println( " --> Trabajar más de 50 horas no está permitido. <-- ");
        }

        return sueldo;
    }
}
