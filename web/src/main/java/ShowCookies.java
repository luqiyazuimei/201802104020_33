import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/showCookies")
public class ShowCookies extends javax.servlet.http.HttpServlet {
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
            throws IOException {
        //得到所有Cookie信息
        Cookie[] allCookies = request.getCookies();
        if (allCookies == null){
            response.getWriter().println("No cookies available.");
        }else {
            for (Cookie cookie : allCookies){
                response.getWriter().println(cookie.getName() + "=" +cookie.getValue());
            }
        }
    }
}
