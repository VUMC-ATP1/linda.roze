package homework;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

        int sum = 0;
        int i = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ievadiet skaitli: ");
            i = scanner.nextInt();
            sum += i;
            System.out.println(sum);
        }
        while (sum <= 100);
        {
            System.out.println("Gatavs!");
        }
        // 2.uzdevums
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet skaitli: ");
        int number = scanner.nextInt();
        if (number % 1 == 0 && number % number == 0) {
            System.out.printf("%s ir pirmskaitlis", number);
        } else {
            System.out.printf("%s ir salikts skaitlis", number);
        }

        // 3.uzdevums
        // int masīvs
        int[] myIntArr = {1, 2, 3, 4};
        // a)
        System.out.println("\n == 3.a int - while ==");
        int a = 0;
        while (a < myIntArr.length) {
            System.out.printf(myIntArr[a] + ",");
            a++;
        }
        // b)
        System.out.println("\n == 3.b int - do while ==");
        int b = 0;
        do {
            System.out.printf(myIntArr[b] + ",");
            b++;
        }
        while (b < myIntArr.length);
        {
        }
        // c)
        System.out.println("\n == 3.c int - for ==");
        for (int g = 0; g < myIntArr.length; g++) {
            int element = myIntArr[g];
            System.out.printf(element + ",");
        }
        // d)
        System.out.println("\n == 3.d int - for each ==");
        for (int c : myIntArr) {
            System.out.printf(c + ",");
        }
        // string masīvs
        String[] myStringArr = {"sarkans", "zils", "zaļš", "oranžs", "dzeltens"};
        // a)
        System.out.println("\n == 3.a string - while ==");
        //       int count1 = 0;
        int d = 0;
        while (d < myStringArr.length) {
            System.out.printf(myStringArr[d] + ",");
            d++;
        }
        // b)
        System.out.println("\n == 3.b string - do while ==");
        int e = 0;
        do {
            System.out.printf(myStringArr[e] + ",");
            e++;
        } while (e < myStringArr.length);
        {
        }
        // c)
        System.out.println("\n == 3.c int - for ==");
        for (int h = 0; h < myStringArr.length; h++) {
            String element1 = myStringArr[h];
            System.out.printf(element1 + ",");
        }
        // d)
        System.out.println("\n == 3.d int - for each ==");
        for (String f : myStringArr) {
            System.out.printf(f + ",");
        }
        // char masīvs
        char[] myCharArr = {'A', 'B', 'C', 'D', 'E'};
        // a)
        System.out.println("\n == 3.a char - while ==");
        //       int count1 = 0;
        int k = 0;
        while (k < myCharArr.length) {
            System.out.printf(myCharArr[k] + ",");
            k++;
        }
        // b)
        System.out.println("\n == 3.b char - do while ==");
        int l = 0;
        do {
            System.out.printf(myCharArr[l] + ",");
            l++;
        } while (l < myCharArr.length);
        {
        }
        // c)
        System.out.println("\n == 3.c char - for ==");
        for (int n = 0; n < myCharArr.length; n++) {
            char element2 = myCharArr[n];
            System.out.printf(element2 + ",");
        }
        // d)
        System.out.println("\n == 3.d char - for each ==");
        for (char y : myCharArr) {
            System.out.printf(y + ",");
        }

        //4.uzdevums - skaitļu masīvs, izvada pāra skaitļus
        System.out.println("\n == 4.uzdevums ==");
        int[] numbers = new int[100];
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = j;
            if (j % 2 == 0) {
                System.out.printf(numbers[j] + ",");
            }
        }

        // 5.uzdevums - skaitļa faktoriālā vērtība
        System.out.println("\n == 5.uzdevums ==");
        // Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet skaitli: ");
        int z = scanner.nextInt();
        int fct = 1;
        for (int s = 1; s <= z; s++) {
            fct = fct * s;
        }
        System.out.printf("Faktoriālis ir: %d", fct);

        // 6.uzevums ar if ciklu
        int pin = 1452;
        int cntr = 0;
//        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIevadiet PIN: ");
        int num1 = scanner.nextInt();
        cntr++;
        while (num1 != pin && cntr < 3) {
            System.out.println("Nepareizs PIN, mēģiniet vēlreiz!");
            num1 = scanner.nextInt();
            cntr++;
        }
        if (num1 == pin) {
            System.out.println("\nPIN ir pieņemts, laipni lūdzam!");
        } else if (cntr >= 3) {
            System.out.println("\nAtvainojiet, bet jūs esat bloķēts");
        }
    }
}
