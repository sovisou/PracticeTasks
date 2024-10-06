package reflection_exmpl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
       Class employeeClass = Class.forName("reflection_exmpl.Employee");
        Field field1 = employeeClass.getField("id");
        System.out.println("Field type: " + field1.getType());

       Field[] fields = employeeClass.getFields();
       for (Field field : fields) {
           System.out.println("Type of: " + field.getName() + " = " + field.getType() );
       }

        Field[] fields1 = employeeClass.getDeclaredFields();
        for (Field field : fields1) {
            System.out.println("Type of: " + field.getName() + " = " + field.getType() );
        }
        System.out.println("-------");

        Method method1 = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type: " + method1.getReturnType() + " param types: = " + Arrays.toString(method1.getParameterTypes()));

        Method method2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type: " + method2.getReturnType() + " param types: = " + Arrays.toString(method2.getParameterTypes()));


    }
}
