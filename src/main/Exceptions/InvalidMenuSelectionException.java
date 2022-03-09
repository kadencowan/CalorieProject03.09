package main.Exceptions;

public class InvalidMenuSelectionException extends Exception {
    public InvalidMenuSelectionException (){
        super ("That is not a menu option, please try typing a number 1 -7");
    }
    public InvalidMenuSelectionException (String message){
        super (message);
    }

}
