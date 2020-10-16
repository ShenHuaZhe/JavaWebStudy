package firstAPP.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 实现servlet
 *  1.创建普通java类
 *  2.实现servlet规范，继承HttpServlet类
 *  3.重写service方法，用来处理请求
 *  3.设置注解，指定访问的路径
 */

@WebServlet("/ser01")//路径中的"/"别忘了写
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //打印内容在控制台
        System.out.println("Hello Servlet!");
        //通过流输出数据到浏览器
        resp.getWriter().write("Hello World!");
    }

}
