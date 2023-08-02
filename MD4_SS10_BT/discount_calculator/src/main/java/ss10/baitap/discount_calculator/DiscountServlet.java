package ss10.baitap.discount_calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/display-discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float price = Float.parseFloat(req.getParameter("price"));
        float per = Float.parseFloat(req.getParameter("per"));
        float dAmount = price * per * 0.01;
        float dPrice = price - dAmount;
        PrintWriter writer= resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Discount Amount: "+ dAmount+"</h1>");
        writer.println("<h1>Discount Price: "+ dPrice+"</h1>");
        writer.println("</html>");
    }
}
