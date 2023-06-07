package com.tpfinal.tpfinal.models.dao;

import com.tpfinal.tpfinal.models.domain.Usuario;

import java.util.List;

public interface IUsuario {
    List<Usuario> ObtenerUsuariosPorEmail (Usuario usuario);
    void registrar (Usuario usuario);
    void editar (Usuario usuario);
    void eliminar (String email);


}
