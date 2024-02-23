package Exception;

public class exceptionExp {
    public static void main(String[] args){
        try{
            int result= divideNumbers(5,0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }

       
    public static int divideNumbers(int divided, int divosor){
        if(divosor==0){
            throw new ArithmeticException("cannot divide the given number by zero! ");
        }
        return divided / divosor;

    }
}
