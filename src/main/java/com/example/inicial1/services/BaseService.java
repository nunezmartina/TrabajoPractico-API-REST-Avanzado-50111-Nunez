package com.example.inicial1.services;

import com.example.inicial1.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

//dentro de esta interface van a estar las operaciones que sean comunes a todo el modelo

public interface BaseService <E extends Base, ID extends Serializable>{
    public List<E> findAll() throws Exception; //trae una lista de todas las entidades q estan en la base de datos

    //devuelve los datos paginados
    public Page<E> findAll(Pageable pageable) throws Exception;

    public E findById(ID id) throws Exception; //obtiene una persona de acuerdo al id que le pasemos
    public E save(E entity) throws Exception; //crea una nueva entidad
    public E update(ID id, E entity)throws Exception;
    public boolean delete(ID id) throws Exception;

}