package com.example.Student_Liberary_Management.Reposatory;

import com.example.Student_Liberary_Management.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author ,Integer> {
}
