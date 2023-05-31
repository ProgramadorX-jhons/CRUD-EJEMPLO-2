package com.example.BACKENDRESTAURANTE.Respository;
//hoja numero 2
import com.example.BACKENDRESTAURANTE.Entity.ClienteRes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//importaremos
//usaremos jpa como apreciara
@Repository
public interface ClienteRepo extends JpaRepository<ClienteRes,Long> {


}
