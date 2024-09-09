public class reduce {
    public static void main(String[] args) {
        int i = 100;
        int n = 0;
        while (i > 0) {
            if (i % 2 == 0) {
                i = i / 2;
            }
            else {
                i -= 1;
            }
            n += 1;
        }
        System.out.println(n);
    }
}
