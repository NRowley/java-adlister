import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/count")
public class CountServlet extends HttpServlet {
    public static int count = 1;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String reset = req.getParameter("reset");
        if (reset != null) {
            if (reset.equalsIgnoreCase("reset")) {
                count = 1;
                res.getWriter().println("page views: " + count);
            } else {
                res.getWriter().println("page views: " + count++);
            }
        } else {
            res.getWriter().println("page views: " + count++);
        }
    }
}
