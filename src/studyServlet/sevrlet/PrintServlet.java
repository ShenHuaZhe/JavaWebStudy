package studyServlet.sevrlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/ser05")
public class PrintServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String data = "tjrac";
        OutputStream out = resp.getOutputStream();
        out.write(data.getBytes());
    }

    private void headMethod(HttpServletResponse response){
        response.setStatus(302);
        response.setHeader("Location","/JAVA WEB/login.html");
    }

    private void hangMethod(HttpServletResponse response) throws IOException{
        response.sendError(404,"charter4资源没有找到");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

}
