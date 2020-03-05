package container;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器式单例
 * @Author: CYB
 * @Date: 2020/2/28 18:28
 */
public class ContainerSingleton {

    private ContainerSingleton(){}

    private static ConcurrentHashMap<String,Object> ioc =  new ConcurrentHashMap<String,Object>();

    public static Object getInstance(String className){
        if(ioc.containsKey(className)){
            return ioc.get(className);
        }else {
            synchronized (ContainerSingleton.class){
                if(!ioc.containsKey(className)){

                    Object instance = null;
                    try {
                        Class<?> clazz = Class.forName(className);
                        instance = clazz.newInstance();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    ioc.putIfAbsent(className,instance);
                    return instance;
                }
                return ioc.get(className);
            }
        }
    }
}
