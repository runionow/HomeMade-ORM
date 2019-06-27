import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class PlayReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        String personClassName = "com.runionow.models.Person";

        Class<?> personClass = Class.forName(personClassName);
        System.out.println("Person Class = "+ personClassName);

        System.out.println("Fields");
        Field[] fields = personClass.getFields();
        System.out.println(Arrays.toString(fields));

        System.out.println("Delcared Fields");
        fields = personClass.getDeclaredFields();
        System.out.println(Arrays.toString(fields));

        System.out.println("Methods");
        Method[] methods = personClass.getMethods();
        System.out.println(Arrays.toString(methods));

        System.out.println("Declared Methods");
        methods = personClass.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));
    }
}
