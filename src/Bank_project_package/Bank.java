package Bank_project_package;

public interface Bank {
     void deposite(long accountNumber,double ammount);
     void withdraw(long accountNumber,double ammount);
     void checkBalance(long accountNumber);
}
