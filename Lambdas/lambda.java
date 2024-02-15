package Lambdas;

public class lambda {

    public static void main (String[] args){

        Cat myCat = new Cat();

        printable lambdPrintable= ()-> System.out.println("mycat");
        printThing(lambdPrintable);
    }
    
    static void printThing(printable thing){
        thing.print();
    }
    
}
