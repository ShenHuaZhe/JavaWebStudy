package firstAPP.Servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ser02")
public class LifeServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet被调用了。。。");
    }

    @Override
    public void destroy() {
        System.out.println("servlet被删除了。。。");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("servlet被创建了。。。");
    }

}
