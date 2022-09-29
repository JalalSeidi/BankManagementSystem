import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 'Name' and 'CustomerId' to access your Bank account:");
        String name=sc.nextLine();
        String customerId=sc.nextLine();
        BankAccount obj1=new BankAccount(name,customerId);
    }
}

class BankAccount {
    double bal;
    double prevTrans;
    String customerName;
    String customerId;

    BankAccount(String customerName,String customerId) {
        this.customerName=customerName;
        this.customerId=customerId;
    }

}
