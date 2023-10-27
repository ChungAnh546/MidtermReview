package vn.edu.iuh.fit.midtermreview.backend.reponsitories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

import java.util.List;
import java.util.Optional;

public abstract class abstractReponsitory<T,ID> {

    public abstract void intert(T t);
    public abstract void update(T t);
    public abstract Optional<T> findbyId(ID id);

    public abstract List<T> findAll();
}
