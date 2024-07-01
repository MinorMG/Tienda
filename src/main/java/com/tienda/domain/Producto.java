//1 Tablas

package com.tienda.domain;


import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

//representa tabla en una base de datos
@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private long idProducto;
    //--id_categoria
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    @Column(name="ruta_imagen")
    private String rutaImagen; 
    private boolean activo; 
    
    //llave foranea
    @ManyToOne
    @JoinColumn(name="id_categoria")
    Categoria categoria;
   
    
    //porque los contructorees
    public Producto() {
    }

    public Producto(String descripcion, String detalle, double precio, int existencias, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }  
}
