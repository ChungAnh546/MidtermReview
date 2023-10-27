package vn.edu.iuh.fit.midtermreview.frontend.views;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.midtermreview.backend.models.LopHoc;
import vn.edu.iuh.fit.midtermreview.backend.services.LopHocService;

public class LopHocModel {
    private final LopHocService service = new LopHocService();
    public void insertLopHoc(HttpServletRequest req, HttpServletResponse res)throws Exception{
        String mslop = req.getParameter("mslop");
        String tenlop = req.getParameter("tenlop");
        String giaoviencn = req.getParameter("giaoviencn");
//        String name = req.getParameter("mslop");
        LopHoc lopHoc = new LopHoc(mslop,tenlop,giaoviencn);
        service.insert(lopHoc);
        res.sendRedirect("index.jsp");
    }
}
