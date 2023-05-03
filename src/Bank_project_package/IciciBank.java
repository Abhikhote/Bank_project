package Bank_project_package;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IciciBank implements Bank{
    private final ArrayList<Customer> al=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);

    public void acceptDetails(){
        System.out.println("HOW MANY END USER YOU WANT TO INSERT ");
        int num= sc.nextInt();
        for(int i=0;i<num;i++){
            try {
                System.out.println("ENTER ACCOUNT HOLDER NAME ");
                sc.nextLine();
                String accountName= sc.nextLine().toUpperCase();
                System.out.println("ENTER ACCOUNT NUMBER ");
                long accountNumber= sc.nextLong();
                System.out.println("ENTER ACCOUNT BALANCE ");
                double accountBalance = sc.nextDouble();
                if(accountBalance>0 && accountNumber>0) {
                    al.add(new Customer(accountNumber, accountName, accountBalance));
                    System.out.println("ACCOUNT OPEN SUCCESSFULLY :)");
                }else {
                    System.out.println("INVALID INPUT");
                    System.exit(0);
                }
            }catch (InputMismatchException e){
                System.out.println("TRY TO INSERT CORRECT INPUT");
                System.out.println("For executing program again execute the application ");
                System.exit(0);
            }

        }
    }
    @Override
    public void deposite(long accountNumber, double ammount) {
        for (Customer data:al) {
            if (accountNumber == data.getAccountNumber()) {
                    data.setAccountBalance((data.getAccountBalance() + ammount));
                    System.out.println(ammount + " DEPOSITTED SUCCESSFULLY");
            }else {
                System.out.println("INVALID ACCOUNT NUMBER");
            }
        }
    }
    @Override
    public void withdraw(long accountNumber, double ammount) {
        for (Customer data:al){
            if(accountNumber==data.getAccountNumber()){
                if(ammount<=data.getAccountBalance()){
                    data.setAccountBalance((data.getAccountBalance()-ammount));
                    System.out.println(ammount+" WITHDRAW SUCCESSFULLY");
                    break;
                }else{
                  throw  new InvalidAmmountException("INVALID BALANCE");
                }
            }else {
                System.out.println("INVALID ACCOUNT NUMBER");
                break;
            }
        }
    }
    @Override
    public void checkBalance(long accountNumber) {
        boolean status=false;
        for (Customer data:al){
            if(accountNumber== data.getAccountNumber()){
                System.out.println("ACCOUNT BALANCE IS  "+data.getAccountBalance());
                status=true;
                break;
            }
        }
        if(!status){
            System.out.println("INVALID ACCOUNT NUMBER");
        }
    }
}
