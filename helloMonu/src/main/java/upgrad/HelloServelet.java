package upgrad;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet
public class HelloServelet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter p= response.getWriter();
        p.print("<!Doctype html>");
        p.print("<html>");
        p.print("<body>");
        p.print("<p>helllllllooooooooooo</p>");
        p.print("</body>");
        p.print("</html>");
        p.close();


    }
}
