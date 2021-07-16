package com.APPparedespolleria.appweb.repository;

import com.APPparedespolleria.appweb.model.Contacto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ContactoRepository extends JpaRepository<Contacto, Integer>{

    
}