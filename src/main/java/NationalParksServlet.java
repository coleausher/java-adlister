import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.datatransfer.DataFlavor;
import java.io.IOException;




@WebServlet(name = "NationalParksServlet", urlPatterns = "/parks")
public class NationalParksServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] nationalParks = new String[] {"White Sands National Park", "Arches National Park", "Grand Canyon National Park"};
        req.setAttribute("parks", nationalParks);

        req.getRequestDispatcher("/parks.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String userInput = req.getParameter("userInput");
        System.out.println(userInput);
        resp.sendRedirect("/parks");
    }

}


