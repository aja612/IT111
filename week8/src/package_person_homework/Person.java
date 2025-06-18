package package_person_homework;

public class Person {

    String name;
    int age;
    char gender;

    int carAge;

    boolean violations;

    double creditScore;
    double MonthlyPremiums;


    public void display() {
        System.out.println("Customer name: " + name);
        System.out.println("Age: " + age);
        System.out.println(" Gender: " + gender);
        System.out.println(" Car: " + carAge);
        System.out.println("Violations: " + violations);
        System.out.println("CreditScore: " + creditScore);
        System.out.println("MonthlyPremiums: " + MonthlyPremiums);
    }


    public double getRate(double monthlyRate) {

        if (violations == true && creditScore <= 800) {
            monthlyRate = 400.00;
        } else {
            monthlyRate = 200.00;
        }
        return monthlyRate;
    }

    public double assumeGender(double adjustedRate) {

        if (gender == 'M' && age <= 25) {
            adjustedRate = 200;

        }  else {
            adjustedRate = 0;
        }
        return adjustedRate;
    }
    public double carAge (double MonthlyPremiums) {

        if (carAge >= 2020) {
            MonthlyPremiums = 400;

        } else  {
            MonthlyPremiums = 0;
        }
        return MonthlyPremiums;
    }

}