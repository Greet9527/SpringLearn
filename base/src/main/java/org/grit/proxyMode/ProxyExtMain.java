package org.grit.proxyMode;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.grit.proxyMode.beans.Material;
import org.grit.proxyMode.service.MaterialServiceImpl;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.reflect.FastClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProxyExtMain {
    private static void forgedJdkProxy() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor constructor = MaterialServiceImpl.class.getConstructor();
        MaterialServiceImpl materialService =(MaterialServiceImpl) constructor.newInstance();
        Method add = MaterialServiceImpl.class.getMethod("add", Material.class);
        add.invoke(materialService,new Material());
    }

    private static void forgedCglibProxy() throws InvocationTargetException {
        FastClass fastClass = FastClass.create(MaterialServiceImpl.class);
        Object o = fastClass.newInstance();
        fastClass.invoke("add",new Class[]{Material.class},o,new Object[]{new Material()});
    }
    private final static Log log = LogFactory.getLog(ProxyExtMain.class);
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\workspace\\java\\SpringLearn\\frameworkLearn\\target\\fastClassDebugSource");
        forgedJdkProxy();
        log.info("hello word");
    }
}
