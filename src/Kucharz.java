import java.util.Scanner;

public class Kucharz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj ilość jabłek:");
        int J = sc.nextInt();
        System.out.println("Podaj ilość pomarańczy:");
        int P = sc.nextInt();
        System.out.println("Podaj ilość monet:");
        int Z = sc.nextInt();


        int minDiff = Math.abs(J - P);
        int apples = J;
        int oranges = P;

        for (int i = 0; i <= Z; i++) {

            int newApples = J + i;
            int newOranges = P + (Z - i);
            int newDiff = Math.abs(newApples - newOranges);

            if (newDiff < minDiff) {
                minDiff = newDiff;
                apples = newApples;
                oranges = newOranges;
            }
        }

        System.out.println("Minimalna różnica: " + minDiff);
        System.out.println("Ilość jabłek: " + apples);
        System.out.println("Ilość pomarańczy: " + oranges);
    }
}

