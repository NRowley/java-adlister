import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String size = request.getParameter("size");
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");

        List<String> toppings = new ArrayList<>();
        toppings.add(request.getParameter("pepperoni"));
        toppings.add(request.getParameter("sausage"));
        toppings.add(request.getParameter("peppers"));
        toppings.add(request.getParameter("olives"));
        for (int i = 0; i < toppings.size(); i++) {
            if (toppings.get(i) == null) {
                toppings.remove(toppings.get(i));
                i--;
            }
        }
        response.getWriter().println("<h1>Order Received!</h1>");
        System.out.printf("Size: %s%nCrust: %s%nSauce: %s%nToppings: %s%n", size, crust, sauce, toppings);
    }
}
