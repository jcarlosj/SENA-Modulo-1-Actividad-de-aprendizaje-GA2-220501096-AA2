package estructuras_repetitivas;

public class Punto01 {
    public static void main( String[] args ) {
        double salarioInicial = 1500;
        double incrementoAnual = 0.10;
        int anios = 6;

        salarioPorAnioYDetallePorAnio( salarioInicial, incrementoAnual, anios );
    }

    public static void salarioPorAnioYDetallePorAnio( double salarioInicial, double incrementoAnual, int anios ) {
        double salarioActual = salarioInicial;

        for ( int i = 1; i <= anios; i++ ) {
            double incremento = salarioActual * incrementoAnual;
            salarioActual = salarioActual + incremento;
            System.out.println( "*** Salario en el año " + i + " es: " + salarioActual + " ***");
        }

        System.out.println( " === Salario al cabo de 6 anios: " + salarioActual + " ===");

    }
}
