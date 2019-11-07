import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HtmlWelcome extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
    throws ServletException, IOException {

        /**
         *  Indicate the content type (for example, text/html), 
         *  being returned by the response
         */
        response.setContentType("text/html");

        /**
         *  Retrieve an output stream to use to send 
         *  data to the client 
         */
        PrintWriter out = response.getWriter();

        /**
         *  Create an instance of the HtmlPage class
         */
        HtmlPage myPage = new HtmlPage();

        /**
         *  Send appropriate messages to the HtmlPage object
         */
        myPage.setTitle("Welcome");
        myPage.addText("Welcome to iCarnegie!");

        /**
         *  Write the response
         */
        out.println( myPage.buildHtml() );
    }
}
