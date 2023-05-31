package com.example.BACKENDRESTAURANTE.Controller;
//hoja del ultimo sistema crud
import com.example.BACKENDRESTAURANTE.Entity.ClienteRes;
import com.example.BACKENDRESTAURANTE.Service.IClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //reconoce la clase controllador
@RequestMapping("/Clientes/con") //esto ingresa a la direccion que deses enviar
public class ClientesController {

    //vamos a implementar los metodos la interface clientes;

    IClienteService impl;

    //despues crearemos los metodos de fincionamineto
    @GetMapping//porqque va mostrar las personas de la clase
    @RequestMapping(value="ConsultarPersona",method = RequestMethod.GET) //valor mas mismo nombre  obtengamos objetos de la clase persona
    public ResponseEntity<?> ConsultarPersona(){
        List<ClienteRes> listPersona=this.impl.ConsultarPersona();//agreamos la listay metodos
        return ResponseEntity.ok(listPersona);// va devolver un objeto
    }

    //@RESQUETBODY -- esto es para trabajar con los objetos de la clase
    @PostMapping
    @RequestMapping(value="CrearPersonas",method = RequestMethod.POST)
    public ResponseEntity<?> crearClientes(@RequestBody ClienteRes clienteRes){
        ClienteRes PersonaCreada=this.impl.CrearCliente(clienteRes);//agreamos la listay metodos
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonaCreada);// va devolver un objeto
    }
    @PutMapping
    @RequestMapping(value="ModificarPersonas",method = RequestMethod.PUT)
        public ResponseEntity<?> ModificarClientes(@RequestBody ClienteRes clienteRes){
        ClienteRes ClienteModificada=this.impl.CrearCliente(clienteRes);//agreamos la listay metodos
        return ResponseEntity.status(HttpStatus.CREATED).body(ClienteModificada);// va devolver un objeto
    }
    //@Pat variable teniendo en cuenta esto va actuar el codigo
    //que tenga en cuenta el id
    @GetMapping
    @RequestMapping(value="BuscarPersonas/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> crearClientes(@PathVariable Long id){
        ClienteRes clienteRes=this.impl.BuscarCliente(id);//agreamos la listay metodos
        return ResponseEntity.ok(clienteRes);
    }
    @DeleteMapping
    @RequestMapping(value="EliminarPersona/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarClientes(@PathVariable Long id){
        this.impl.EliminarCliente(id);
        return ResponseEntity.ok().build();
    }






}
