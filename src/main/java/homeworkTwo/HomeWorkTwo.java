package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {

        // 1.uzdevums 3.punkts - mainīgais x ar loģiskajiem operatoriem
        int x = 8;
        // a)
        System.out.println(x > 0); //true
        // b)
        System.out.println(x < 0); // false
        // c)
        System.out.println(x > 5 && x <= 10); // true
        // d)
        System.out.println(!(x <= 5) || x < 10); // true
        // e)
        System.out.println(x == 0 || x == 10); //false
        // f)
        int y = x * x;
        System.out.println(y > 10); //true

        // 2.uzdevums - mēneša nosaukuma izvade
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet mēneša kārtas numuru: ");
        int menesisNumurs = scanner.nextInt();
        switch (menesisNumurs) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
            case 6:
                System.out.println("Jūnijs");
                break;
            case 7:
                System.out.println("Jūlijs");
                break;
            case 8:
                System.out.println("Augusts");
                break;
            case 9:
                System.out.println("Septembris");
                break;
            case 10:
                System.out.println("Oktobris");
                break;
            case 11:
                System.out.println("Novembris");
                break;
            case 12:
                System.out.println("Decembris");
                break;
            default:
                System.out.println("Nav tāda mēneša!");
        }

        // 3.uzdevums - Jāievada 3 skaitļi, jāizvada lielākais skaitlis
        int n1;
        int n2;
        int n3;
        System.out.println("Ievadiet skaitli X!");
        n1 = scanner.nextInt();
        System.out.println("Ievadiet skaitli Y!");
        n2 = scanner.nextInt();
        System.out.println("Ievadiet skaitli Z!");
        n3 = scanner.nextInt();
        // Math.max(n1, n2, n3);
        // System.out.println(Math.max(Math.max(n1, n2), n3));
        if (n1 > n2 && n1 > n3) {
            System.out.println("Lielākais skaitlis ir: " + n1);
        } else if (n2 > n3) {
            System.out.println("Lielākais skaitlis ir: " + n2);
        } else {
            System.out.println("Lielākais skaitlis ir:" + n3);
        }
        // 4.uzdevums - luksafora signāli
        String krasa = "sarkana";
        System.out.println("Ievadiet luksafora gaismu (sarkana, dzeltena, zaļa)!");
        krasa = scanner.next();
        if (krasa.equals("sarkana")) {
            System.out.println("Nešķērsojiet ceļu!");
        } else if (krasa.equals("dzeltena")) {
            System.out.println("Uzgaidiet mazliet!");
        } else if (krasa.equals("zaļa")) {
            System.out.println("Variet šķērsot ceļu!");
        } else {
            System.out.println("Luksafors nestrādā. Šķērsojiet ceļu prātīgi!");
        }
        // 7.uzdevums - metode aprēķina divu saitļu kopsummu
        System.out.println("Ievadiet x: ");
        int x1 = scanner.nextInt();
        System.out.println("Ievadiet y: ");
        int y1 = scanner.nextInt();
        int summa = sum(x1, y1);
        System.out.println("Ievadīto skaitļu summa ir: " + summa);
    }
    public static int sum(int x1, int y1) {
        return x1 + y1;
/*
        //5.uzdevums - metode izdrukā vizītkarti 3 reizes
        int i = 0;
        while (i < 3) {
            printBusinessCard("Peteris", "Lapa", "+371 258325836", 1990);
            i++;
        }
    }
    private static void printBusinessCard(String name, String surname, String telNr, int bYear) {
        System.out.println("Vizītkarte");
        System.out.println("#############");
        System.out.println("Vārds: " + name);
        System.out.println("Uzvārds: " + surname);
        System.out.println("Telefona numurs: " + telNr);
        System.out.println("Dzimšanas gads: " + bYear);
        System.out.println("#############");
    }

    // 6.uzdevums - metode izdrukā 2 vizītkartes, katru ar saviem argumentiem
    printBusinessCardTwo("Peteris","Lapa","+371 258325836",1990);

    printBusinessCardTwo("Lara","Krafta","+371 258329999",1980);
}
    private static void printBusinessCardTwo(String name, String surname, String telNr, int bYear) {
        System.out.println("Vizītkarte");
        System.out.println("#############");
        System.out.println("Vārds: " + name);
        System.out.println("Uzvārds: " + surname);
        System.out.println("Telefona numurs: " + telNr);
        System.out.println("Dzimšanas gads: " + bYear);
        System.out.println("#############");
    }

        // 8.uzdevums - metore aprēķina vidējo vērtību 3 ievadītajiem skaitļiem
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet x: ");
        double x2 = scanner.nextDouble();
        System.out.println("Ievadiet y: ");
        double y2 = scanner.nextDouble();
        System.out.println("Ievadiet z: ");
        double z2 = scanner.nextDouble();
        double average = avg(x2, y2, z2);
        System.out.println("Vidējā vērtība ir: " + average);
    }

    public static double avg(double x2, double y2, double z2) {
        return (x2 + y2 + z2) / 3;
    } */
 } // jāiekomentē pie 5. un 6. un 8.uzdevuma palaišanas
}
