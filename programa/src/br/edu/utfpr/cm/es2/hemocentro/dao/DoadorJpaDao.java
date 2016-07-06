package br.edu.utfpr.cm.es2.hemocentro.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.utfpr.cm.es2.hemocentro.entity.Doador;

public class DoadorJpaDao extends GenericJpaDAO<Doador> {

    @SuppressWarnings("unchecked")
    public List<Doador> buscaTodos() {
        EntityManager em = getEntityManager();
        List<Doador> doadores = new ArrayList<Doador>();
        try {
            Query q = em.createNamedQuery("Doador.buscaTodos");
            doadores = q.getResultList();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            doadores = new ArrayList<>();
        } finally {
            em.close();
        }
        return doadores;
    }

    public Doador findById(Long id) {
        EntityManager em = getEntityManager();
        Doador u = new Doador();
        try {
            Query q = em.createNamedQuery("Doador.buscaPorId");
            q.setParameter("id", id);
            u = (Doador) q.getSingleResult();
        } catch (Exception e) {
            u = null;
            System.out.println("Erro: " + e.getMessage());
        } finally {
            em.close();
        }
        return u;
    }

}
