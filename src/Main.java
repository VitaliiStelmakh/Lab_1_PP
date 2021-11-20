import java.util.Scanner;
//20.	Визначити N-е число Люка для заданого N≤0.

public class Main {
    public static void main(String[] args) {
        System.out.println("Введіть кількість чисел Люка:");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Luka [] mass = new Luka[n];
        mass[0] = new Luka(1, 1);
        mass[1] = new Luka(2, 3);

        for(int i = 2; i < n; i++) {
            int vl = mass[i - 2].getValue() + mass[i - 1].getValue();
            mass[i] = new Luka(i + 1, vl);
        }

        System.out.println("Список чисел Люка :");
        for(int i = 0; i < n; i++) {
            System.out.print(mass[i].getValue() + " -> ");
        }
        System.out.println("endlist\n");

        System.out.println("Задайте N≤0, для якого хочете визначити число Люка");
        int N=scanner.nextInt();
        if(N<0)
        {
            N*=-1;
        }
        System.out.println( "Число Люка з індексом -"+N+" = " + Math.pow((-1),N)*mass[N - 1].getValue());
    }
}


