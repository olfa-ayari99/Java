package Threads;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class threadExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException{
        ExecutorService service = Executors.newVirtualThreadPerTaskExecutor(); //Executors : une classe utilitaire dans le package java.util.concurrent qui fournit des méthodes pour créer différents types d'ExecutorService
        //newVirtualThreadPerTaskExecutor() : est une méthode statique de la classe Executors. Cette méthode retourne un nouvel ExecutorService qui utilise des threads virtuels pour exécuter des tâches.
        // un thread virtuel: est une abstraction de thread qui est gérée par la machine virtuelle Java (JVM) plutôt que par le système d'exploitation sous-jacent.

        List<Callable<String>> callables = new ArrayList<>();
      final int ADJECTIVES = 4;
      for (int i = 1; i <= ADJECTIVES; i++)
         callables.add(() -> get("https://horstmann.com/random/adjective"));
      callables.add(() -> get("https://horstmann.com/random/noun"));
      List<String> results = new ArrayList<>();
      for (Future<String> f : service.invokeAll(callables))
         results.add(f.get());
      System.out.println(String.join(" ", results));
      service.close();
   }

   private static HttpClient client = HttpClient.newHttpClient();

   public static String get(String url) {
      try {
         var request = HttpRequest.newBuilder().uri(new URI(url)).GET().build();
         return client.send(request, HttpResponse.BodyHandlers.ofString()).body();
      } catch (Exception ex) {
         var rex = new RuntimeException();
         rex.initCause(ex);
         throw rex;
      }
        
    }
    
}
