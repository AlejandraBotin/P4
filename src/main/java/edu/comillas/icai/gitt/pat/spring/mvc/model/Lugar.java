package edu.comillas.icai.gitt.pat.spring.mvc.model;

import jakarta.persistence.*;

@Entity
public class Lugar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private String direccion;
    private String imagenUrl;

    // Getters
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public String getDireccion() { return direccion; }
    public String getImagenUrl() { return imagenUrl; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public void setImagenUrl(String imagenUrl) { this.imagenUrl = imagenUrl; }
}
