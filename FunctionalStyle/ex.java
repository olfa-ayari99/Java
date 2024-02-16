package FunctionalStyle;

import java.util.List;

public class ex {
    
    for(int i=0; i <5; i++){
        System.out.println(i);
   }

   IntStream.range(0,5).forEach(i->System.out.println(i));



   //Picking select elements with if

   List<String> names = List.of("Jack", "Paula", "kate", "Peter");

   for(String name: names){

    for(String name: names ){
        if(name.length()==4){
            System.out.println(name);

        }
    }
   }
   //For the functional style, the filter method of Stream becomes a direct replacement of the imperative style if. 
   names.stream().filter(name->name.lenght()==4).forEach(name-> System.out.println(name));

   //Picking Elements to Transform

   for(String n: names){
    if(n.length()==4){
        System.out.println(name.toUpperCase());
    }
   }

   names.stream().filter(n->n.lenght()==4).map(String::toUpperCase).forEach(System.out::println);





    
}
