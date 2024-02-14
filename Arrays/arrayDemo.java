package Arrays;

public class arrayDemo{

    public static void main(String[] args){
        String[] copyForm = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
            "Marocchino", "Ristretto"
        };

        String[] copyTo = new String[7];
        System.arraycopy(copyForm, 2, copyTo, 0,7);

        //It uses the System.arraycopy() method to copy a subsequence of array components into a second array
        for(String coffee : copyTo){
            System.out.println(coffee+ " ");
        }

    }
}