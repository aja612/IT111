package package_person_homework;


public class PersonDetails  {

//    this file will have a main method


    public static void main(String[] args) {

        Person firstPerson;
        Person secondPerson;

//        in the process of creating an object from my person class

        firstPerson = new Person();
        secondPerson = new Person();


//        we will be entering the info, assigning values to our fields

        firstPerson.name = "Cathy";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.carAge = 2020;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall";
        secondPerson.gender = 'M';
        secondPerson.age = 25;
        secondPerson.carAge = 2010;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;


        double monthlyRate = 0;
        double adjustedRate = 0;
        double MonthlyPremiums = 0;

        firstPerson.display();
        System.out.println("Preliminary Rate for " + firstPerson.name + ": " + firstPerson.getRate(monthlyRate) + "dollars");
        System.out.println("Ajustments: " + firstPerson.assumeGender(adjustedRate) + "dollars");
        System.out.println("MonthlyPremiums " + firstPerson.name + ": " + firstPerson.getRate(MonthlyPremiums) + "dollars");
        System.out.print("Here is " + firstPerson.name + " 's total Monthly premium: ");
        System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate) + firstPerson.carAge(MonthlyPremiums));
        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for " + secondPerson.name + ": " + secondPerson.getRate(monthlyRate) + "dollars");
        System.out.println("Ajustments: " + secondPerson.assumeGender(adjustedRate) + "dollars");
        System.out.println("MonthlyPremiums " + secondPerson.name + ": " + secondPerson.getRate(MonthlyPremiums) + "dollars");
        System.out.print("Here is " + secondPerson.name + " 's total Monthly premium: ");
        System.out.println(secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate) + secondPerson.carAge(MonthlyPremiums));
        System.out.println();


    }
}