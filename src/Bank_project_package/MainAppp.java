package Bank_project_package;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MainAppp {
    static IciciBank pune=new IciciBank();
    static Scanner sc=new Scanner(System.in);
    long anumber;
    double ammount;
    public void bankOperation(){
        boolean status=true;
        while (status) {
            System.out.println();
          
            System.out.println("  1. DEPOSITE     ");
            System.out.println("  2. WITHDRAW     ");
            System.out.println("  3. CHECK BALANCE");
            System.out.println("  4. EXIT         ");
            
            System.out.println("\nENTER YOUR CHOICE");
            int choice= sc.nextInt();
            switch (choice){
                case 1:
                    try {
                        System.out.println("ENTER ACCOUNT NUMBER ");
                        anumber = sc.nextLong();
                        System.out.println("ENTER AMMOUNT TO DEPOSITE ");
                        ammount = sc.nextDouble();
                        if (ammount > 0)
                            pune.deposite(anumber, ammount);
                        else
                            System.out.println("INVALID AMMOUNT");
                        break;
                    }catch (InputMismatchException e){
                        System.out.println("ENVALID INPUT");
                    }
                case 2:
                    try {
                        System.out.println("ENTER ACCOUNT NUMBER ");
                        anumber = sc.nextLong();
                        System.out.println("ENTER AMMOUNT TO WITHDRAW ");
                        ammount = sc.nextDouble();
                        if (ammount > 0)
                            pune.withdraw(anumber, ammount);
                        else
                            System.out.println("INVALID AMMOUNT");
                        break;
                    }catch (InputMismatchException e){
                        System.out.println("ENVALID INPUT");
                    }
                case 3:
                    try {
                        System.out.println("ENTER ACCOUNT NUMBER ");
                        anumber = sc.nextLong();
                        pune.checkBalance(anumber);
                        break;
                    }catch (InputMismatchException e){
                        System.out.println("INVALID INPUT");
                    }
                case 4:
                    System.out.println("THANK U FOR VISITING.!");
                    status=false;
                    break;
            }
        }
    }
    public static void main(String[] args) {
        pune.acceptDetails();
        MainAppp m1=new MainAppp();
        m1.bankOperation();
    }
}
