package Generics;

public class bank {

    private String name;
    
    public bank(String name){
        this.name=name;
    }

    public String getName(){
        return name;

    }

    public <T, S> S transfert(account<T> sourceAccount , account<S> targetAccount, int amount ){
        if(sourceAccount.getAmount() >= amount){
            sourceAccount.removeMoney(amount);
            targetAccount.addMoney(amount);
            System.out.println(sourceAccount.getOwner()+ " a envoyé "+ amount + " " + sourceAccount.getCurrency()+ "à" + targetAccount.getOwner());
        }
        else{
            System.out.println("transaction impossible "+ sourceAccount.getOwner()+" ");
        }

        return targetAccount.getCurrency();
    }
    
}
