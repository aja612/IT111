public class PersonRegular {


    public static void main(String[] args) {

//        to create our variable

        String firstPersonName = "Cathy";
        String secondPersonName = "Kendall";
        char firstPersonGender = 'F';
        char secondPersonGender = 'M';
        int firstPersonAge = 33;
        int secondPersonAge = 22;
        String firstPersonCar = "Volkswagon Bug";
        String secondPersonCar = "Mustang";
        boolean firstPersonViolations = false;
        boolean secondPersonviolations = true;
        int firstPersonCreditScore = 690;
        int secondPersonCreditScore = 670;

        double monthlyRate1 = 0;
        double monthlyRate2 = 0;

        double adjustedRate1 = 0;
        double adjustedRate2 = 0;




//        Logic in the car assurance industry - if you have traffic tickets, DUIs,other
//        violation, you will be paying mor for your insurance also, if you have a
//        poor credit, you will paye more money

        if (firstPersonViolations == true && firstPersonCreditScore <= 700) {
            monthlyRate1 = 500;

        } else {
            monthlyRate1 = 100;

        }


        if (secondPersonviolations == true && secondPersonCreditScore <= 700) {
            monthlyRate2 = 500;

        } else {
            monthlyRate2 = 100;


            if (firstPersonAge <= 25 && firstPersonGender == 'F') {
                adjustedRate1 = 100;

            } else {
                adjustedRate1 = 0;
            }

            if (secondPersonAge <= 25 && secondPersonGender == 'M') {
                adjustedRate2 = 100;

            } else {
                adjustedRate2 = 0;

            }

            double total1 = monthlyRate1 + adjustedRate1;
            double total2 = monthlyRate2 + adjustedRate2;

            System.out.println(" First Person Name: " + firstPersonName);
            System.out.println(" First Person Gender: " + firstPersonGender);
            System.out.println(" First Person Age: " + firstPersonAge);
            System.out.println(" First Person Car: " + firstPersonCar);
            System.out.println(" First Person Violation: " + firstPersonViolations);
            System.out.println(" First Monthly rate: " + monthlyRate1);
            System.out.println(" First Person Credit Score: " + firstPersonCreditScore);
            System.out.println(" First Person Preliminary rate: " + monthlyRate1);
        System.out.println(" First Person Final Monthly rate (including gender and age ): " +total1);
            System.out.println();


            System.out.println(" second Person Name: " + secondPersonName);
            System.out.println(" second Person Gender: " + secondPersonGender);
            System.out.println(" second Person Age: " + secondPersonAge);
            System.out.println(" second Person Car: " + secondPersonCar);
            System.out.println(" second Person Violation: " + secondPersonviolations);
            System.out.println(" second Person Credit Score: " + secondPersonCreditScore);
            System.out.println(" second Monthly rate: " + monthlyRate2);
            System.out.println(" second Person Preliminary rate: " + monthlyRate1);
       System.out.println(" second Person Final Monthly rate (including gender and age ): " +total2);


        }


    }
}
