import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        description="Log in test",
        urlPatterns ={"/LoginServlet"},
        initParams={
                @WebInitParam(name = "user",value = "Priya"),
                @WebInitParam(name = "password",value = "palak")
        }
)


public class LoginServlet extends HttpServlet {
    String validPattern="[A-Z]{1}[a-z]{2,}";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String user = req.getParameter("user");
       String pwd = req.getParameter("pwd");
       String userID = getServletConfig().getInitParameter("user");
       String password =getServletConfig().getInitParameter("password");
        if(userID.matches(validPattern) && userID.equals(user) && password.equals(pwd)){
            req.setAttribute("user",user);
            req.getRequestDispatcher("LogInSuccess.jsp").forward(req,resp);
        }else {
            RequestDispatcher rd=getServletContext().getRequestDispatcher("/LogIn.html");
            PrintWriter out = resp.getWriter();

            out.println("<font color=red>Either user name or password is wrong.</font>");
            rd.include(req,resp);
        }
    }
}
