package br.com.locadora.jdbc.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.locadora.jdbc.dao.ClienteDAO;
import br.com.locadora.jdbc.model.Cliente;

public class ListarClienteLogic implements Logica{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Cliente cliente = new Cliente();
		cliente.setCodigoCliente(id);
		
		List<Cliente> clientes = new ClienteDAO().Pesquisar(cliente);
		
		request.setAttribute("clientes", clientes);
		System.out.println("Pesquisou...");
		
		return "editar-cliente.jsp";
	}

}
