import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = new Scanner(System.in).nextInt();
        int[] mass = createMass(n);
        //printArray(mass);
        //найти и напечатать наибольший элемент массива
        int max = mass[0];
        int i = 1;
        while (i < mass.length) {
            if (mass[i] > max) max = mass[i];
            i++;
        }
        System.out.println("Maximum -> " + max);

    }

    private void printArray(int[] mass) {
//        for (int i = 0; i < mass.length; i++) {
//            System.out.print(mass[i]+" ");
//        }
        System.out.println(Arrays.toString(mass));
    }

    private int[] createMass(int n) {
        int[] ints = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            ints[i]= random.nextInt(1000);
        }
        return ints;
    }
}
