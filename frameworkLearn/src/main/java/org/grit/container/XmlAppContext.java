package org.grit.container;

import org.grit.container.xmlBeans.Student;
import org.grit.container.xmlBeans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlAppContext {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
        User user = context.getBean("user2", User.class);
        System.out.println(user);

        Student student = context.getBean("student", Student.class);

        System.out.println(student.getUser());

    }
}
