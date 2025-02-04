package com.student.studentsystem.controller;

import com.student.studentsystem.model.Student;
import com.student.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    //save data into database
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";
    }

    //Get all student in database
    @GetMapping("/getAll")
    public List<Student> list(){
        return studentService.getAllStudents();
    }
}
