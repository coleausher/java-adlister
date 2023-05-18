package controllers;

import models.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CarServelt", urlPatterns="/car")


public class CarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Car prius = new Car(1234521234321234L, "Toyota", "Prius Prime", 2023, "Hatchback", 46, "hybrid", true);
        Car supra = new Car(1234323234321234L, "Toyota", "Supra", 1994, "Coupe", 27000, "Gasoline", false);
        Car crossfire = new Car(1234321264321234L, "Chrystler", "Cossfire SRT6", 2006, "Roadster", 40000, "Gasoline", true);

        List<Car> allCars = new ArrayList<>();

        allCars.add(prius);
        allCars.add(supra);
        allCars.add(crossfire);

        req.setAttribute("cars", allCars);

        req.getRequestDispatcher("/cars.jsp").forward(req, resp);



    }

}
