package com.APPparedespolleria.appweb.repository;

import com.APPparedespolleria.appweb.model.Pago;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  PagoRepository extends JpaRepository<Pago, Integer>{

    
}