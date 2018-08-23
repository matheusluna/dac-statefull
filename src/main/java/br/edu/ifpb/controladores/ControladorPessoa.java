/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.controladores;

import br.edu.ifpb.entidades.Pessoa;
import br.edu.ifpb.services.ServicePessoa;
import java.io.Serializable;
import java.security.Provider;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author mathe
 */
@Named
@SessionScoped
public class ControladorPessoa implements Serializable{
    private Pessoa novaPessoa = new Pessoa();
    private ServicePessoa servicePessoa = new ServicePessoa();
    private Pessoa user = new Pessoa();
    private String email = "matheusluna96@gmail.com";
    private String senha = "";
    
    public String login(){
        this.user = servicePessoa.search(email);
        if(user != null){
            if(user.getSenha().equals(senha)){
                return "principal.xhtml";
            }
        }
        return "index.xhtml";
    }
    
    public String cadastro(){
        if(this.servicePessoa.add(novaPessoa)){
            this.novaPessoa = new Pessoa();
            return "index.xhtml";
        }else{
            return "cadastro.xhtml";
        }
        
        
    }

    public Pessoa getUser() {
        return user;
    }

    public void setUser(Pessoa user) {
        this.user = user;
    }
    
    
    
    public Pessoa getNovaPessoa() {
        return novaPessoa;
    }

    public void setNovaPessoa(Pessoa novaPessoa) {
        this.novaPessoa = novaPessoa;
    }

    public ServicePessoa getServicePessoa() {
        return servicePessoa;
    }

    public void setServicePessoa(ServicePessoa servicePessoa) {
        this.servicePessoa = servicePessoa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    
}
