package com.example.BACKENDRESTAURANTE.Service;
//hoja numoero 04
import com.example.BACKENDRESTAURANTE.Entity.ClienteRes;
import com.example.BACKENDRESTAURANTE.Respository.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//implemntamos los medoso de la interface
//para dar funciones
@Service
public class ClienteService implements IClienteService{
    //aqui llmaremos al repositorio

    @Autowired //significa que esto notacion ayuda a mostra en la consola
    ClienteRepo clienteRepo;
    //luego usaremos el espacio para poner o insetar variables


    @Override
    public List<ClienteRes> ConsultarPersona() {
        //usaremos this.clienteRepo
        //luego el Lis<>
        return (List<ClienteRes>) this.clienteRepo.findAll();
    }

    @Override
    public ClienteRes CrearCliente(ClienteRes cliente) {
        //ponemos getter y setter
        //usamos la notacion cliente
        cliente.setEmail(cliente.getEmail());
        //llamares a la clase entity
        return this.clienteRepo.save(cliente);
    }

    @Override
    public ClienteRes ModificarCliente(ClienteRes cliente) {
        return this.clienteRepo.save(cliente);
    }

    @Override
    public ClienteRes BuscarCliente(Long id) {
        //la persona por id
        return this.clienteRepo.findById(id).get();
    }

    @Override
    public void EliminarCliente(Long id) {
        //cuando eliminamos no hay retorno
        //por lo cual se usa void  que notara a la eliminacion por id
        this.clienteRepo.deleteById(id);

    }
}
