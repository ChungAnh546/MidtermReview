package vn.edu.iuh.fit.midtermreview.backend.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import vn.edu.iuh.fit.midtermreview.backend.models.LopHoc;
import vn.edu.iuh.fit.midtermreview.backend.services.LopHocService;

import java.util.Optional;

@Path("/lophoc")
public class LopHocResource extends AbstractResource {
    private LopHocService service;

    public LopHocResource() {
        service = new LopHocService();
    }

    @Override
    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response get(@PathParam("id") String id) {
        Optional<LopHoc> lopHoc = service.findById(id);

        if(lopHoc.isPresent()){
            return Response.ok(lopHoc).build();
        }

        return Response.status(Response.Status.BAD_REQUEST).build();
    }

    @Override
    public Response getAll() {
        return null;
    }
}
