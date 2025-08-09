package org.bedu.java.jse.postworks5.model;

import java.time.LocalDate;

public class ListTask {
    private String name;
    private LocalDate createDate;
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
}
