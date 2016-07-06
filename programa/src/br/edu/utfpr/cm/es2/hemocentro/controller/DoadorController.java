package br.edu.utfpr.cm.es2.hemocentro.controller;

import java.util.List;

import br.edu.utfpr.cm.es2.hemocentro.dao.DoadorJpaDao;
import br.edu.utfpr.cm.es2.hemocentro.entity.Doador;

public class DoadorController {
    private DoadorJpaDao dao;

    public DoadorController() {
        dao = new DoadorJpaDao();
    }

    public void persist(Doador entity) {
        dao.persist(entity);
    }

    public void merge(Doador entity) {
        dao.persist(entity);
    }

    public void remove(Long id) throws Exception {

        dao.delete(Doador.class, id);

    }

    public List<Doador> finDall() {
        return dao.buscaTodos();
    }

    public Doador findById(Long id) {
        return dao.findById(id);
    }

}
