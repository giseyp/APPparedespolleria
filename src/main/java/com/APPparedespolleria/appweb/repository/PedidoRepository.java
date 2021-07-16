package com.APPparedespolleria.appweb.repository;

import com.APPparedespolleria.appweb.model.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  PedidoRepository extends JpaRepository<Pedido, Integer>{
    
}
