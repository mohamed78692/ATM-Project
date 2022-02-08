import java.util.HashMap;
import java.util.Scanner;

public class Menu {

    Scanner input= new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<String,String> customer = new HashMap<String,String>();
        customer.put("9876543","9876");
        customer.put("8989898","1890");


        Menu menu = new Menu();
        Boolean custNumberFlag=true;
        String custNumberMessage="Enter Your Customer Number: ";


        Boolean pinFlag =true;
        String pinMessage="Enter the pin: ";

        System.out.println("Welcome to the ATM project!");

        while(custNumberFlag) {



            System.out.println(custNumberMessage);
            String customerNumber = menu.input.next();

            if (customer.containsKey(customerNumber)) {
                custNumberFlag=false;
                while (pinFlag) {
                    System.out.println(pinMessage);
                    String pin = menu.input.next();

                    if (pin.equals(customer.get(customerNumber))) {
                        pinFlag = false;
                        menu.getAccountTYpe();
                    } else {
                        System.out.println(" You have entered the wrong pin");
                        pinMessage = "Enter the pin correctly: ";

                    }
                }


            } else {
                custNumberMessage ="Enter your Customer Number again correctly : ";
                System.out.println("No Account Number present");
            }
        }

        System.out.println();





        // test comments1234



    }

    public void getAccountTYpe(){

        System.out.println("Enter the account type: ");
        System.out.println("1.Savings account");
        System.out.println("2.Checking account");
        System.out.println("3.Exit");
        String choice = this.input.next();
        switch (choice){
            case "1" :
                System.out.println("Savings account");
                break;
            case "2":
                System.out.println("Checking account");
                break;
            case "3":
                System.out.println("Thank you. You are successfully exit the ATM Project");
        }
    }
}
