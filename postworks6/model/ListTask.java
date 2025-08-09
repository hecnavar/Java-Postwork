package org.bedu.java.jse.postworks6.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListTask {
    private String name;
    private LocalDate createDate;
    private final List<Task> tasks = new ArrayList<>();
    {
        createDate = LocalDate.now();
    }

    public ListTask(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public LocalDate getCreateDate(){
        return createDate;
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public Task deleteTask(int index) {
        if (index > tasks.size()) {
            System.out.println("La tarea no se esta en la lista");
            return null;
        }

        return tasks.remove(index);
    }

    public List<Task> getTasks(){
        return tasks;
    }

    public int tasksnumber(){
        return tasks.size();
    }

    public void showtasks(){
        for (int i = 0; i < tasks.size(); i++){
            System.out.println((i + 1) + " - " + tasks.get(i).getName());
        }
    }
}
