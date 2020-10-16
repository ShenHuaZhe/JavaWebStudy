package studyServlet.sevrlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ser07")
public class LineServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getMethod();
        System.out.println(method);
        String uri = req.getRequestURI();
        System.out.println(uri);
        StringBuffer url = req.getRequestURL();
        System.out.println(url);
        String protocal = req.getProtocol();
        System.out.println(protocal);
        String project = req.getContextPath();
        System.out.println(project);
        String servletString = req.getServletPath();
        System.out.println(servletString);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
