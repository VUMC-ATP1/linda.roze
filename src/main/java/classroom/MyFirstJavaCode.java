package classroom;

public class MyFirstJavaCode {
    /* Access Modifiers:
    public, pritvate, protected, default
     */
    public static void main(String[] args) {
        System.out.println("Hello World: My name is Linda");
        System.out.println("First argument is:" + args[0]);
        System.out.println("Second argument is:" + args[1]);

        //string [] args={"Hello, "World};
        //String[] twoWord={"Hello", "World"};

        // primitive data type (numbers)
        byte floorcount=7;
        // concatenation
        System.out.println("My house consist of " + floorcount + " floors!");
        System.out.printf("My house consist of %d floors! \r", floorcount);
        System.out.printf("My house consist of %d floors \r", floorcount);

        // %s = for string (text)
        //%d = for Number

        short juniorTesterSalaryInEur=1000;
        short salariesInIt[]={1000, 2000, 3000};
        short emptySalarieArray[]=new short[4];
        emptySalarieArray[0]=1000;
        emptySalarieArray[1]=2000;
        emptySalarieArray[2]=3000;
        emptySalarieArray[3]=4000;

        System.out.println(juniorTesterSalaryInEur);
        System.out.printf("Avarage salary for Junior QA Engineer is: %d \r", juniorTesterSalaryInEur);

        int chinaPopulation=1449687399;
        System.out.printf("China population %d people \r", chinaPopulation);

        long currentWorldPopulation=794689700;
        System.out.printf("Current World polulation %d \r", currentWorldPopulation);

        float myCurrentWeight=70.6f;
        System.out.println(myCurrentWeight);

        double gasPriceInEur=1.83445d;
        System.out.println(gasPriceInEur);

        /* Logical boolean
        prefix: is, has
        Example: isSummer, isWinter, hasItem, hasApples
        Values: true / false (defoult: false)
         */
        // %b = izvada boolean vērtību
        boolean isSummer=false;
        if (isSummer) {
            System.out.printf("Now it is summer! And boolean value is:");
        }else{
            System.out.printf("No, summer will be the next!");
        }

        //primitive: text
        char firstNameLetter= 'N';
        System.out.println(firstNameLetter);

        // non-primitive String
        String myNameAndSurname="Linda Roze";
        System.out.println(myNameAndSurname);

        // Arithmetic operators
        System.out.println(7+7);
        System.out.println("7+7");
        System.out.println("7"+7);

        int a=10;
        int b=5;
        System.out.println(a+b);
        int c=a+b;
        System.out.println(c);

       // boolean isAGreaterThanB=a>b; //true
       // System.out.println("Is a greater than b: %b", isAGreaterThanB);




    }
}
