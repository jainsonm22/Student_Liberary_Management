package com.example.Student_Liberary_Management.Controller;

import com.example.Student_Liberary_Management.Model.Student;
import com.example.Student_Liberary_Management.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){
        return studentService.createStudent(student);

    }

}
