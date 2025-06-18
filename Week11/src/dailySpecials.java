
import java.util.Scanner;

public class dailySpecials {

    public static void main(String[] args) {

        String specials;
        int quantity;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter a day of the week excluding weekends (Monday - friday only!");

        specials = input.next();


//        in the world of coffee, I need a name of a coffee beverage and a price

        String coffee = null;
        double price = 0;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if (saturday || sunday) {
            System.out.println("please enter a weekday, not weekend!");

            specials = input.next();

        }


        switch (specials) {

//            my cases will be the day of the week
            case "Monday" -> {
                coffee = " Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $ " + price);
                System.out.println();

            }
            case "Tuesday" -> {
                coffee = " Frapp";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $ " + price);
                System.out.println();


            }
            case "Wednesday" -> {
                coffee = " Cappucino ";
                price = 4.35;
                System.out.println(specials + "'s coffee of the day is a" + coffee + " and the price will be $ " + price);
                System.out.println();
            }

            case "Thursday" -> {
                coffee = " Regular Joe";
                price = 2.95;
                System.out.println( specials + "'s coffee of the day is a" + coffee + " and the price will be $ " + price);
                System.out.println();
            }
            case "Friday" -> {
                coffee = " Green Tea Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a" + coffee + " and the price will be $ " + price);
                System.out.println();
            }

        }
        System.out.println("How many " + coffee + "s would you like to order?");
        quantity = input.nextInt();


        if (quantity == 0) {
            System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");

        } else if (quantity == 1 && quantity <= 4) {
            System.out.println("Looks like you ordered 1 " + coffee + " s! today!!!");



        } else if  (quantity >= 5 && quantity <10) {
            System.out.println("Look like you qualify for a group discount! your regular price is $ " + price);
            System.out.printf(quantity  + coffee + " have been ordered but you will be only charged $ ");
            System.out.printf("%.2f", ((quantity * price) - ((quantity * price) *.1)));
                System.out.println();

            } else if (quantity >= 10) {
            System.out.println("A bigger group discount!!  your regular price is $" + price);
            System.out.printf(quantity  + coffee + " have been ordered but you will be only charged $ ");
                System.out.printf("%.2f", ((quantity * price) - ((quantity * price) *.2)));

            } else {

                System.out.printf(quantity  + coffee + " have been ordered, total $");
                System.out.printf("%.2f", quantity * price);
                System.out.println();


            }
        }
    }
