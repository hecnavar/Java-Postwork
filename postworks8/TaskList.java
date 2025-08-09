package org.bedu.java.jse.postworks8;

import org.bedu.java.jse.postworks8.model.ListTask;
import org.bedu.java.jse.postworks8.model.Task;

import javax.management.ObjectName;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private static final String FILE_NAME = System.getProperty("user.home") + File.separator + ".tareas";
    private Reader reader = new Reader();
    private List<ListTask> listsTasks = new ArrayList<>();

    private Main main = new Main();
    private TaskManager tasks = new TaskManager();

    public TaskList() throws Exception{
        loadTask();
    }

    public void createNewList(){

        System.out.println("Crear nueva lista de tareas.");
        String name = reader.readCadena();
        ListTask list = new ListTask(name);
        listsTasks.add(list);
    }

    public void viewTaskList(){

        System.out.println("Ver listas de tareas.");
        if (!validatesExistenceList()){
            return;
        }

        for (int i = 0; i < listsTasks.size(); i++){
            System.out.println((i+1) + " - " + listsTasks.get(i).getName());
        }
    }

    public void seeListTasks(){

        System.out.println("Ver tareas de lista.");
        byte index = validIndex();

        if (index == 0){
            return;
        }

        ListTask list = listsTasks.get(index - 1);

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

        ListTask currentList = listsTasks.get(index -1);

        main.showTaskOptions();
        byte selectedOption = reader.readOption();

        switch (selectedOption){
            case 1:
                Task newTask = tasks.newTask();
                currentList.addTask(newTask);
                break;
            case 2:
                Task t1 = tasks.deleteTask(currentList);
                if (t1 != null){
                    System.out.println("Se eliminó la tarea " + t1.getName());
                }
                else {
                    System.out.println("No se pudo eliminar la tarea");
                }
                break;
            case 3:
                Task t2 = tasks.markTaskCompleted(currentList);
                if (t2 != null){
                    System.out.println("La tarea " + t2.getName() + " se completó el " + t2.getRealizedDate());
                }else{
                    System.out.println("La tarea no pudo ser marcada como finalizada");
                }
                break;
            case 4:
                break;
            default:
                System.out.println("Opción desconocida");
        }
    }

    public void deleteTaskList(){

        System.out.println("Eliminar lista de tareas.");
        byte index = validIndex();

        if (index == 0){
            return;
        }

        ListTask deletelist = listsTasks.remove((index-1));

        System.out.println("Se eliminó la lista de tareas: " + deletelist.getName());
    }

    private boolean validatesExistenceList(){
        if (listsTasks != null && !listsTasks.isEmpty()){
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

        if (index > listsTasks.size() || index < 0){
            System.out.println("No existen listas de tareas con el numero seleccioando.");
            index = 0;
        }

        return index;
    }

    public void loadTask() throws Exception {
        if (new File(FILE_NAME).exists()){
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
            listsTasks = (List<ListTask>) ois.readObject();
        }
    }

    public void saveTasks() throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
        oos.writeObject(listsTasks);
    }
}
