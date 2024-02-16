package PatternMatching;

public class instanceOf2 {
     private int x;
     private int y;

     public boolean equals(Object o){
        if(!(o instanceof instanceOf2)){
            return false;
        }
        instanceOf2 ins = (instanceOf2) o;
        return x == ins.x && y == ins.y;
     }
    
     
}
