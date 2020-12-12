package org.grit.configs;

import org.grit.container.annotation.EnableImportSelector;
import org.springframework.stereotype.Component;

/*
* 通过Import bean加载
* */
@Component
//@Import({Person.class, Staff.class, Department.class})
@EnableImportSelector
public class AnnotationImportAppCfg {

}
