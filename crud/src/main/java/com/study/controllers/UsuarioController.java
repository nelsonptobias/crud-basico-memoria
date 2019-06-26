package com.study.controllers;


import com.study.dto.Usuario;
import com.study.services.GenericalResponseService;
import com.study.services.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public GenericalResponseService postUsarios(@RequestBody Usuario usuario){
        String create = UsuarioService.Create(usuario);
        return new GenericalResponseService(create);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Usuario> getUsuarios(){
        return UsuarioService.getUsuarios();
    }

    @RequestMapping(value = "getById", method = RequestMethod.GET)
    public List<Usuario> getUsuarioById(@RequestParam("id") Integer aID){
        return UsuarioService.getUsuarios().stream().filter(p -> p.getId() == aID).collect(Collectors.toList());
    }

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    @ResponseBody
    public GenericalResponseService deleteUsuario(@RequestParam("id") Integer aID){
        UsuarioService.getUsuarios().removeIf(p -> p.getId() == aID);
        return new GenericalResponseService("usuario removido com sucesso");

    }

    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public List<Usuario> putUsuario(@RequestParam("id") Integer aID, @RequestBody Usuario aUsuario){
        for (int i = 0; i < UsuarioService.getUsuarios().size() - 1; i++) {
          if (UsuarioService.getUsuarios().get(i).getId() == aID){
              UsuarioService.getUsuarios().get(i).setEmail(aUsuario.getEmail());
              UsuarioService.getUsuarios().get(i).setSenha(aUsuario.getSenha());
          }
        }
       return UsuarioService.getUsuarios();
    }


}
