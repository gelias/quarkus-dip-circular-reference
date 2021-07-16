package org.acme.getting.started;

public abstract class AbstractResource {

  protected final AbstractService<Version> versionService;
   
  public AbstractResource() {
    versionService = getService();
  }
  protected abstract VersionService getService();
}
