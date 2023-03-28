package activity24;

public class oTest {
    public static void main(String[] args) {
        Object obj = "Honda Civic";
        String phrase = "Honda Civic";

        bigO.printOnce(obj);

        int n = 3;
        bigO.printNTimes(n, phrase);

        bigO.printNSquaredTimes(n, phrase);
    }

}

