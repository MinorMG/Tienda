//1

package com.tienda.domain;


import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

//representa tabla en una base de datos
@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private long idCategoria; 
    
    private String descripcion; 
    @Column(name="ruta_imagen")
    private String rutaImagen; 
    private boolean activo; 
    
    @OneToMany
    @JoinColumn(name="id_categoria")
    List<Producto> productos;
    
    //porque los contructorees
    public Categoria() {
    }

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
    
    
    
}
