import customerpackage.Customer;
import mallpackage.Store;
import mallpackage.BookStore;
import mallpackage.ToyStore;
import mallpackage.ShoeStore;
import interfaces.IStoreLogo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {



    public static void main (String []args) {
        //Class Objects
        //Greetings
        System.out.println(greeting());

        //Adding Some Stores to the Mall
        //addStoresToMall();

        //Register Person
        register();
        //Object 1 - BookStore
        BookStore bookStore1 = new BookStore("DJBM123","Amazon",579,"ABCID12365", "Maria", 358 );
        BookStore bookStore2 = new BookStore("DJBM1456","Barn & Nobel",468,"ABCID143565", "Maria", 169 );

        //Object 2 - ShoeStore
        ShoeStore shoeStore1 = new ShoeStore("MARI34565", "Jacab Store", 256, "XYZ234987ADM", "Jacob", 58, true);
        ShoeStore shoeStore2 = new ShoeStore("MAR784565", "Adam Store", 537, "XYZ234267ADM", "Jacob", 67, false);
        ShoeStore shoeStore3 = new ShoeStore("MARI3896565", "DJ Store", 286, "XYZ2348767ADM", "Jacob", 82, true);

        //Object 3 - ToyStore
        ToyStore toyStore1 = new ToyStore("TXMN123467", "Baba Store",345, "NBM45639", "Baba Active+", "Toys", 5789);
        ToyStore toyStore2 = new ToyStore("TXKN123467", "Steve Store",145, "NBM78639", "DJ Active+", "Toys and Books", 5929);
        ToyStore toyStore3 = new ToyStore("TXPN123467", "Bob Store",365, "NBM458749", "Maria Active+", "Toys, + Books, + and Food", 4589);


        System.out.println("Welcome to the Shopping Mall!");
        System.out.println("List of BookStores in Mall");
        System.out.println("You are in the BookStore!");
        System.out.println(bookStore1);
        System.out.println(bookStore2);

        System.out.println(" You are in the ShoeStore!");
        System.out.println(shoeStore1);
        System.out.println(shoeStore2);
        System.out.println(shoeStore3);

        System.out.println("you are in the ToyStore!");
        System.out.println(toyStore1);
        System.out.println(toyStore2);
        System.out.println(toyStore3);



        //Viewing Stores
        while (true) {
            switch ( pickStore()){
                case 1:
                    System.out.println("You are in the BookStore!");
                    System.out.println(bookStore1);
                    System.out.println(bookStore2);
                    break;
                case 2:
                    System.out.println(" You are in the ShoeStore!");
                    System.out.println(shoeStore1);
                    System.out.println(shoeStore2);
                    System.out.println(shoeStore3);
                    break;
                case 3:
                    System.out.println("you are in the ToyStore!");
                    System.out.println(toyStore1);
                    System.out.println(toyStore2);
                    System.out.println(toyStore3);
                    break;
                case 4:
                    System.out.println("Thank you  visiting the our Mall!!");
                    System.exit(0);
                default:
                    System.out.println("Please pick either (1 - 4)");
            }
        }
    }




    //Methods

    public static String greeting() {
        return "You are in a great place to Shop!! This is Discount season";
    }



  //  public static void addStoresToMall() {
  //      ArrayList<Store> store1= new ArrayList<>();

     //   store1.add();
       // store1.add(ShoeStore);
       // store1.add(ToyStore);

        //System.out.println(store1);
        //Store.setstore(store1);
   // }
    public static void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets get you registered!");
        System.out.println("Please enter your first name: ");
        String firstName = scanner.next();
        System.out.println("Please enter your last name: ");
        String lastName = scanner.next();
        System.out.println("Please enter your password: ");
        String password = String.valueOf(scanner.nextInt());
        Customer c1 = new Customer(firstName, lastName, password);
       // Store.setVisitor(c1);

    }
    public static int pickStore() {
        Scanner input = new Scanner(System.in);
        System.out.println("""
              Please pick an store to view from the list below:
              1. BookStore
              2. ShoeStore
              3. ToyStore
              4. Exit
              """);
        return input.nextInt();
    }

}
