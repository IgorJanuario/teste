package br.com.locadora.jdbc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.locadora.jdbc.dao.ClienteDAO;
import br.com.locadora.jdbc.model.Cliente;

public class RemoverContatoLogic implements Logica{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Cliente cliente = new Cliente();
		cliente.setCodigoCliente(id);
		
		ClienteDAO dao = new ClienteDAO();
		dao.deletar(cliente);
		
		System.out.println("Excluindo cliente...");
		
		return "listarcliente.jsp";
	}

}
