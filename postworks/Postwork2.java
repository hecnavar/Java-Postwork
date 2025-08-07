package org.bedu.java.jse.postworks;

/*
DESARROLLO
Continuarás desarrollando tu proyecto personal. En esta ocasión agregaremos una variable que permitirá seleccionar la opción deseada por el usuario. El valor de esta variable estará en código duro, y en la siguiente sesión permitiremos que este sea un valor introducido por el usuario.

También, dependiendo de la opción seleccionada mostraremos un mensaje que indique dicha opción, con número y texto, y el mensaje "En construcción...
 */

public class Postwork2 {
    public static void main(String[] args){
    short opc = 1;
        String message;

            System.out.println("1. Crear nueva lista de tareas");
            System.out.println("2. Ver listas de tareas");
            System.out.println("3. Ver taraes de lista");
            System.out.println("4. Actualizar listas de tareas");
            System.out.println("5. Eliminar lista de tareas");

        switch (opc){
            case 1:
                message = "Crear nueva lista de tareas.";
                break;
            case 2:
                message = "Ver listas de tareas.";
                break;
            case 3:
                message = "Ver tareas de lista.";
                break;
            case 4:
                message = "Actualizar lista de tareas.";
                break;
            case 5:
                message = "Eliminar lista de tareas.";
                break;
            default:
                message = "Opción desconocida.";
        }

            System.out.println("\n\nLa opción seleccionada es: " + opc + " " + message);
            System.out.println("En construcción..... estará lista muy pronto");

        }
    }

