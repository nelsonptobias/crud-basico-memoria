package com.study.dto;

import java.util.concurrent.atomic.AtomicInteger;

public class Usuario {

    private String email;
    private int id;
    private static final AtomicInteger count = new AtomicInteger(0);
    private String senha;

    public int getId() {
        return id;
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



    public Usuario(String email, String senha) {
        this.id = count.incrementAndGet();
        this.email = email;
        this.senha = senha;
    }
}
