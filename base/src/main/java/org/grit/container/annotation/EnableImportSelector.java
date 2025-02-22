package org.grit.container.annotation;

import org.grit.configs.AnnotationImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import(AnnotationImportSelector.class)
public @interface EnableImportSelector {
}
