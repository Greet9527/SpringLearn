package org.grit.proxyMode.staticProxy.service;

import org.grit.proxyMode.beans.Material;

public interface IMaterialService {

      void add(Material material);
      Material find(String name);
      void delete(long id);
}
