package com.student.studentsystem.service;

import com.student.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student); //Add new student
    public List<Student> getAllStudents();//Show newly added student
}
