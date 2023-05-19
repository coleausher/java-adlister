package models;

import models.Author;

import java.io.Serializable;

public class Quote implements Serializable {

    private String content;
    private String author;


    public Quote(Author author, String content) {
        this.content = content;
        this.author = String.valueOf(author);
        }

// Getters and setters

public String getQuote() {
        return content;
        }

public void setQuote(String Quote) {
        this.content = content;
        }

public String getAuthor() {
        return author;
        }

public void setAuthor(Author author) {
        this.author = String.valueOf(author);
        }


        }
