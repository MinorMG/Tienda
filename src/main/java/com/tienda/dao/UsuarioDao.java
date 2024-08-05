package com.tienda.dao;

import com.tienda.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author PC MASTER
 */
public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
