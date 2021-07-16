package org.acme.getting.started;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/version")
public class VersionResource extends AbstractResource{

    @Inject
    private VersionService versionService;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/")
    public String hello() {
        return this.versionService.version();
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hi")
    public String hi() {
        return "hello";
    }

    @Override
    protected VersionService getService() {
      return this.versionService;
    }
}