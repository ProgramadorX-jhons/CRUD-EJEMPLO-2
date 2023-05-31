package com.example.BACKENDRESTAURANTE.Service;

import com.example.BACKENDRESTAURANTE.Entity.ClienteRes;

import java.util.List;

//hoja numero 03
public interface IClienteService {
    //creamos las funciones que realizara nuestro CRUD

    public List<ClienteRes> ConsultarPersona();
    public ClienteRes CrearCliente(ClienteRes cliente);
    public ClienteRes ModificarCliente(ClienteRes cliente);
    public ClienteRes BuscarCliente(Long id);
    public void EliminarCliente(Long id);


}
