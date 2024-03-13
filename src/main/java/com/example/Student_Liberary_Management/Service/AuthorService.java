package com.example.Student_Liberary_Management.Service;

import com.example.Student_Liberary_Management.Model.Author;
import com.example.Student_Liberary_Management.Reposatory.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
  @Autowired
    AuthorRepository authorRepository;

  public String addAuthor(Author author)
   {       authorRepository.save(author);
          return "authore is added successfully";}
  }


