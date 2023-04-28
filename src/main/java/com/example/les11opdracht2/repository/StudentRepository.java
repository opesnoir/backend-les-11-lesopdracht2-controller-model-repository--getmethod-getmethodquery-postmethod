package com.example.les11opdracht2.repository;

import com.example.les11opdracht2.model.Student;
import org.springframework.data.repository.CrudRepository;

//de interface extends de CrudRepository, je kan dan de methoden van de CrudRepository gebruiken
//je geeft aan welke entiteit je gaat gebruiken in dit geval student en je geeft aan wat het datatype van de identifier (Id) is dat is in dit geval een Long
//de body laat je leeg, je maakt een lege interface aan die erft van de CrudRepository, dat is een spring repository
public interface StudentRepository extends CrudRepository <Student,Long> {

}
