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
            System.out.println("Please enter a valid day, or check your spelling");
            specials = input.next();

        }


        switch (specials) {

//            my cases will be the day of the week
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a" + coffee + " and the price will be $ " + price);
                System.out.println();

            }
            case "Tuesday" -> {
                coffee = "Frapp";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $ " + price);
                System.out.println();


            }
            case "Wednesday" -> {
                coffee = "Cappucino";
                price = 4.35;
                System.out.println(specials + "'s coffee of the day is a" + coffee + " and the price will be $ " + price);
                System.out.println();
            }

            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s coffee of the day is a" + coffee + " and the price will be $ " + price);
                System.out.println();
            }
            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a" + coffee + " and the price will be $ " + price);
                System.out.println();
            }

            }
            System.out.println("How many " + coffee + "s would you like to order?");
            quantity = input.nextInt();


            if (quantity == 0) {
                System.out.println("Looks like you don't like " + coffee + "! So sad!!!");

            } else if (quantity == 1) {
                System.out.println("Looks like you order 1 " + coffee + "today!!!");
            } else {

                System.out.printf("quantity " + coffee + " have been ordered, total $");
                System.out.printf("%.2f", quantity * price);
                System.out.println();


//            default -> throw new IllegalStateException("Unexpected value: " + specials);

        }
    }
}
