package com.example.Student_Liberary_Management.Service;

import com.example.Student_Liberary_Management.Model.Author;
import com.example.Student_Liberary_Management.Model.Book;
import com.example.Student_Liberary_Management.Reposatory.AuthorRepository;
import com.example.Student_Liberary_Management.Reposatory.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    AuthorRepository authorRepository;
    private AuthorRepository authorRepository1;
    public String addBook(Book book){

        //I want ato get author id here
        int authorId=book.getAuthorVaribleName().getAuthorId();

        //Now i want to fetch author entity
        Author author = authorRepository1.findById(authorId).get();


        book.setAuthorVaribleName(author);

        List<Book> currentBookWritten =author.getBookWritten();
        currentBookWritten.add(book);
        authorRepository.save(author);//Date was modify





        return "";
    }
}
