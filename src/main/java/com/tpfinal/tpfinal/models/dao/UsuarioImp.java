package com.tpfinal.tpfinal.models.dao;

import com.tpfinal.tpfinal.models.domain.Usuario;
import javax.persistence.*;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public class UsuarioImp implements IUsuario {

    @PersistenceContext
    EntityManager entityManager;


    @Transactional
    public List<Usuario> getUsuarios() {
        String query = "SELECT u FROM Usuario u";
        return entityManager.createQuery(query).getResultList();
    }

}
