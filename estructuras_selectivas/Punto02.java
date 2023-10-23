package estructuras_selectivas;

public class Punto02 {
    public static void main(String[] args) {

        // Declarar variables
        int horasTrabajadas;
        int pagoHora;
        int sueldoBase;
        int sueldoAdicional;
        int sueldoTotal;

        // Solicitar las horas trabajadas y el pago por hora
        System.out.print( " > Ingrese las horas trabajadas: " );
        horasTrabajadas = Integer.parseInt( System.console().readLine() );
        System.out.print( " > Ingrese el pago por hora: " );
        pagoHora = Integer.parseInt( System.console().readLine() );

        // Calcular el sueldo base
        sueldoBase = horasTrabajadas * pagoHora;

        // Calcular el sueldo adicional
        sueldoAdicional = ( horasTrabajadas - 40 ) * 2 * pagoHora;
        if ( horasTrabajadas <= 40 ) {
            sueldoAdicional = 0;
        }

        // Calcular el sueldo total
        sueldoTotal = sueldoBase + sueldoAdicional;

        // Imprimir el sueldo total
        System.out.println( "*** El sueldo total es de $" + sueldoTotal + " ***");

    }
}
