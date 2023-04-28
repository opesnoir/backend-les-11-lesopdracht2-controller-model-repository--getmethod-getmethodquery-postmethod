package com.example.les11opdracht2.controller;

import com.example.les11opdracht2.model.Student;
import com.example.les11opdracht2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students") //hiermee geef je de root-path van alle endpoints aan, alle paden die we definiëren beginnen met de root-path /students
public class StudentController {

    @Autowired // springboot instantieerd met het juiste object in dit geval StudentRepository
    private StudentRepository repos;
    //met repos. kan je nu methodes ophalen

    @GetMapping
    public ResponseEntity<Iterable<Student>> getStudents(){
        return ResponseEntity.ok(repos.findAll());
    }
}
