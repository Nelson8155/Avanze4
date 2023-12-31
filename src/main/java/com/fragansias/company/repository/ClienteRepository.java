package com.fragansias.company.repository;

import com.fragansias.company.models.entity.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends CrudRepository<Cliente,Long> {
    @Query(value = "select c from Cliente c where upper(c.nombre) = upper(?1)")
    Optional<Cliente> findByName (String name);
    @Query("select c from Cliente c where c.nombre like %?1% and c.apellido like %?2%")
    Optional<Cliente> buscarPorNombreYApellido(String nombre, String apellido);
    @Query("select c From Cliente c where upper(c.nit) = upper(?1)")
    Optional<Cliente> buscarPorNit(String param1);
    @Query("select c From Cliente c where upper(c.email) = upper(?1)")
    Iterable<Cliente> buscarPorCorreo(String email);
}
