package org.grit.container.xmlBeans;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class User implements InitializingBean , DisposableBean, BeanNameAware {

    private String name;

    private int age;

    private double high;

    private  double weight;

    public User(String name, int age, double high, double weight) {
        this.name = name;
        this.age = age;
        this.high = high;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", high=" + high +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("user destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("user init");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("user aware name: "+name);
    }
}
