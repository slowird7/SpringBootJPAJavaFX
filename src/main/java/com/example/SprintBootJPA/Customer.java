package com.example.SprintBootJPA;

import javafx.beans.property.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Access(AccessType.PROPERTY)
public class Customer implements Serializable {

    private LongProperty id = new SimpleLongProperty();
    private StringProperty firstName = new SimpleStringProperty();
    private StringProperty lastName = new SimpleStringProperty();

    protected Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName.set(firstName); //.set(firstName);
        this.lastName.set(lastName);
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id.get(), firstName, lastName);
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long getId() {
        return id.get();
    }

    public void setId(Long id) {
        this.id.set(id);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String name) {
        this.firstName.set(name);
    }

    public String getLastName() {
        return lastName.get();
    }
    public void setLastName(String name) {
        this.lastName.set(name);
    }

}

