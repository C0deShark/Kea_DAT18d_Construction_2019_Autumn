import java.util.Set;

public class TypeChecker<T> {

    public static<T> String checkType(T t) {
        if (t instanceof String) {
            return "string";
        } else if (t instanceof Integer) {
            return "integer";
        } else if (t instanceof Boolean) {
            return  "boolean";
        } else if (t instanceof Set) {
            return "set";
        } else if (t instanceof Float) {
            return "float";
        } else if (t instanceof Long) {
            return "long";
        } else if (t instanceof Double) {
            return "double";
        } else {
            return "object";
        }
    }
}
