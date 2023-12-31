package com.fragansias.company.service.contrato;

import java.util.Optional;

public interface GenericoDAO <E> {

    Optional findById(Long id);
    E save(E entidad);
    Iterable<E> findAll();
    void deleteById(Long id);
}
