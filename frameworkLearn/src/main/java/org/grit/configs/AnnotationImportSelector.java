package org.grit.container.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Predicate;

public class AnnotationImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        ArrayList<String> strings = new ArrayList();
        strings.add("org.grit.container.annotationBeans.Person");
        strings.add("org.grit.container.annotationBeans.Staff");
        strings.add("org.grit.container.annotationBeans.Department");
        return strings.toArray(String[]::new);
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        return null;
    }
}
