package com.computadoras.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.computadoras.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String>{

}
