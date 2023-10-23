package logica_secuencial;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Punto03 {
    public static void main( String[] args ) {
        // Declaramos las variables
        float valorHora;
        String horaEntrada;
        String horaSalida;

        int[] tiempoTotal = new int[ 2 ];

        // Leemos las horas de entrada y salida
        Scanner sc = new Scanner( System.in );
        System.out.print( " > Ingrese valor de hora de parqueo: $" );
        valorHora = sc.nextFloat();

        System.out.println( "Ingrese la siguiente informacion en formato 00:00 a 23:59" );
        System.out.print( " > Hora de entrada del vehículo: " );
        horaEntrada = sc.next();

        System.out.print( " > Hora de salida del vehículo: " );
        horaSalida = sc.next();

        tiempoTotal = diferencia( horaEntrada, horaSalida ); 

        // Imprimimos el cobro
        System.out.println( "*** Pague: $" + calcularCosto( valorHora, tiempoTotal ) + " por " + tiempoTotal[ 0 ] + "h y " + tiempoTotal[ 1 ] + "m de parqueo ***"  );
    }

    public static float calcularCosto( float valorHora, int[] tiempoTotal ) {
        // Calculamos la diferencia entre las horas
        float costoHora = valorHora * tiempoTotal[ 0 ];
        float costoFraccion = tiempoTotal[ 1 ] > 0 ? 1000 : 0;

        
        return costoHora + costoFraccion;
    }

    public static int[] separarHora( String hora ) {
        String[] partes = hora.split( ":" );
        int[] resultado = new int[ 2 ];

        resultado[ 0 ] = Integer.parseInt( partes[ 0 ] );
        resultado[ 1 ] = Integer.parseInt( partes[ 1 ] );

        return resultado;
    }

    public static int[] diferencia( String horaInicio, String horaFinal ) {
        int[] horasMinutos = new int[ 2 ];
        int[] tiempoTotal = new int[ 2 ];

        // Declaramos las horas de entrada y salida
        horasMinutos = separarHora( horaInicio );
        LocalTime horaEntrada = LocalTime.of( horasMinutos[ 0 ], horasMinutos[ 1 ] );

        horasMinutos = separarHora( horaFinal );
        LocalTime horaSalida = LocalTime.of( horasMinutos[ 0 ], horasMinutos[ 1 ] );

        // Calculamos la diferencia entre las horas
        Duration diferencia = Duration.between( horaEntrada, horaSalida );

        // Calculamos total de horas y minutos
        int totalHoras = (int) ( diferencia.toMinutes() / 60 );
        int totalMinutos = (int) ( diferencia.toMinutes() - totalHoras * 60 );

        tiempoTotal[ 0 ] = totalHoras;
        tiempoTotal[ 1 ] = totalMinutos;

        return tiempoTotal;
    }

}
