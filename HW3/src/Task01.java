
public class Task01 {

    public static class Calculator {

        public static <T extends Number> double sum(T t, T v) {
            return t.doubleValue() + v.doubleValue();
        }

        public static <T extends Number> double multiply(T t, T v) {
            return t.doubleValue() * v.doubleValue();
        }

        public static <T extends Number> double divide(T t, T v) {
            if (v.doubleValue() == 0) {
                throw new IllegalArgumentException("Division by zero");
            }

            return t.doubleValue() / v.doubleValue();
        }

        public static <T extends Number> double subtract(T t, T v) {
            return t.doubleValue() - v.doubleValue();
        }

        public static void main(String[] args) {
            System.out.println(Calculator.sum(1.1, 3));
            System.out.println(Calculator.subtract(1.1, 3));
            System.out.println(Calculator.multiply(1.1, 3));
            System.out.println(Calculator.divide(33.33, 3));

        }
    }
}