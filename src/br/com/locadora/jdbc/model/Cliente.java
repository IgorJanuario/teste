package br.com.locadora.jdbc.model;

import java.util.Calendar;

public class Cliente {

	private String nome;
	private String RG;
	private String CPF;
	private String telefone;
	private String sexo;
	private String email;
	private Calendar datadnascimento;
	private int numeroderegistro;
	private String estadoemissor;
	private Calendar validadeCNH;
	private int codigoCliente;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Calendar getDatadnascimento() {
		return datadnascimento;
	}
	public void setDatadnascimento(Calendar datadnascimento) {
		this.datadnascimento = datadnascimento;
	}
	public int getNumeroderegistro() {
		return numeroderegistro;
	}
	public void setNumeroderegistro(int numeroderegistro) {
		this.numeroderegistro = numeroderegistro;
	}
	public String getEstadoemissor() {
		return estadoemissor;
	}
	public void setEstadoemissor(String estadoemissor) {
		this.estadoemissor = estadoemissor;
	}
	public Calendar getValidadeCNH() {
		return validadeCNH;
	}
	public void setValidadeCNH(Calendar validadeCNH) {
		this.validadeCNH = validadeCNH;
	}
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
}