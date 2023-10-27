package vn.edu.iuh.fit.midtermreview.backend.resources;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

public abstract class AbstractResource {
    public abstract Response get(@PathParam("id")String id);
    public abstract Response getAll();
}
