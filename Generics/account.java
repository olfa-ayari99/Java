package Generics;

public class account <T>{
    // le type que je reccupère en paramètre je peux l'injecter ou je souhaite qu'il soit dynamique
    private String owner;
    private double amount;
    private T currency;

    public account (String owner, double amount, T c){
        this.owner=owner;
        this.amount= amount;
        this.currency=c;
    }

    public String getOwner(){
        return owner;
    }
    public double getAmount(){
        return amount;

    }

    public T getCurrency(){
        return currency;
    }

    public void addMoney(int amount){
        this.amount+=amount ;
    }

    public void removeMoney(int amount){
        this.amount-=amount;
    }

    public void showBalance(){
        System.out.println("Vous avez "+ amount+ " "+ currency+"sur votre solde");
    }

    
}
