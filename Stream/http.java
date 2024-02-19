package Stream;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class http {

    public static void main(String[] args){
        
        URI uri = URI.create("https://www.gutenberg.org/files/98/98-0.txt");

        HttpClient client = HttpClient.newHttpClient();
        HttpClient request = HttpClient.newBuilder().build();

        HttpResponse<Stream<String>> response = client.send(request, HttpResponse.BodyHandlers.ofLines());

        List<String> lines;
        try(Stream<String> stream = response.body()){
            lines= stream
            .dropWhile(line -> !line.equals("A tale of two cities"))
            .takeWhile(line -> !line.equals("******"))
            .collect(Collectors.toList());


        }

        System.out.println("# lines= "+ lines.size());       

        
    }

    
}
