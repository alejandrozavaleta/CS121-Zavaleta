package activity24;

public class bigO {
    public static void printOnce(Object obj) {
        System.out.println(obj);
    }

    public static void printNTimes(int n, String phrase) {
        for (int i = 0; i < n; i++) {
            System.out.println(phrase);
        }
    }

    public static void printNSquaredTimes(int n, String phrase) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(phrase);
            }
        }
    }

}
