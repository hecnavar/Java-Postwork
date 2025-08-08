package org.bedu.java.jse.postworks4.model;

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
}
