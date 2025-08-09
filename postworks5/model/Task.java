package org.bedu.java.jse.postworks5.model;

import java.time.LocalDate;

public class Task {
    private String name;
    private LocalDate createDate;
    private LocalDate expirationDate;
    private boolean realized;
    private LocalDate realizedDate;

    {
        createDate = LocalDate.now();
    }

    public Task(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        return name.equals(task.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public boolean isRealized() {
        return realized;
    }

    public void setRealized(boolean realized) {
        this.realized = realized;
    }

    public LocalDate getRealizedDate() {
        return realizedDate;
    }

    public void setRealizedDate(LocalDate realizedDate) {
        this.realizedDate = realizedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreateDate(LocalDate createDate) {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate){
        this.createDate = createDate;
    }

    public LocalDate getExpirationDate(){
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate){
        this.expirationDate = expirationDate;
    }
}



