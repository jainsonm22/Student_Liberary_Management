package com.example.Student_Liberary_Management.Controller;

import com.example.Student_Liberary_Management.Model.Author;
import com.example.Student_Liberary_Management.Model.Book;
import com.example.Student_Liberary_Management.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;
    @PostMapping("/add_book")
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }
}
