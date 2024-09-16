import java.util.*;
public class SortByBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCustomers = scanner.nextInt();
        List<Customer> customers = new ArrayList<>();

        for (int i = 0; i < numCustomers; i++) {
              // complete this for loop





        }

       //sort here

        // print out sorted objects
        for (Customer customer : customers) {
            System.out.printf("%s %s %d%n", customer.firstName, customer.lastName, customer.balance);
        }
    }
}