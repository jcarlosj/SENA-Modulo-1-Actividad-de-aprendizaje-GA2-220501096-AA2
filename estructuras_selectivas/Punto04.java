package estructuras_selectivas;

import java.util.Scanner;

public class Punto04 {
        public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Ingrese el precio del artículo: " );
        double precio = scanner.nextDouble();

        double descuento;

        if ( precio >= 200 ) {
            descuento = precio * 0.15;
        } else if ( precio > 100 && precio < 200 ) {
            descuento = precio * 0.12;
        } else {
            descuento = precio * 0.10;
        }

        double costoConDescuento = precio - descuento;

        System.out.println( "*** El descuento es: " + descuento + " ***" );
        System.out.println( "*** El costo con descuento es: " + costoConDescuento + " ***");
    }
}
