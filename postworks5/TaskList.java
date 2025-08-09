package org.bedu.java.jse.postworks5;

public class TaskList {

    private Reader reader = new Reader();

    public void createNewList(){

        System.out.println("Crear nueva lista de tareas.");
        String name = reader.readCadena();
        TaskList taskLists = new TaskList();
    }

    public void viewTaskList(){

        System.out.println("Ver listas de tareas.");
    }

    public void seeListTasks(){

        System.out.println("Ver tareas de lista.");
        byte lista = reader.readOption();
    }

    public void updateToDoList(){

        System.out.println("Actualizar lista de tareas.");
        byte lista = reader.readOption();
    }

    public void deleteTaskList(){

        System.out.println("Eliminar lista de tareas.");
        byte list = reader.readOption();
    }
}
