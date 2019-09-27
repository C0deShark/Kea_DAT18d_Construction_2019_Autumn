import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>(){{
            add(7);
            add(1);
            add(6);
            add(8);
            add(3);
            add(71);
            add(2);
        }};

        /* Ex: 1 */
        int y = 200 * 600; // O(1)
        int x = 800 * (700 / 200); // O(1)
        // System.out.println(y + x); // O(1) + O(1) = O(1)

        /* Ex: 2 */
        double r = 800 * Math.PI; // O(1)
//    alternative way to print out the elements
//    n.forEach(System.out::println);
        n.forEach((number) -> {  // O(n)
            System.out.println(number);
        });
        // total: O(n)

        /* Ex: 3 */
        for (int i = 0; i < n.size(); i++) { // O(n)
            System.out.println(i);
            System.out.println(n.get(i));
        }
        for (int i = n.size() - 1; i >=0; i--) { // O(n)
            System.out.println(n.get(i));
        }
        // total: O(n) + O(n) = O(n)

        /* Ex: 4 */
        for (int i = 0; i < n.size(); i++) {
            for (int j = 0; j < n.size(); j++) {
                System.out.println("How long?");
            }
        }
        // total: O(n^2)

    }
}
