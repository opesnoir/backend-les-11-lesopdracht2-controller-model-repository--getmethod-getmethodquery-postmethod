package com.example.les11opdracht2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // geeft aan dat dit een entiteit betreft
@Table(name="students") // geeft aan dat de tabel students moet heten
public class Student {

    //id en overige variabelen
    @Id // zegt voeg id toe
    @GeneratedValue // zegt genereer automatisch de id waarde, zodat ik het niet zelf meer hoef te doen
    private Long id;
    private int studentNumber;
    private String fullName;
    private int phoneNumber;

    //getters en setters, zodat de "buitenkant" er ook bij kan, de acces modifiers zijn private en daardoor niet bereikbaar buiten deze code zonder getters en setters.


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
