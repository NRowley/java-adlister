import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int guessNum = Integer.parseInt(request.getParameter("guess"));
        int num = 1;

        if (guessNum == num) {
            response.sendRedirect("/correct");
        } else {
            response.sendRedirect("/incorrect");
        }

        System.out.println(guessNum);
    }
}
