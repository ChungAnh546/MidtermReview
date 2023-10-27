package vn.edu.iuh.fit.midtermreview.backend.services;

import vn.edu.iuh.fit.midtermreview.backend.models.LopHoc;
import vn.edu.iuh.fit.midtermreview.backend.reponsitories.LopHocReponsitory;

import java.util.List;
import java.util.Optional;

public class LopHocService extends abstractService<LopHoc,String> {
    private final LopHocReponsitory reponsitory;
    public LopHocService()
    {
        reponsitory = new LopHocReponsitory();

    }
    @Override
    public void insert(LopHoc lopHoc) {
        reponsitory.intert(lopHoc);
    }

    @Override
    public void update(LopHoc lopHoc) {
        reponsitory.intert(lopHoc);
    }

    @Override
    public Optional<LopHoc> findById(String s) {
        return reponsitory.findbyId(s);
    }

    @Override
    public List<LopHoc> findAll() {
        return reponsitory.findAll();
    }
}
