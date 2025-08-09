package org.bedu.java.jse.postworks7;

import java.io.IOException;

public class ClearConsole {
    public static void clearConsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException e) {
            System.err.println("Error al intentar limpiar la consola: " + e.getMessage());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restablecer el estado de interrupción
            System.err.println("El proceso fue interrumpido: " + e.getMessage());
        }
    }
}
