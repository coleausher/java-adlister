package controllers;

import dao.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "deleteProductServlet", urlPatterns="/product/delete" )
public class deleteProductServlet extends HttpServlet {


        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                DaoFactory.getProductsDao().delete(Integer.parseInt(req.getParameter("productId")));

                resp.sendRedirect("/products");
        }
}








