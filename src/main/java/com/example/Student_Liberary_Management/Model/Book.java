package com.example.Student_Liberary_Management.Model;


import com.example.Student_Liberary_Management.enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Book_Detials")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;

    private String name;
    private int pages;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;


    //book is the child wrt Author
    @ManyToOne
    @JoinColumn
    private Author authorVaribleName;//this the varible name which we use in the parent(AUTHOR) to map bidirectional


    //book is the child wrt Card Also
    @ManyToOne
    @JoinColumn
    private Card  cardVaribleName;//this is varible name which we use in parent(Card) for bidirectional mapping


}
