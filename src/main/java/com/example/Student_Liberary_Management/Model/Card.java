package com.example.Student_Liberary_Management.Model;

import com.example.Student_Liberary_Management.enums.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Stack;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Card_Details")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cardId;

    @CreationTimestamp
    Date createdON;  //dd-mm-yy  //dd/mm/yy

    @UpdateTimestamp
    Date updateOn;

    @Enumerated(value = EnumType.STRING)
     private CardStatus cardStatus;

    // this is the bidirectional mapping wer to stident and card
     @OneToOne
     @JoinColumn
     Student studentVaribleNameInCardClass;


     // this is the bidoirectioanl mapping wrt to book
     @OneToMany(mappedBy = "cardVaribleName" ,cascade = CascadeType.ALL)
    List<Book> bookIssued= new ArrayList<>();



}
