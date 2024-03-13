package com.example.Student_Liberary_Management.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="student_info")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    @Column(unique = true)
    private String email ;

    private String mobNo;

    private int age ;

    private  String country;

    @OneToOne(mappedBy = "studentVaribleNameInCardClass",cascade = CascadeType.ALL)
    Card card;



}
