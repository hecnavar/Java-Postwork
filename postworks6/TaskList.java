package org.bedu.java.jse.postworks6;

import org.bedu.java.jse.postworks6.model.ListTask;
import org.bedu.java.jse.postworks6.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private Reader reader = new Reader();
    private List<ListTask> listTasks = new ArrayList<>();

    public void createNewList(){

        System.out.println("Crear nueva lista de tareas.");
        String name = reader.readCadena();
        ListTask list = new ListTask(name);
        listTasks.add(list);
    }

    public void viewTaskList(){

        System.out.println("Ver listas de tareas.");
        if (!validatesExistenceList()){
            return;
        }

        for (int i = 0; i < listTasks.size(); i++){
            System.out.println((i+1) + " - " + listTasks.get(i).getName());
        }
    }

    public void seeListTasks(){

        System.out.println("Ver tareas de lista.");
        byte index = validIndex();

        if (index == 0){
            return;
        }

        ListTask list = listTasks.get(index -1);

        if (list.tasksnumber() == 0){
            System.out.println("No hay tareas en la lista");
        }

        list.showtasks();
    }

    public void updateToDoList(){

        System.out.println("Actualizar lista de tareas.");
        byte index = validIndex();

        if (index == 0){
            return;
        }
    }

    public void deleteTaskList(){

        System.out.println("Eliminar lista de tareas.");
        byte index = validIndex();

        if (index == 0){
            return;
        }

        ListTask deletelist = listTasks.remove((index-1));

        System.out.println("Se eliminó la lista de tareas: " + deletelist.getName());
    }

    private boolean validatesExistenceList(){
        if (listTasks != null && !listTasks.isEmpty()){
            return true;
        }

        System.out.println("Aún no se ha creado ninguna lista tarea");
        return false;
    }

    private byte validIndex(){
        byte index = 0;

        if (!validatesExistenceList()){
            return index;
        }

        System.out.println("Indique el índice de la lista de tareas");
        index = reader.readOption();

        if (index > listTasks.size() || index < 0){
            System.out.println("No existen listas de tareas con el numero seleccioando.");
            index = 0;
        }

        return index;
    }
}
