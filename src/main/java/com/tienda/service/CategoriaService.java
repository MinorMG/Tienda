//3
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //se obtiene un listado de categorias en un list
    public List <Categoria> getCategorias(boolean activos);
    
}
