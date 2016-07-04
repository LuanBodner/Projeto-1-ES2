package br.edu.utfpr.cm.es2.hemocentro.dao;

import br.edu.utfpr.cm.es2.hemocentro.entity.Doador;

public class DoadorJpaDao extends GenericJpaDAO<Doador, Long> {

    public DoadorJpaDao() {
        super(Doador.class);
    }

}