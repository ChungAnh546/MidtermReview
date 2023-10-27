package vn.edu.iuh.fit.midtermreview.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "lophoc")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQueries(
        @NamedQuery(name = "LopHoc.findAll",query = "select c from LopHoc c")
)
public class LopHoc {
    @Id
    @Column(name = "mslop", length = 15, nullable = false)
    private String id;
    @Column(name = "tenlop",length = 100,nullable = false)
    private String tenlop;
    @Column(name = "giaoviencn",length = 100,nullable = false)
    private String giaoviencn;
    @OneToMany(mappedBy = "lopHoc",fetch = FetchType.LAZY)
    List<SinhVien> sinhVienList;
    public LopHoc( String id , String tenlop, String giaoviencn){
        this.id = id;
        this.tenlop = tenlop;
        this.giaoviencn = giaoviencn;

    }
}
