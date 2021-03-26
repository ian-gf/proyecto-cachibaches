package com.example.demo.entities.campo;

import com.example.demo.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Campo {

    @Id
    private String id;
    private String nombre;
    private String direccion;
    private String tipo;

    public Campo() { }

    public Campo(String id, String nombre, String direccion, String tipo) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTipo(String tipo) { this.tipo = tipo;}

    public String getTipo() { return tipo;}

}
