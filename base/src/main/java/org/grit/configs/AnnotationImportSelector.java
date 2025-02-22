package org.grit.configs;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.function.Predicate;

public class AnnotationImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        ArrayList<String> strings = new ArrayList();
        strings.add("org.grit.container.annotationBeans.Person");
        strings.add("org.grit.container.annotationBeans.Employee");
        strings.add("org.grit.container.annotationBeans.Department");
        return strings.toArray(String[]::new);
    }

}
