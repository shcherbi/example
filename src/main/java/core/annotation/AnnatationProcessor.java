package core.annotation;

import java.util.HashMap;
import java.util.Map;

public class AnnatationProcessor {
    static Map<String, Object> servicesMap = new HashMap<>();

    public static void main(String[] args) {
        inspectService("core.annotation.LazyService");
        inspectService("core.annotation.SimpleService");
        inspectService("java.lang.String");
        System.out.println(servicesMap);
    }

    public static void inspectService(String service) {
       /* for(Annotation annatation : service.getAnnotations()){
            System.out.println(annatation);
        }
        for(Method method : service.getDeclaredMethods()){
            for(Annotation annatation : method.getAnnotations()){
                System.out.println(annatation);
                System.out.println("\n");
            }
        }*/
        try {
            Class<?> clazz = Class.forName(service);
            if (clazz.isAnnotationPresent(Service.class)) {
                Object serviceObj = clazz.newInstance();
                servicesMap.put(serviceObj.getClass().getName(), serviceObj);
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
