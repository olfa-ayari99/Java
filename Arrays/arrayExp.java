package Arrays;

public class arrayExp {
    public static void main(String[] args){
        String[] copyForm = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
            "Marocchino", "Ristretto"
        };

        String[] copyTo =java.util.Arrays.copyOfRange(copyForm,2,9);
        //using the java.util.Arrays method does not require you to create the destination array before calling the method
        for(String coffee : copyTo){
            System.out.println(coffee + "");
                }

                System.out.println(java.util.Arrays.toString(copyTo));
    }
    
    
}
