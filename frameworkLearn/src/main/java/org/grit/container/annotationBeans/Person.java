package org.grit.container.annotationBeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service  //@Service/@Controller 作用都是一样的，只是把bean注册到容器
@Scope("prototype")
public class Person {

    //姓名
    @Value("dado")
    private String name;

    //年龄
    @Value("22")
    private int age;

    //身高
    @Value("170.4")
    private double high;

    //体重
    @Value("180.9")
    private double weight;

    //生日
    private LocalDateTime birthday;


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

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }


    @Value("1992-02-02 20:20:20")
    public void setBirthday(String birthday) {

        DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.birthday = LocalDateTime.parse(birthday,df);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", high=" + high +
                ", weight=" + weight +
                ", birthday=" + birthday +
                '}';
    }

    private void init() {
        System.out.println("Person is inited");
    }

    private void destory() {

        System.out.println("Person is destory");
    }
}
