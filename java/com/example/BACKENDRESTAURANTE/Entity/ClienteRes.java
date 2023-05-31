package com.example.BACKENDRESTAURANTE.Entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

//hoja numero 1
@Entity
@Table(name="clientes")
public class ClienteRes {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private String nombre;
    @Column
    private String direccion;
    @Column
    private String n_telefonico;
    @Column
    private String Email;
    @Column
    private String historialPedidos;


    //constructotes

    public ClienteRes() {
        //vacio
    }
    //con parametros

    public ClienteRes(Long id, String nombre, String direccion, String n_telefonico, String email, String historialPedidos) {
        Id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.n_telefonico = n_telefonico;
        Email = email;
        this.historialPedidos = historialPedidos;
    }


    //getters y setter

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getN_telefonico() {
        return n_telefonico;
    }

    public void setN_telefonico(String n_telefonico) {
        this.n_telefonico = n_telefonico;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getHistorialPedidos() {
        return historialPedidos;
    }

    public void setHistorialPedidos(String historialPedidos) {
        this.historialPedidos = historialPedidos;
    }


    //tostring

    @Override
    public String toString() {
        return "ClienteRes{" +
                "Id=" + Id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", n_telefonico='" + n_telefonico + '\'' +
                ", Email='" + Email + '\'' +
                ", historialPedidos='" + historialPedidos + '\'' +
                '}';
    }
}
