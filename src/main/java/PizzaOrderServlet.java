import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PizzaOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String crustType = request.getParameter("crustType");
        String sauceType = request.getParameter("sauceType");
        String sizeType = request.getParameter("sizeType");
        String[] toppings = request.getParameterValues("toppings");
        String deliveryAddress = request.getParameter("deliveryAddress");

        // Output the values to the console
        System.out.println("Crust Type: " + crustType);
        System.out.println("Sauce Type: " + sauceType);
        System.out.println("Size Type: " + sizeType);
        if (toppings != null) {
            System.out.println("Toppings:");
            for (String topping : toppings) {
                System.out.println("- " + topping);
            }
        }
        System.out.println("Delivery Address: " + deliveryAddress);
    }
}
