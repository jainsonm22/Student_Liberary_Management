package com.example.Student_Liberary_Management.Reposatory;

import com.example.Student_Liberary_Management.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book ,Integer> {
}
