package org.bedu.java.jse.postworks7;

import org.bedu.java.jse.postworks7.model.ListTask;
import org.bedu.java.jse.postworks7.model.Task;

import java.time.LocalDate;

public class TaskManager {

    private final Reader reader = new Reader();

    public Task newTask(){
        System.out.println("Nueva Tarea");
        System.out.println("Introduce los datos de la nueva tarea: ");
        System.out.println("Nombre: ");
        String taskname = reader.readCadena();

        return new Task(taskname);
    }

    public Task deleteTask(ListTask listTask){
        System.out.println("Eliminar tarea");
        System.out.println("Indica el índice de la tarea a marcar");
        byte index = reader.readOption();

        if (index > listTask.tasksnumber()){
            System.out.println("La tarea indicada no existe");
            return null;
        }

        return listTask.deleteTask(index-1);
    }

    public Task markTaskCompleted(ListTask listTask){
        System.out.println("Finalizar tarea");

        System.out.println("Indica el índice de la tarea a marcar");
        byte index = reader.readOption();

        if (index > listTask.tasksnumber()){
            System.out.println("La tarea indicada no existe.");
            return null;
        }

        Task task = listTask.getTasks().get(index - 1);
        task.setRealizedDate(LocalDate.now());
        task.setRealized(true);

        return task;
    }
}
