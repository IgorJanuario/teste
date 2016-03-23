package br.com.locadora.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.locadora.jdbc.ConnectionFactory;
import br.com.locadora.jdbc.model.Cliente;

public class ClienteDAO {

private Connection connection;
	
	public ClienteDAO() throws SQLException
	{
			this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adicionar(Cliente cliente)
	{
		String sql = "INSERT INTO Cliente (Nome,RG,CPF,Telefone,Sexo,Email,DatadeNascimento,NumerodeRegistro,EstadoEmissor, validadeCNH) VALUES(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(sql);
		
			ps.setString(1,cliente.getNome());
			ps.setString(2,cliente.getRG());
			ps.setString(3,cliente.getCPF());
			ps.setString(4,cliente.getTelefone());
			ps.setString(5,cliente.getSexo());
			ps.setString(6,cliente.getEmail());
			ps.setDate(7,new Date(cliente.getDatadnascimento().getTimeInMillis()));
			ps.setInt(8,cliente.getNumeroderegistro());
			ps.setString(9,cliente.getEstadoemissor());
			ps.setDate(10,new Date(cliente.getValidadeCNH().getTimeInMillis()));
			
			ps.execute();
			ps.close();
		
		} catch (SQLException e) {
			
			throw new RuntimeException(e);
		}
	}
	public void deletar(Cliente cliente)
	{
		String sql = "DELETE FROM Cliente WHERE idCliente = ?";
		
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(sql);
		
			ps.setInt(1, cliente.getCodigoCliente());
			
			ps.execute();
			ps.close();
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public ArrayList<Cliente> getLista()
	{
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		try {
		String sql = "SELECT * FROM Cliente";
		PreparedStatement ps;
		ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			Cliente cliente = new Cliente();
			cliente.setCodigoCliente(rs.getInt("idCliente"));
			cliente.setCPF(rs.getString("CPF"));
		    
			// Data de Nascimento
			Calendar data = Calendar.getInstance();
			
				data.setTime(rs.getDate("DataDeNascimento"));
			cliente.setDatadnascimento(data);
			
			cliente.setEmail(rs.getString("Email"));
			cliente.setEstadoemissor(rs.getString("EstadoEmissor"));
			cliente.setNome(rs.getString("Nome"));
			cliente.setNumeroderegistro(rs.getInt("NumerodeRegistro"));
			cliente.setRG(rs.getString("RG"));
			cliente.setSexo(rs.getString("Sexo"));
			cliente.setTelefone(rs.getString("Telefone"));
			
			Calendar datadValidade = Calendar.getInstance();
			datadValidade.setTime(rs.getDate("validadeCNH"));
			cliente.setValidadeCNH(datadValidade);
			
			clientes.add(cliente);
		}
		
		rs.close();
		ps.close();
		
		return clientes;
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public List<Cliente> Pesquisar(Cliente cliente)
	{
		List<Cliente> clientes = new ArrayList<Cliente>();
		String sql = "SELECT * FROM Cliente WHERE idCliente = ?";
		
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(sql);
		
		ps.setInt(1, cliente.getCodigoCliente());
		ResultSet rs = ps.executeQuery();
		
			while(rs.next())
			{
				Cliente cl = new Cliente();
				cl.setCodigoCliente(rs.getInt("idCliente"));
				cl.setCPF(rs.getString("CPF"));
			    
				// Data de Nascimento
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("DataDeNascimento"));
				cl.setDatadnascimento(data);
				
				cl.setEmail(rs.getString("Email"));
				cl.setEstadoemissor(rs.getString("EstadoEmissor"));
				cl.setNome(rs.getString("Nome"));
				cl.setNumeroderegistro(rs.getInt("NumerodeRegistro"));
				cl.setRG(rs.getString("RG"));
				cl.setSexo(rs.getString("Sexo"));
				cl.setTelefone(rs.getString("Telefone"));
				
				Calendar datadValidade = Calendar.getInstance();
				datadValidade.setTime(rs.getDate("validadeCNH"));
				cl.setValidadeCNH(datadValidade);
				
				clientes.add(cl);
			}
		rs.close();
		ps.close();
		
		return clientes;
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}