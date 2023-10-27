package vn.edu.iuh.fit.midtermreview.backend.services;

import java.util.List;
import java.util.Optional;

public abstract class abstractService<T ,ID> {

    public abstract void insert(T t);

    public abstract void update(T t);
    public abstract Optional<T> findById(ID id);
    public abstract List<T> findAll();

}
