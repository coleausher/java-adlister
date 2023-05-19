package controllers;

import models.Album;
import models.Author;
import models.Quote;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class BeanTest {
    public static void main(String[] args) {
        // Create instances of models.Album
        Album album1 = new Album();
        Album album2 = new Album();

        // Create instances of models.Author
        Author author1 = new Author(1, "Amelia Earhart");
        Author author2 = new Author(2, "Woody Allen");

        // Create instances of models.Quote with associated models.Author and models.Album
        Quote quote1 = new Quote(author1, "The most difficult thing is the decision to act, the rest is merely tenacity.");
        Quote quote2 = new Quote(author2, "Eighty percent of success is showing up.");

        // Create an ArrayList to store models.Quote instances
        List<Quote> quotes = new ArrayList<>();


        // Add the quotes to the ArrayList
        quotes.add(quote1);
        quotes.add(quote2);


        // Iterate over the quotes and print the content and author name
        for (Quote quote : quotes) {
            System.out.println("models.Quote: " + quote.getQuote());
            System.out.println("models.Author: " + quote.getAuthor());
            System.out.println();

        }
    }
}







//@WebServlet(name = "BeanTestServlet", urlPatterns="beans")
//public class BeanTest {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Album album1 = new Album(1, "Chris Brown", "Under the influence", "2020", 1, "R&B");
//        Album album2 = new Album(2, "SZA", "Child's play", "2104", 1, "R&B");
//
//        // Create instances of models.Author
//        Author author1 = new Author(1, "Amelia Earhart");
//        Author author2 = new Author(2, "Woody Allen");
//
//        // Create instances of models.Quote with associated models.Author and models.Album
//        Quote quote1 = new Quote(author1, "The most difficult thing is the decision to act, the rest is merely tenacity.");
//        Quote quote2 = new Quote(author2, "Eighty percent of success is showing up.");
//
//        // Create an ArrayList to store models.Quote instances
//        List<Album> allAlbums = new ArrayList<>();
//        List<Quote> quotes = new ArrayList<>();
//
//        //Add the alums to the ArrayList
//        allAlbums.add(album1);
//        allAlbums.add(album2);
//
//
//        // Add the quotes to the ArrayList
//        quotes.add(quote1);
//        quotes.add(quote2);
//
//        req.setAttribute("albums", allAlbums);
//        req.setAttribute("quotes", quotes);




