package com.tpfinal.tpfinal.models.dao;
import com.tpfinal.tpfinal.models.domain.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UsuarioImp implements IUsuario {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Usuario> ObtenerUsuariosPorEmail(Usuario usuario) {
        String query = "SELECT u FROM Usuario u WHERE u.email = :email";
        List lista = entityManager.createQuery(query).setParameter("email", usuario.getEmail()).getResultList();

        if (lista.isEmpty()) {
            return null;
        }
        return lista;
    }

    @Override
    @Transactional
    public void registrar(Usuario usuario) {
        entityManager.merge(usuario);
    }

    @Override
    @Transactional
    public void editar(Usuario usuario) {
            entityManager.merge(usuario);
    }

    @Override
    @Transactional
    public void eliminar(String email) {
        Usuario usuario = entityManager.find(Usuario.class, email);
        entityManager.remove(usuario);
    }
}
