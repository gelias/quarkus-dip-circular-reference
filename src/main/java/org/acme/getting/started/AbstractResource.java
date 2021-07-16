package org.acme.getting.started;

public abstract class AbstractResource<T extends MyEntity> {

  protected final AbstractService<T> versionService;
   
  public AbstractResource() {
    versionService = getService();
  }
  protected abstract AbstractService<T> getService();
}
