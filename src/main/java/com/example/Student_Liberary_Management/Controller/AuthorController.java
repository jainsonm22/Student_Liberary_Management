package com.example.Student_Liberary_Management.Controller;

import com.example.Student_Liberary_Management.Model.Author;
import com.example.Student_Liberary_Management.Model.Student;
import com.example.Student_Liberary_Management.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/add_author")
    public String addAuthor(@RequestBody Author author){
         return authorService.addAuthor(author);
    }
}
