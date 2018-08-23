/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.interfaces;

import br.edu.ifpb.entidades.Pessoa;

/**
 *
 * @author mathe
 */
public interface DaoPessoaInterface {
    public boolean create(Pessoa pessoa);
    public Pessoa read(String email);
    public boolean update(Pessoa pessoa);
    public boolean delete(Pessoa pessoa);
}
