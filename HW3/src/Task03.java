public class Task03 {
    public static class Pair<T, V> {
        private T first;
        private V second;

        public Pair(T first, V second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public V getSecond() {
            return second;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }

    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("First", 2);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair.toString());


    }

}
