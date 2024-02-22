package JavaI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

public class example {
    public static void main(String[] args) throws IOException, InterruptedException{

        //to read it online
        URI sonnetsURI= URI.create("https://www.gutenberg.org/cache/epub/1041/pg1041.txt");
        HttpRequest request = HttpRequest.newBuilder(sonnetsURI).GET().build();
        HttpClient client = HttpClient.newBuilder().build();
        HttpResponse<InputStream> response = client.send(request, HttpResponse.BodyHandlers.ofInputStream());
        InputStream InputStream = response.body();
    }

    //to read is from a file
   // Path path = Path.of("files\sonnets.txt");
    //BufferedReader reader = Files.newBufferedReader(path);
    


    
}
