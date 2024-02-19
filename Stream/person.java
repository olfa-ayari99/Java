package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class person {
    
    public static void main(String[] args){

    List<personne> people = new ArrayList<>();

    people.add(new personne("olfa",130));
    people.add(new personne("o",150));
    people.add(new personne("mm",110));
    people.add(new personne("lll",12));

    //List<personne> hunderdClub = new ArrayList<>();

    /**for(personne p : people){
        if(p.billions >=100){
            hunderdClub.add(p);

        }
    }*/

    List<personne> hunderdClub =  people.stream().filter(personne -> personne.billions >=100).collect(Collectors.toList());

    List<personne> sortedList = people.stream().sorted(Comparator.comparing(personne-> personne.name)).collect(Collectors.toList());
    sortedList.forEach(personne->System.out.println(personne.name));


    hunderdClub.forEach(personne -> System.out.println(personne.name));



    }
    
}
