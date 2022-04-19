import customerpackage.Customer;
import mallpackage.Store;
import mallpackage.BookStore;
import mallpackage.ToyStore;
import mallpackage.ShoeStore;
import interfaces.IStoreLogo;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    private static final Path filePath = Paths.get("C:\\FannieProjects\\vinci-mall-project\\mall-project\\shoes.txt");

    public static void main(String[] args) throws IOException {



        //Greetings
        System.out.println(greeting());



        //Register Person
        signedIn();

        //CRUD Implementation here..
        
        //Update
//        System.out.println("\nCalling the update file method.");
//        writeAFile();

        //Read
        System.out.println("Read password.\n");
        readAFile();


        //Delete
        //System.out.println("\nCalling the delete  file method.");
        //deleteAFile();

        //Class Objects
        //Object 1 - BookStore
        BookStore bookStore1 = new BookStore("DJBM123", "Amazon", 579, "ABCID12365", "Maria", 358);
        BookStore bookStore2 = new BookStore("DJBM1456", "Barn & Nobel", 468, "ABCID143565", "Maria", 169);
        bookStore1.totalEmpNumber();

        //Object 2 - ShoeStore
        ShoeStore shoeStore1 = new ShoeStore("MARI34565", "Jacab Store", 256, "XYZ234987ADM", "Jacob", 58, true);
        ShoeStore shoeStore2 = new ShoeStore("MAR784565", "Adam Store", 537, "XYZ234267ADM", "Jacob", 67, false);
        ShoeStore shoeStore3 = new ShoeStore("MARI3896565", "DJ Store", 286, "XYZ2348767ADM", "Jacob", 82, true);

        //Object 3 - ToyStore
        ToyStore toyStore1 = new ToyStore("TXMN123467", "Baba Store", 345, "NBM45639", "Baba Active+", "Toys", 5789);
        ToyStore toyStore2 = new ToyStore("TXKN123467", "Steve Store", 145, "NBM78639", "DJ Active+", "Toys and Books", 5929);
        ToyStore toyStore3 = new ToyStore("TXPN123467", "Bob Store", 365, "NBM458749", "Maria Active+", "Toys, + Books, + and Food", 4589);

        Customer customer1 = new Customer("Mike", "Davidson", "123");
        Customer customer2 = new Customer("Dina", "Mani", "345");
        Customer customer3 = new Customer("Amel", "Bara", "5678");

        System.out.println("Welcome to Vinci Shopping Mall!\n");
        System.out.println("List of Stores in Vinci Mall\n");
        System.out.println("You are in the BookStore!\n");
        System.out.println(bookStore1);
        System.out.println(bookStore2);

        System.out.println(" \nYou are in the ShoeStore!\n");
        System.out.println(shoeStore1);
        System.out.println(shoeStore2);
        System.out.println(shoeStore3);

        System.out.println(" \nyou are in the ToyStore!\n");
        System.out.println(toyStore1);
        System.out.println(toyStore2);
        System.out.println(toyStore3);


        //Viewing Stores
        while (true) {
            switch (pickStore()) {
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
                    //Customer purchase list using List
                    System.out.println("Maria Purchased Items below");
                    ArrayList<String> mariaPurchasedItems = new ArrayList<String>();
                    mariaPurchasedItems.add("DJ Shoe");
                    mariaPurchasedItems.add("Whale Toy");
                    mariaPurchasedItems.add("Snail Story Book ");
                    mariaPurchasedItems.add("Algeria cultural history book ");
                    System.out.println(mariaPurchasedItems);
                    break;
                case 5:
                    //Customer purchase list using Set
                    System.out.println("Adam purchased items for the season ");
                    HashSet<String>  adamPurchasedItems= new HashSet<String>();
                    adamPurchasedItems.add("RB Shoes");
                    adamPurchasedItems.add("PJ Books");
                    adamPurchasedItems.add("KB Books");
                    adamPurchasedItems.add("PJ Books");
                    adamPurchasedItems.add("Killer Whale Toy");
                    adamPurchasedItems.add("Flip Flops");
                    adamPurchasedItems.add("Killer Whale Toy");
                    adamPurchasedItems.add("K Book");
                    adamPurchasedItems.add("NIKE Shoes");
                    adamPurchasedItems.add("Lion Toy");
                    adamPurchasedItems.add("MonkeyToy");
                    adamPurchasedItems.add("Truck Toy");
                    adamPurchasedItems.add("KMZ Book");
                    adamPurchasedItems.add("Chess Toy");
                    adamPurchasedItems.add("Train Toy");
                    adamPurchasedItems.add("Bob the Builder");
                    adamPurchasedItems.add("PJ Books");
                    adamPurchasedItems.add("Killer Whale Toy");
                    System.out.println(adamPurchasedItems);
                    break;
                case 6:
                    //Customer purchase list using Map (Key and Value)
                    System.out.println("Available Inventory Items in Stores");
                    HashMap<String, Integer> inventory = new HashMap<String, Integer>();


                    inventory.put("NIKE Shoe", 567);
                    inventory.put("Class Shoe", 6577);
                    inventory.put("Fila Shoe", 434);
                    inventory.put("Puma Shoe", 677);
                    inventory.put("Cat Shoe", 556);
                    inventory.put("Jungle Shoe", 567);
                    inventory.put("Summer Shoe", 587);
                    inventory.put("Phil Books", 907);
                    inventory.put("Fiction Books", 667);
                    inventory.put("Cooking Books", 569);
                    inventory.put("Handy Repair Books", 898);
                    inventory.put("Academic Books", 247);
                    inventory.put("Math Books", 673);
                    inventory.put("Epistemology Books", 784);
                    inventory.put("Dictionaries", 674);
                    inventory.put("Yoga Books", 821);
                    inventory.put("Fitness Books", 645);
                    inventory.put("Kids Books", 527);
                    inventory.put("Self Play Toys", 257);
                    inventory.put("Game Console Toys", 837);
                    inventory.put("Transportation Toys", 987);
                    inventory.put("Cloth Covered Toys", 5466);
                    inventory.put("TeddyBare", 784);
                    inventory.put("Trucks", 9127);
                    inventory.put("Planes", 6787);
                    inventory.put("Play Kitchen", 239);

                    System.out.println(inventory);
                    break;
                case 7:
                    System.out.println(" List of customers visited the mall");
                    System.out.println(customer1);
                    System.out.println(customer2);
                    System.out.println(customer3);
                case 8:
                    System.out.println("Thank you for visiting Vinci Mall!!");
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



    public static void signedIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets get you signed in!");
        System.out.println("Please enter your first name: ");
        String firstName = scanner.next();
        System.out.println("Please enter your last name: ");
        String lastName = scanner.next();
        System.out.println("Please enter your password: \n");
        String password = String.valueOf(scanner.nextInt());
        Customer c1 = new Customer(firstName, lastName, password);
        // Store.setVisitor(c1);

    }

    public static int pickStore() {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                \nPlease pick a store to view from the list below:\n
                1. BookStore
                2. ShoeStore
                3. ToyStore
                4. Maria Purchased Items below
                5. Adam purchased items for the season
                6. Available Inventory Items in Stores
                7. Customers visited the mall
                8. Exit
                """);
        return input.nextInt();
    }




    //Read
    public static void readAFile() {
        String temp;
        try {
            temp = Files.readString(filePath);
            System.out.println(temp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    }

