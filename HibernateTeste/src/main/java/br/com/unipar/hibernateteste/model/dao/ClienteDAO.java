package br.com.unipar.hibernateteste.model.dao;

import br.com.unipar.hibernateteste.model.Cliente;


public class ClienteDAO extends GenericDAO<Cliente>{
    public ClienteDAO() {
        super(Cliente.class);
    }
}
