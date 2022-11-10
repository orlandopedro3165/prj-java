package org;

public interface UsuarioRepository extends CrudRepository <Usuario, Integer> {

    void save(org.senai.prjjava.Usuario objU);

    Iterable<org.senai.prjjava.Usuario> findAll();
    
}
