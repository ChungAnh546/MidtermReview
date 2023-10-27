package vn.edu.iuh.fit.midtermreview.frontend.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.midtermreview.frontend.views.LopHocModel;

import java.io.IOException;

@WebServlet("/controls" )
public class servletController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {

            Object actionObject = req.getParameter("action");
            if (actionObject != null) {
                String action = actionObject.toString();
                if (action.equals("insert_lophoc")) {
                    LopHocModel lopHocModel = new LopHocModel();
                    lopHocModel.insertLopHoc(req, resp);
                    resp.sendRedirect("insert.jsp");
                }
            } else {
                resp.sendRedirect("insert.jsp");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {

            Object actionObject = req.getParameter("action");
            if (actionObject != null) {
                String action = actionObject.toString();
                if (action.equals("sv_list")) {
                    LopHocModel lopHocModel = new LopHocModel();
                    lopHocModel.insertLopHoc(req, resp);
                    resp.sendRedirect("sv.jsp");
                }
            } else {
                resp.sendRedirect("insert.jsp");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
