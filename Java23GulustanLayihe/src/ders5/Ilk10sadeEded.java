package ders5;


public class Ilk10sadeEded {
    public static void main(String[] args) {
        int i = 0;
        int k = 2;

        while (i < 10) {
            int c = 0;

            for (int j = 1; j <= k; j++) {
                if (k % j == 0) {
                    c++;
                }
            }

            if (c == 2) {
                System.out.println(k);
                i++;
            }

            k++;
        }
    }
}