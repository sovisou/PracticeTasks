package reflection_exmpl;

import java.lang.reflect.Method;

public class DynamicMethodInvoker {
    public void actionA() {
        System.out.println("Action A executed.");
    }

    public void actionB(String message) {
        System.out.println("Action B executed with message: " + message);
    }

    public void actionC(int number) {
        System.out.println("Action C executed with number: " + number);
    }

    public static void main(String[] args) {
        try {
            String methodName = "actionB";
            String argument = "Success!";
            DynamicMethodInvoker invoker = new DynamicMethodInvoker();
             Method method = DynamicMethodInvoker.class.getMethod(methodName, String.class);
            method.invoke(invoker, argument);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
