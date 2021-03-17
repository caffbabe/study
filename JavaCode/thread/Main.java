package JavaCode.thread;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list);
        Class<? extends List> clazz=list.getClass();

        Method add=clazz.getDeclaredMethod("add", Object.class);
        add.invoke(list, "kl");
        System.out.println(list);
        
    }
}
