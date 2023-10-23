package logica_secuencial;

import java.util.Scanner;

public class Punto08 {
    public static void main( String[] args ) {
        // Declaramos las variables
        int metrosCúbicos;
        double costoPorMetroCúbico;
        double cuotaFija;

        // Leemos los valores
        Scanner sc = new Scanner(System.in);
        System.out.print(" > Ingrese el consumo de agua en metros cúbicos: " );
        metrosCúbicos = sc.nextInt();
        System.out.print(" > Ingrese el costo por metro cúbico: " );
        costoPorMetroCúbico = sc.nextDouble();
        System.out.print(" > Ingrese la cuota fija mensual: " );
        cuotaFija = sc.nextDouble();

        // Calculamos el costo del consumo de agua
        double costoConsumo = metrosCúbicos * costoPorMetroCúbico;

        // Imprimimos el pago
        System.out.println("*** El pago es: " + ( costoConsumo + cuotaFija ) + " ***");
    }
}
