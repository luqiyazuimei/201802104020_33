import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/getSession")
public class GetSession extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //�����ǰ�����Ӧ�ŷ������ڴ��е�һ��session�����򷵻ظö���
        //����������ڴ���û��session�����뵱ǰ�����Ӧ���򷵻�null
        HttpSession session = request.getSession(false);
        response.getWriter().println(session);
        response.getWriter().println("sessionId: " + session.getId());
    }
}