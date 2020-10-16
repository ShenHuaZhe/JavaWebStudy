package studyServlet.sevrlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ser09")
public class ParamServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String user = req.getParameter("user");
        String psw = req.getParameter("psw");
        String[] hob = req.getParameterValues("hobby");
        System.out.println("用户名：" + user);
        System.out.println("密码：" + psw);
        System.out.println("爱好：");
        for (int i = 0; i < hob.length; i++) {
            System.out.println(hob[i]);
        }

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

}
