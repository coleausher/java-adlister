package controllers;

import models.NationalPark;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="NationalParkServlet", urlPatterns="/parks")
public class NationalParkServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException    {
        NationalPark np1 = new NationalPark(1, "Acadia National Park", "Maine", LocalDate.parse("1919-02-26"), "description");
        NationalPark np2 = new NationalPark(2, "Badlands National Park", "South Dakota", LocalDate.parse("1978-11-10"), "description");
        List<NationalPark> nationalParks = new ArrayList<>();

        nationalParks.add(np1);
        nationalParks.add(np2);

        req.setAttribute("parks", nationalParks);

        req.getRequestDispatcher("/test.jsp").forward(req, res);
    }


}
