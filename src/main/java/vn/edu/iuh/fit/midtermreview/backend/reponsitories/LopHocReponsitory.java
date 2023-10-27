package vn.edu.iuh.fit.midtermreview.backend.reponsitories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import vn.edu.iuh.fit.midtermreview.backend.models.LopHoc;

import java.util.List;
import java.util.Optional;

public class LopHocReponsitory extends abstractReponsitory<LopHoc, String> {

    private EntityManager em;
    private EntityTransaction trans;

    public LopHocReponsitory() {
        em = Persistence
                .createEntityManagerFactory("database_review")
                .createEntityManager();
        trans = em.getTransaction();
    }

    @Override
    public void intert(LopHoc lopHoc) {
        try {
            trans.begin();
            em.persist(lopHoc);
            trans.commit();
        } catch (Exception e) {
            trans.rollback();
        }
    }

    @Override
    public void update(LopHoc lopHoc) {
        try {
            trans.begin();
            em.merge(lopHoc);
            trans.commit();

        } catch (Exception e) {
            trans.rollback();
        }
    }

    @Override
    public Optional<LopHoc> findbyId(String s) {
        TypedQuery<LopHoc> query = em.createQuery("select l from LopHoc l where l.id = :id", LopHoc.class);
        query.setParameter("id", s);
        LopHoc lopHoc = query.getSingleResult();
        return lopHoc == null ? Optional.empty() : Optional.of(lopHoc);
    }

    @Override
    public List<LopHoc> findAll() {

        return em.createNamedQuery("LopHoc.findAll", LopHoc.class).getResultList();
    }
}
