package vn.edu.iuh.fit.midtermreview.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PrivateKey;

@Data
@Entity
@Table(name = "sinhvien")
@AllArgsConstructor
@NoArgsConstructor
@NamedQueries(
        @NamedQuery(name = "SinhVien.findAll",query = "select c from SinhVien c")
)
public class SinhVien {
    @Id
    @Column(name = "mssv",length = 15,nullable = false)
    private String mssv;
    @Column(name = "hoten",length = 100,nullable = false)
    private String hoten;
    @Column(name = "email",length = 150)
    private String email;
    @Column(name = "diachi",length = 200)
    private String diachi;
    @ManyToOne
    private LopHoc lopHoc;
}
