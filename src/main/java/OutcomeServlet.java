import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/outcome"})
public class OutcomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String outcome = request.getServletPath().substring(1); // Get the outcome from the request URL
        String message;
        if (outcome.equals("correct")) {
            message = "You Won!";
        } else {
            message = "You Lose!";
        }
        request.setAttribute("message", message); // Set the message attribute
        request.getRequestDispatcher("/outcome.jsp").forward(request, response);
    }
}