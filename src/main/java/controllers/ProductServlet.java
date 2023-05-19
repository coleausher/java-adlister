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


        // 1. DaoFactory.getProductsDao() - instantiates the ListProducts class.
        // 2. DaoFactory.getProducts.all() - returns a list of all Product objects.
        // 3. Assign to a variable that we can pass to our JSP.
        List<Product> allProducts = DaoFactory.getProductsDao().all();

        // 4. Assigning a key-pair value for all products to be reference in the JSP file using Expression language
        req.setAttribute("allProducts", allProducts);

        // Examples of other attributes we can send
//        req.setAttribute("colorTheme", "black and white");
//        req.setAttribute("today'sDate", LocalDate.now());

        // 5. forwarding the data to the JSP to be used with expression language
        req.getRequestDispatcher("/products.jsp").forward(req, resp);
    }


        @Override
                protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
            String productName = req.getParameter("name");
            long productId = Long.parseLong(req.getParameter("productId"));
            double productPrice = Double.parseDouble(req.getParameter("price"));


            Product newProduct = new Product(productId, productName, productPrice);

            DaoFactory.getProductsDao().insert(newProduct);


            // refresh the page so the new product displays
            resp.sendRedirect("/products");
        }

    }

