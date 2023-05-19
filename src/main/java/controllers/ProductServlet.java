package controllers;

import dao.DaoFactory;
import dao.ProductsDao;
import models.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet(name="ProductServlet", urlPatterns="/products")
public class ProductServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ProductsDao productsDao = DaoFactory.getProductsDao();
        List<Product> allProducts = DaoFactory.getProductsDao().all();

        req.setAttribute("allProducts", allProducts);

        // Examples of other attributes we can send
//        req.setAttribute("colorTheme", "black and white");
//        req.setAttribute("today'sDate", LocalDate.now());

        req.getRequestDispatcher("/products.jsp").forward(req, resp);
    }
//        DaoFactory.getProductsDao().insert();


        @Override
                protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
            String productName = req.getParameter("name");
            double productPrice = Double.parseDouble(req.getParameter("price"));

            Product newProduct = new Product(productName, productPrice);
            DaoFactory.getProductsDao().insert(newProduct);


            // refresh the page so the new product displays
            resp.sendRedirect("/products");
        }

    }

