package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class clientStream {

    public static void main(String[] args){
        List<client> clients = Arrays.asList(
            new client("olfa", "prenom", 24),
            new client("Dl", "aa",11),
            new client("David", "mm", 15)
        );


        List<client> Dname = clients.stream().filter(client->client.getName().startsWith("D")).collect(Collectors.toList());
        Dname.forEach(client -> System.out.println(client));
        



    }
    
}
