package org.grit.proxyMode.staticProxy;

import org.grit.proxyMode.beans.Material;
import org.grit.proxyMode.staticProxy.service.IMaterialService;

public class MaterialServiceImpl implements IMaterialService {
    @Override
    public void add(Material material) {
        System.out.println("MaterialServiceImpl 模拟add 操作");
    }

    @Override
    public Material find(String name) {
        System.out.println("MaterialServiceImpl 模拟find 操作");
        return new Material();
    }

    @Override
    public void delete(long id) {
        System.out.println("MaterialServiceImpl 模拟delete 操作");
    }
}
