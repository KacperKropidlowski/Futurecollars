package task1;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class WebsiteSaver {
    HttpClient httpClient = HttpClient.newBuilder().build();

    public void saveWebsite(String websiteAddress, String fileName, String savedWebsitePath) throws Exception {
        HttpRequest httpRequest =
                HttpRequest.newBuilder(new URI(websiteAddress))
                        .GET()
                        .build();
        HttpResponse<String> httpResponse = httpClient
                .send(httpRequest, HttpResponse.BodyHandlers.ofString());
        String websiteBody = httpResponse.body();

        File website = new File(savedWebsitePath + fileName);
        try {
            website.createNewFile();
            Files.writeString(Path.of(String.valueOf(website)), websiteBody, StandardOpenOption.WRITE);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
