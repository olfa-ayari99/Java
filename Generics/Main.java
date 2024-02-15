package Generics;

public class Main {

    public static void main(String[] args){
         
        account<Character> myAccount = new account<>("olfa", 100, '$');
         myAccount.showBalance();

         account <String> otherAccount = new account<String>("ll",20,"euro");
         otherAccount.showBalance();


         bank b = new bank ("atb");
         b.transfert(myAccount, otherAccount,25);

         myAccount.showBalance();
         otherAccount.showBalance();
    }
    

}
