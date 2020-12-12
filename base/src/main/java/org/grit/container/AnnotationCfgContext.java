package org.grit.container;

import org.grit.container.annotationBeans.Person;
import org.grit.container.annotationBeans.Employee;
import org.grit.configs.AnnotationImportAppCfg;
import org.grit.configs.AnnotationScanAppCfg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnnotationCfgContext {

    public static void usePerson(ApplicationContext context){
        Person bean = context.getBean(Person.class);
        System.out.println("person first hashcode: "+ bean.hashCode());

    }

    public static void main(String[] args) {

        ApplicationContext scanContext=new AnnotationConfigApplicationContext(AnnotationScanAppCfg.class);
        ApplicationContext importContext=new AnnotationConfigApplicationContext(AnnotationImportAppCfg.class);
        //System.out.println("staff is singleton? \r\n"+context.isSingleton("staff"));
        //System.out.println(context.isPrototype("person") == true ? "person is prototype" : "person is not prototype");
        usePerson(scanContext);

        Person bean = scanContext.getBean(Person.class);
        System.out.println("person second hashcode: "+bean.hashCode());
        Employee employee = scanContext.getBean(Employee.class);
        System.out.println(employee.getPerson());

        Person person = importContext.getBean(Person.class);
        Person person2 = importContext.getBean(Person.class);
        System.out.println("importContext person first hashcode: "+person.hashCode());
        System.out.println("importContext person second hashcode: "+person.hashCode());

    }
}
