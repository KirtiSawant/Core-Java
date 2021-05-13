
public class ExceptionAtm {
    public static void main(String[] args) {
        int balance=3000;
        int withdrawAmt=4000;
        try{
            if(balance<withdrawAmt)
                throw new ArithmeticException("Insufficent balance");
            balance=balance-withdrawAmt;
            System.out.println("Successfully");
        }
        catch (ArithmeticException e){
            System.out.println("Exception:"+e.getMessage());
        }
    }
}
