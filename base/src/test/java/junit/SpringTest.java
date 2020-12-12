package junit;

import org.grit.container.annotationBeans.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class SpringTest extends BaseTest{
    @Autowired
    private Person person;

    @Test
    public void sout(){
        System.out.println(person);
    }
}
