package com.example.les11opdracht2.repository;

import com.example.les11opdracht2.model.Student;
import org.springframework.data.repository.CrudRepository;

//toevoegen wat deze interface-repository extends extends CrudRepository <de entiteit waar het over gaat in dit geval student, en de data type van de identifier (Id) in dit geval een long
public interface StudentInterface extends CrudRepository <Student, Long> {
// body blijft leeg, hier staat: dit is een interface die erft van de CrudRepository (dat is een springboot repository)
}
