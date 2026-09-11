package com.colegiomagico.reto3;

/**
 * Usa un ciclo for para crear una cadena que repita la palabra 'Pocion ' la cantidad de veces indicada.
 */
public class PocionCiclos {

    public static String preparar(int cantidad) {
        String resultado = ""; // Me estaba dando error y la IA me corrigio diciendo que me faltaba una variable
        for (int i = 1; i <= cantidad; i++) {
            resultado += "Pocion ";
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Preparando 3 pociones: " + preparar(3));
    }
}
