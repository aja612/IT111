public class MyOperators {

    public static void main(String[] args) {

        // arithmetic operators
        // employee, wage, hours worked, overtime, the whole enchilada

//        int regHours, overtimeHours;
//        double overtimePay, regularPay, total;
//        float wage;
//        double hourlyWithOvertime;
//        regHours = 40;
//        overtimeHours = 5;
//        wage = 25.50F;
//        regularPay = regHours + wage;
//        overtimePay = (wage * 1.5) * overtimeHours;
//        total = overtimePay + regularPay;
//        hourlyWithOvertime = total / (regHours + overtimeHours);
//
//        System.out.println("Regular pay: $" +regularPay+ " dollars");
//        System.out.println("Overtime pay: $" +overtimePay+ " dollars");
//        System.out.println("Total pay: $" +total+ " dollars");
//        System.out.println("Hourly rate with overtime: $" +regularPay+ " dollars");

        // modulus operator
        int number1, number2, number3;
                number1 = 24;
        number2 = 2;
        number3 = number1 % number2;
        System.out.println(number3);
        if(number3 == 0) {
            System.out.println(number1 + " is an even number");
            // do something else
        } else {
            System.out.println(number1 + " is an even number");
        }
//e are now going shopping
//        double tax, priceOfItem, taxOnItem, totalPrice;
//        tax = .10;
//        priceOfItem= 100.00;
//        taxOnItem = priceOfItem + tax;
//        totalPrice = priceOfItem + taxOnItem;
//
//        System.out.println("price of item $" +priceOfItem+ " dollars");
//        System.out.println("tax $" +taxOnItem+ " dollars");
//        System.out.println("price including tax $" +totalPrice+ " dollars");

      //  double priceOfItem = 100;
        // tax is 10 percent

        double priceOfitem = 100;
        priceOfitem *= 1.10;
        System.out.println("total price of item is" +priceOfitem+ " dollards");


        


    }
}
