package com.example.Student_Liberary_Management.Reposatory;

import com.example.Student_Liberary_Management.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student ,Integer> {
}
