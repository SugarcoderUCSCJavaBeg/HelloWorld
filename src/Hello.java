
public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World\n" +
                "and Java Class!");
        /*

        System.out.println("***       ***    ********      ***        ***           ***\n" +
                            "***       ***    ***           ***        ***        ***   ***\n" +
                            "***       ***    ***           ***        ***        ***   ***\n" +
                            "*************    ********      ***        ***        ***   ***\n" +
                            "***       ***    ***           ***        ***        ***   ***\n" +
                            "***       ***    ***           ***        ***        ***   ***\n" +
                            "***       ***    ********      ********   ********      ***\n");

        */


        final int hSize = 30;
        final int vSize = 30;


        int count = 0;

        while (count++ < hSize)
            System.out.print("-");
        System.out.printf("\n");


        int count2 = 0;
        while (count2++ < hSize - 2) {
            System.out.println("|");

            count = 0;
            while (count++ < vSize - 2)
                System.out.print(" ");
            System.out.println("|");

        }


        count = 0;

        while (count++ < hSize)
            System.out.print("-");
        System.out.printf("\n");


    }


}
