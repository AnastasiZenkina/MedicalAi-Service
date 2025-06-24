package com.ortopunkt.ai;

import com.ortopunkt.ai.dto.AiRequest;
import com.ortopunkt.ai.dto.AiResponse;
import com.ortopunkt.ai.responses.AiResponseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AiServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiServiceApplication.class, args);

        AiResponseService service = new AiResponseService();
        AiRequest request = new AiRequest("flatfoot", true);
        AiResponse response = service.getResponse(request);
        System.out.println(response.getReply());
    }

}
