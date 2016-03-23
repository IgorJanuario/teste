package br.com.locadora.jdbc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.locadora.jdbc.logica.Logica;

@WebServlet("/mvc")
public class ControllerServlet extends HttpServlet{

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		String parametro = request.getParameter("logica");
		String nomeDaClasse = "br.com.locadora.jdbc.logica." + parametro;
		
		try
		{
			Class classe = Class.forName(nomeDaClasse);
			
			Logica logica = (Logica) classe.newInstance();
			String pagina = logica.executa(request, response);
			
			request.getRequestDispatcher(pagina).forward(request, response);
		}
		catch(Exception e)
		{
			throw new ServletException("A logica de negócio causou uma exceção",e);
		}
	}
}