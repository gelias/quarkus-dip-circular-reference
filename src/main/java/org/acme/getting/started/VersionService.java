package org.acme.getting.started;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class VersionService {

//  @Inject
  private final VersionTranslator versionTranslator;
  
  @Inject
  public VersionService(VersionTranslator versionTranslator) {
    this.versionTranslator = versionTranslator;
  }
  
  private final Map<Double, String> versions = 
      new HashMap<Double, String>() {
        private static final long serialVersionUID = 1L;
        { put(10.0,"10.0.0"); }
      };

  public String version() {
    return versionTranslator.translate(10.0);
  }

  public boolean valid(Double version) {
    return versions.containsKey(version);
  }

  public String semantiVersioning(Double version) {
    return versions.get(version);
  }

}
