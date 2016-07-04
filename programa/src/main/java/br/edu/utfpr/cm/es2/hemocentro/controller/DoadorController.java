package br.edu.utfpr.cm.es2.hemocentro.controller;

import java.util.ArrayList;

import br.edu.utfpr.cm.es2.hemocentro.dao.DoadorJpaDao;
import br.edu.utfpr.cm.es2.hemocentro.entity.Doador;

public class DoadorController {
    private DoadorJpaDao dao;

    public DoadorController() {
        dao = new DoadorJpaDao();
    }

    public Doador persist(Doador entity) {
        return dao.persist(entity);
    }

    public Doador merge(Doador entity) {
        return dao.merge(entity);
    }

    public void remove(Long id) {
        dao.remove(id);
        ;
    }

    public ArrayList<Doador> finDall() {
        return (ArrayList<Doador>) dao.finDall();
    }

    public Doador findById(Long id) {
        return dao.findById(id);
    }

}
