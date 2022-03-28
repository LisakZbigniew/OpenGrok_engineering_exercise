package util;

import java.util.Vector;
import org.junit.Test;

public class VectorReflectionTests {
    
    @Test
    public void testMethod() throws ClassNotFoundException{
        String className = "java.util.Vector";
        Class vectorClass = Class.forName(className);

        System.out.println("Number of methods: " + vectorClass.getDeclaredMethods().length);
        System.out.println("Paren class: " + vectorClass.getSuperclass().getCanonicalName());
    }

}
