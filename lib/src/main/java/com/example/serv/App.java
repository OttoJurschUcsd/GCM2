package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyCc0pFtPeEsjNyTUrRZLB0cbr3UQnG1zUY";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bEMjHAHMyShD_lRWitTlzjfiKIAXposgTSngsGLh6vZh4UyMkz32v1rgIwMcrShoQlQx0FHWfu-fKCd8KtG-E1Xzb_XyUmU07Bq2yCok9qCHKI1Q6jsUvo2IhbsixDqXFzEUAsN");

        c.createData("Working!!", "Test message");

        return c;
    }
}

