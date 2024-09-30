package com.example.inicial1.repositories;

import com.example.inicial1.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean //hace que no se puedan crear instancias de este repositorio
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {

}