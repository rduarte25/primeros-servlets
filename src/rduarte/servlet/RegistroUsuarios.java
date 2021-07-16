package rduarte.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistroUsuarios
 */
@WebServlet("/RegistroUsuarios")
public class RegistroUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		response.setContentType("text/html");
		
		PrintWriter salida = response.getWriter();
		
		salida.println("<html><body>");
		salida.println("<h1 style='text-align:center'>Prueba Servlet</h1>");
		salida.println("Nombre introducido" + request.getParameter("nombre"));
		salida.println("<br><br>");
		salida.println("Apellido introducico" + request.getParameter("apellido"));
		salida.println("");
		salida.println("");
		salida.println("Fecha y hora actual: " + new Date());
		salida.println("</body></html>");
		
	}

}
