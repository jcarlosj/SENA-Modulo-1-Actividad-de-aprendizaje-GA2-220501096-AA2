public class Punto01 {
    public static void main( String[] args ) {

        // Declarar variables
        int edad;
        final int EDAD_VOTO = 18;

        // Solicitar la edad de la persona
        System.out.print( "Ingrese su edad: " );
        edad = Integer.parseInt( System.console().readLine() );

        // Determinar si la persona puede votar
        if ( edad >= EDAD_VOTO ) {
            System.out.println( "La persona puede votar" );
            return;
        } 
        
        System.out.println( "La persona no puede votar" );
    }
}