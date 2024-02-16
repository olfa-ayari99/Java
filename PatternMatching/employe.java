package PatternMatching;


public final class employe {

    private final String nom;
    private final String  prenom;

    public employe (String nom,String prenom){
        super();
        this.nom=nom;
        this.prenom=prenom;
    }

    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result= 1;
        result= prime*result +((nom==null)? 0: nom.hashCode());
        result=prime*result+((prenom==null)? 0: prenom.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj)
        return true;
        if (getClass() != obj.getClass())
        return false;
      employe other = (employe) obj;
      if (nom == null) {
        if (other.nom != null)
          return false;
      } else if (!nom.equals(other.nom))
        return false;
      if (prenom == null) {
        if (other.prenom != null)
          return false;
      } else if (!prenom.equals(other.prenom))
        return false;
      return true;        

    }

    @Override
    public String toString(){
        return "Employe [nom=" + nom + "   prenom"+prenom;
    }

    
}

//public record employe(String nom, String prenom) {
}
