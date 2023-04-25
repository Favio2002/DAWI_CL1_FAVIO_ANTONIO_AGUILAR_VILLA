package com.computadoras.interfaces;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.computadoras.model.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area, String> {


}
