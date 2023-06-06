package com.tpfinal.tpfinal.controllers;

import com.tpfinal.tpfinal.models.dao.UsuarioImp;
import com.tpfinal.tpfinal.models.domain.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
private UsuarioImp usuarioImp;

    @RequestMapping(value = "/prueba")
    public List<Usuario> getUsuarios() {
        System.out.println("hola");
        return usuarioImp.getUsuarios();
//return List.of("koala");
    }


}
