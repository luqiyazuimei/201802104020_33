import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/createSession")
public class CreateSession extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //�����ǰ�����Ӧ�ŷ������ڴ��е�һ��session�����򷵻ظö���
        //����������ڴ���û��session�����뵱ǰ�����Ӧ���򴴽�һ��session���󲢷��ظö���
        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(15);
        response.getWriter().println("session will lasts 15 seconds");
    }
}