package estructuras_repetitivas;

public class Punto03 {
    public static void main( String[] args ) {
        int ahorroDiario = 3;
        int ahorroAnual = 0;
        int diasEnAnio = 365;

        for ( int i = 1; i <= diasEnAnio; i++ ) {
            ahorroAnual = ahorroAnual + ahorroDiario;
            ahorroDiario = ahorroDiario * 3;
        }

        System.out.println( "*** Ahorro anual en pesos: " + ahorroAnual + " ***");
    }
}
