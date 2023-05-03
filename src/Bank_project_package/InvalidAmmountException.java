package Bank_project_package;

public class InvalidAmmountException extends RuntimeException{
    InvalidAmmountException(String msg){
        super(msg);
    }
}
