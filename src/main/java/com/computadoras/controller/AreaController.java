package com.computadoras.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.computadoras.interfaces.AreaRepository;



@Controller
//@RequestMapping("/area")
public class AreaController {
	//vista
	private static final String AREAS_VISTA = "listado";
	@Autowired
	private AreaRepository repo;
	
	
	@GetMapping("/listarArea")
	public String listareas(Model  model) {
		model.addAttribute("areas", repo.findAll());
		return AREAS_VISTA;
	}
	
}
