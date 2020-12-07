package org.grit.container.config;

import org.grit.container.annotation.EnableImportSelector;
import org.grit.container.annotationBeans.Department;
import org.grit.container.annotationBeans.Person;
import org.grit.container.annotationBeans.Staff;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
* 通过Import bean加载
* */
@Component
//@Import({Person.class, Staff.class, Department.class})
@EnableImportSelector
public class AnnotationImportAppCfg {

}
