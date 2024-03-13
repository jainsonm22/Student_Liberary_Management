package com.example.Student_Liberary_Management.Service;


import com.example.Student_Liberary_Management.Model.Card;
import com.example.Student_Liberary_Management.Model.Student;
import com.example.Student_Liberary_Management.Reposatory.StudentRepository;
import com.example.Student_Liberary_Management.enums.CardStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public String createStudent(Student student){
        Card card = new Card();
        //need to set all the varibles  values from the chile class
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setStudentVaribleNameInCardClass(student);

        //need to set all the varible of parenet class also  here which left or you are not sending from postman
        student.setCard(card);
        studentRepository.save(student);
        return "student and card added successfully";



    }

}
