//2 liga base de datos con el repositorio cambiar donde dice producto
package com.tienda.dao;

import com.tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoDao extends JpaRepository<Producto,Long>{
    
    
}
