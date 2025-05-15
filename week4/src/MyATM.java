public class MyATM {

    public static void main(String[] args) {

        int withdrawal, amount;
        withdrawal = 25;
        amount = 200;
        amount = amount - withdrawal;
        System.out.println("your present amount after the withdrawal is " + amount + "dollars");

        if (amount == 0) {

            System.out.println("you have no money!!!");
        } else {
            System.out.println("your present amount after withdrawal is" + amount + "dollars");
        }
    } // end while loop

        }



