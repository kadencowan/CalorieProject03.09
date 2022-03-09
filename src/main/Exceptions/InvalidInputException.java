package main.Exceptions;

public class InvalidInputException extends Exception {
    public InvalidInputException (){
        super ("Invalid input, please try again with the right input");
    }
    public InvalidInputException (String message){
        super (message);
    }

}
