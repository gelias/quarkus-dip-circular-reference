package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class VersionTranslator {

//  @Inject
  private final VersionService versionService;

  @Inject
  public VersionTranslator(VersionService versionService) {
    this.versionService = versionService;
  }
  
  public String translate(Double version) {
    return existsVersion(version) ? 
        versionService.semantiVersioning(version): "";
  }

  private boolean existsVersion(Double version) {
    return versionService.valid(version);
  }

}
