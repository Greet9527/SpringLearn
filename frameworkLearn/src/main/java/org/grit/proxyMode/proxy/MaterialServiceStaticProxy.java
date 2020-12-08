package org.grit.proxyMode.staticProxy.proxy;

import org.grit.proxyMode.beans.Material;
import org.grit.proxyMode.staticProxy.MaterialServiceImpl;
import org.grit.proxyMode.staticProxy.service.IMaterialService;

public class MaterialServiceProxy implements IMaterialService {

    private MaterialServiceImpl materialService = new MaterialServiceImpl();

    @Override
    public void add(Material material) {
        //TODO add之前操作
        System.out.println("代理操作，开启事务");
        materialService.add(material);
        System.out.println("代理操作，关闭事务");
        //TODO add后操作
    }

    @Override
    public Material find(String name) {
        //TODO find之前操作
        Material material = materialService.find(name);
        //TODO find之后操作
        return material;
    }

    @Override
    public void delete(long id) {
        //TODO delete之前操作
        System.out.println("代理操作，开启事务");
        materialService.delete(id);
        System.out.println("代理操作，关闭事务");
        //TODO delete后操作
    }
}
