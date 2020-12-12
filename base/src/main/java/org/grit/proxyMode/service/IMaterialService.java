package org.grit.proxyMode.service;

import org.grit.proxyMode.beans.Material;

public interface IMaterialService {

      void add(Material material);
      Material find(String name);
      void delete(long id);
}
