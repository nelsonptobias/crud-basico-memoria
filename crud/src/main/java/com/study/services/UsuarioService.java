package com.study.services;

import com.study.dto.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public static String Create(Usuario aUsuario) {
        usuarios.add(aUsuario);
        return  "Usuario criado";
    }

    public static List<Usuario> getUsuarios(){
        return usuarios;

    }

    private static List<Usuario> usuarios = new ArrayList<Usuario>();

}
