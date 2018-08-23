/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.services;

import br.edu.ifpb.daos.DaoPessoa;
import br.edu.ifpb.entidades.Pessoa;
import br.edu.ifpb.interfaces.DaoPessoaInterface;

/**
 *
 * @author mathe
 */
public class ServicePessoa {
    private DaoPessoaInterface daoPessoa;

    public ServicePessoa() {
        this.daoPessoa = new DaoPessoa();
    }
    
    public boolean add(Pessoa pessoa){
        return daoPessoa.create(pessoa);
    }
    
    public Pessoa search(String email){
        return daoPessoa.read(email);
    }
    
    public boolean set(Pessoa pessoa){
        return daoPessoa.update(pessoa);
    }
    
    public boolean remove(Pessoa pessoa){
        return daoPessoa.update(pessoa);
    }
}
