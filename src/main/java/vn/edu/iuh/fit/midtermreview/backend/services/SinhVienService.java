package vn.edu.iuh.fit.midtermreview.backend.services;

import vn.edu.iuh.fit.midtermreview.backend.models.SinhVien;
import vn.edu.iuh.fit.midtermreview.backend.reponsitories.SinhVienReponsitory;

import java.util.List;
import java.util.Optional;

public class SinhVienService extends abstractService<SinhVien,String> {
    private final SinhVienReponsitory reponsitory;
    public SinhVienService()
    {
        reponsitory = new SinhVienReponsitory();

    }

    @Override
    public void insert(SinhVien sinhVien) {
        reponsitory.intert(sinhVien);
    }

    @Override
    public void update(SinhVien sinhVien) {
        reponsitory.update(sinhVien);
    }

    @Override
    public Optional<SinhVien> findById(String s) {
        return reponsitory.findbyId(s);
    }

    @Override
    public List<SinhVien> findAll() {
        return reponsitory.findAll();
    }
}
