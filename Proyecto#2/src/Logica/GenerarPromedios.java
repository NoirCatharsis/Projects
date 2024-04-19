
package Logica;

public class GenerarPromedios {
    
    // metodo estatico para no tener que crear instancias
    
  public static double calcularPromedioFinal(double proyecto1, double proyecto2, double foro, double encuesta, double juego) {
    double promedioFinal;

    // Calcular el total de puntos ponderados sumando los puntos obtenidos en cada actividad multiplicados por su ponderación
    double totalPuntos = (proyecto1 * 0.4) + (proyecto2 * 0.4) + (foro * 0.1) + (encuesta * 0.05) + (juego * 0.05);

    // Calcular la ponderación total sumando las ponderaciones de todas las actividades
    double totalPonderacion = 0.4 + 0.4 + 0.1 + 0.05 + 0.05;

    // Calcular el promedio final dividiendo el total de puntos ponderados por la ponderación total
    promedioFinal = totalPuntos / totalPonderacion;

    return promedioFinal;
}
    
    
    
    
}
