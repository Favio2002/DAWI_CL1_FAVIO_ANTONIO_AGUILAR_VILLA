package com.computadoras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.computadoras.interfaces.AreaInterface;
import com.computadoras.interfaces.AreaRepository;
import com.computadoras.interfaces.ClienteRepository;
import com.computadoras.model.Area;
import com.computadoras.model.Cliente;

@Controller
public class ClienteController {

	//vista
		private static final String CLIENTE_VISTA = "listadoCliente";
		private static final String CLIENTE_REGISTRO = "registro";
		@Autowired
		private ClienteRepository repo;
		
		
		@GetMapping(value="/registrar")
		public String registroClientes(Model model) 
		{

			Cliente c = new Cliente();
			model.addAttribute("cliente",c);
			
			
			return "registro";
		}
		
		@PostMapping("/registrar")
		public String postRegistroClientes(Cliente cliente)
		{
			repo.save(cliente);
			return "listadoCliente";
		}
		
		@GetMapping("/listado")
		public String listadoClientes(Model model) {
			
			model.addAttribute("lstClientes", repo.findAll());
			return "listadoCliente";
		}
		
}
