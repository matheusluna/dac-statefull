/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.daos;

import br.edu.ifpb.entidades.Pessoa;
import br.edu.ifpb.interfaces.DaoPessoaInterface;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author mathe
 */
public class DaoPessoa implements DaoPessoaInterface{
    private EntityManager manager;
    private EntityTransaction transaction;
    
    public DaoPessoa() {
        this.manager = Persistence
                .createEntityManagerFactory("cadastroPessoa")
                .createEntityManager();
        this.transaction = manager.getTransaction();
    }
    
    @Override
    public boolean create(Pessoa pessoa) {
        this.transaction.begin();
        this.manager.persist(pessoa);
        this.transaction.commit();
        return true;
    }

    @Override
    public Pessoa read(String email) {
        this.transaction.begin();
        Pessoa pessoa = this.manager.find(Pessoa.class, email);
        this.transaction.commit();
        return pessoa;
    }

    @Override
    public boolean update(Pessoa pessoa) {
        
        return false;
    }

    @Override
    public boolean delete(Pessoa pessoa) {
       
        return false;
    }
}
