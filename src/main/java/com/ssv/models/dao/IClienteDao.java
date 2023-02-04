package com.ssv.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ssv.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
