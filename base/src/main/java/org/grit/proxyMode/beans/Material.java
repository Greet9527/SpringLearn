package org.grit.proxyMode.beans;

/*
* 物料
* */
public class Material {

    private long id;
    //名称
    private String name;

    //种类
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
