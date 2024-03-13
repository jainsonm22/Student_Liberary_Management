package com.example.Student_Liberary_Management.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Author_Details")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authorId;

    private String name;
    private int age;
    private String country;

    //This annotation I am wrting in to parent class just bcz this is the part of bidirectional mapping

    @OneToMany(mappedBy = "authorVaribleName" ,cascade = CascadeType.ALL)
    List<Book>  bookWritten = new ArrayList<>();//author can have many books







}
