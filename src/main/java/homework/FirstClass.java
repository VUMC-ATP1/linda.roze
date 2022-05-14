package homework;

public class FirstClass {
    public static void main(String[] args) {
        // Country description with concatenation
        String countryName="Australia";
        System.out.printf("3.a) My chosen country is %s %n", countryName);
        System.out.printf("------------------------------------ %n");

        int countryPopulation=25690000;
        System.out.printf("3.b) un 4. Population of " + countryName + ": %d people %n", countryPopulation);

        int countryArea=7692024;
        System.out.printf("3.c) un 4. Area size of " + countryName + ": %d km %n", countryArea);

        String countryCapital="Canberra";
       // System.out.printf("Capital of Australia: %d", countryCapital);
        System.out.printf("3.d) un 4. Capital of " + countryName + ": %s %n", countryCapital);

        String countryLanguage="English";
        System.out.printf("3.e) un 4. Official Language in " + countryName + ": %s %n", countryLanguage);

        boolean isEUCountry=false;
        if (isEUCountry) {
            System.out.printf("3.f) ) Yes, Australia is EU country %n");
        }else{
            System.out.printf("3.f) No, Australia is not EU country! %n");
        }
        char countryCurrency= '$';
        System.out.printf("3.g) Currency of " + countryName + " is: %s %n", countryCurrency);
        System.out.printf("------------------------------------ %n");

        //concatenation
        System.out.println("Piemēri ar konkatenāciju:");
        short codeLineCount=1000;
        short defectCount=100;
        System.out.printf("For every " + codeLineCount + " lines of code that software professionals create, there are about " + defectCount + " defects %n", codeLineCount, defectCount);

        int percentageOfRemovedBugs=85;
        System.out.printf("Software companies in the average remove about " + percentageOfRemovedBugs + " percent of all known defects before releasing a product to the customer.  %n", percentageOfRemovedBugs);

        System.out.printf("------------------------------------ %n");

        int a=70;
        double b=25.5;
        System.out.printf("Mainīgais a: %d %n", a);
        System.out.printf("Mainīgais b: %f %n", b);

      // arithmetic operators
      // addition
        System.out.println("5. Aritmētiskā darbība - Summa - trīs piemēri");
      //  System.out.println("Mainīgo a un b summa: %f %n", a+b);

        double c=a+b;
        System.out.printf("Mainīgo a un b summa: %f %n", c);

        // subtraction
        System.out.println("5. Aritmēriskā darbība - Starpība - trīs piemēri");

        double d=a-b;
        System.out.printf("Mainīgo a un b starpība: %f %n", d);
        double d1=c-b;
        System.out.printf("Mainīgo c un b starpība: %f %n", d1);
        double d2=a-c;
        System.out.printf("Mainīgo a un c starpība: %f %n", d2);

        //division
        System.out.println("5. Aritmēriskā darbība - Dalījums - trīs piemēri");

        double e=a/b;
        System.out.printf("Mainīgo a un b dalījums: %f %n", e);
        double e1=b/d;
        System.out.printf("Mainīgo b un d dalījums: %f %n", e1);
        double e2=d/e1;
        System.out.printf("Mainīgo d un e1 dalījums: %f %n", e2);

        //multiplication
        System.out.println("5. Aritmēriskā darbība - Reizinājums - trīs piemēri");
        double f=a*b;
        System.out.printf("Mainīgo a un b reizinājums: %f %n", f);
        double f1=a*d;
        System.out.printf("Mainīgo a un d reizinājums: %f %n", f1);
        double f2=b*d;
        System.out.printf("Mainīgo b un d reizinājums: %f %n", f2);
    }
}
