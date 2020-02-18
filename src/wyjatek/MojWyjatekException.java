package wyjatek;

public class MojWyjatekException extends Exception {

    public MojWyjatekException(){}

    public MojWyjatekException(String message){
        super(message);
    }

    public MojWyjatekException(String message, Throwable cause){
        super(message, cause);
    }

}
