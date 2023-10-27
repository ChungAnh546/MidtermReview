package vn.edu.iuh.fit.midtermreview.backend.reponsitories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import vn.edu.iuh.fit.midtermreview.backend.models.LopHoc;
import vn.edu.iuh.fit.midtermreview.backend.models.SinhVien;

import java.util.List;
import java.util.Optional;

public class SinhVienReponsitory extends abstractReponsitory<SinhVien, String> {
    private EntityManager em;
    private EntityTransaction trans;

    public SinhVienReponsitory() {
        em = Persistence
                .createEntityManagerFactory("database_review")
                .createEntityManager();
        trans = em.getTransaction();
    }

    @Override
    public void intert(SinhVien sinhVien) {
        try {
            trans.begin();
            em.persist(sinhVien);
            trans.commit();
        } catch (Exception e) {
            trans.rollback();
        }

    }

    @Override
    public void update(SinhVien sinhVien) {
        try {
            trans.begin();
            em.merge(sinhVien);
            trans.commit();
        } catch (Exception e) {
            trans.rollback();
        }

    }

    @Override
    public Optional<SinhVien> findbyId(String s) {
        TypedQuery<SinhVien> query = em.createQuery("select s from SinhVien s where s.mssv = :id", SinhVien.class);
        query.setParameter("id", s);
        SinhVien sinhVien = query.getSingleResult();
        return sinhVien == null ? Optional.empty() : Optional.of(sinhVien);
    }

    @Override
    public List<SinhVien> findAll() {
        return em.createNamedQuery("SinhVien.findAll", SinhVien.class).getResultList();
    }
}
