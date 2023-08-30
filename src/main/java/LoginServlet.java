import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("loggedIn") == null) {
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        } else if ((boolean) request.getSession().getAttribute("loggedIn")) {
            response.sendRedirect("/profile");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        request.getSession().setAttribute("name", username);

        boolean isAdmin = username.equals("admin") && password.equals("password");
        boolean isUser = username.equals("user") && password.equals("password");

        if (isAdmin) {
            response.sendRedirect("/profile");
            request.getSession().setAttribute("isAdmin", true);
            request.getSession().setAttribute("loggedIn", true);
        } else if (isUser) {
            response.sendRedirect("/profile");
            request.getSession().setAttribute("user", true);
            request.getSession().setAttribute("loggedIn", true);
        } else {
            response.sendRedirect("/login");
        }

    }
}
