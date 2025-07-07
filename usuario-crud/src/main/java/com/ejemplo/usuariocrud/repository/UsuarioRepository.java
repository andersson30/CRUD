package com.ejemplo.usuariocrud.repository;

import com.ejemplo.usuariocrud.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
} 