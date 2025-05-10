public class litersGallonsConverter {

    public static void main(String[] args) {

        double gallons;
        double liters;


        int counter = 0;

        for (gallons = 1; gallons <= 100; gallons = gallons + 4) {
            liters = (gallons * 3.79);


            if (gallons == 5) {
                System.out.println(liters+ "liters = " + gallons + "Gallon");
            } else {
                System.out.println(liters+ "liters = " + gallons + "Gallon");
                if (counter == 5) {
                    System.out.println();
                    counter = 0;
                    System.out.println("We are done!!!");

//                } end for loop


                }

            }
        }
    }

}
