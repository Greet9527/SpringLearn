package org.grit.configs;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("org.grit.*")
@EnableAspectJAutoProxy
public class AspectCfg {
}
