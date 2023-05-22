import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        // sessions and cookies lesson
        HttpSession session = request.getSession();
        session.setAttribute("username", "Dr. Codey McFly");


        if(session.getAttribute("username") != null){
            System.out.println("Session username already exists");
        }else{
            session.setAttribute("username", "Dr. Codey McFly");
        }


        request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
    }
}
