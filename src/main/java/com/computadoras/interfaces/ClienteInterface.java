package com.computadoras.interfaces;

import java.util.List;

import com.computadoras.model.Cliente;

public interface ClienteInterface {

	public int registrar (Cliente a);
	public int consultaCliente(int a);
	 public List<Cliente> listarCliente();
	 
}
