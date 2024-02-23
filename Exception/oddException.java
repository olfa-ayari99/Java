package Exception;

public class oddException {

    public static void main(String[] args){
        int i   =18;
        tryNumber(i);
        i = 7;
        tryNumber(i);
    }




        public static void tryNumber (int i){
            try{
                checkEvenNumber(i);
                System.out.println(i+" is even .");

            }catch(IllegalArgumentException e){
                System.out.println("Error: "+e.getMessage());
            } 
    }
        public static  void checkEvenNumber(int n){
            if(!(n %2 ==0)){
                throw new IllegalArgumentException(n + " is odd.");
            }
        }
    
}
