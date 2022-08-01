package com.kamasupaul.com.springrestapi.books;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String  name;
    private String dateOfPublication;
    private String author;

    public Book(){

    }


    public Book(Long id,String name, String dateOfPublication, String auther) {
        this.id = id;
        this.name = name;
        this.dateOfPublication = dateOfPublication;
        this.author = auther;
    }
    public Book(String name, String dateOfPublication, String auther) {
        this.name = name;
        this.dateOfPublication = dateOfPublication;
        this.author = auther;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String auther) {
        this.author = auther;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfPublication='" + dateOfPublication + '\'' +
                ", auther='" + author + '\'' +
                '}';
    }
}
