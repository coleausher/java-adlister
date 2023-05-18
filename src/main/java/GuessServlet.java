import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        Random random = new Random();
//        int randomNum = random.nextInt(3) + 1;
//
//        if (randomNum == Integer.parseInt(request.getParameter("userNum"))) {
//            response.sendRedirect("/correct");
//        } else {
//            response.sendRedirect("/incorrect");
//        }
//    }


        String numberParam = request.getParameter("number");
        if (numberParam != null && !numberParam.isEmpty()) {
            try {
                int userGuess = Integer.parseInt(numberParam);
                if (userGuess >= 1 && userGuess <= 3) {
                    if (userGuess == 2) {
                        response.sendRedirect("/correct");
                    } else {
                        response.sendRedirect("/incorrect");
                    }
                } else {
                    response.sendRedirect("/guess");
                }
            } catch (NumberFormatException e) {
                response.sendRedirect("/guess");
            }
        } else {
            response.sendRedirect("/guess");
        }
    }
}