package com.ortopunkt.ai.controller;
import com.ortopunkt.ai.dto.AiRequest;
import com.ortopunkt.ai.dto.AiResponse;
import com.ortopunkt.ai.responses.AiResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ai")
public class AiController {

    private final AiResponseService service;

    @Autowired
    public AiController(AiResponseService service){
        this.service = service;
    }

    @PostMapping("/response")
    public AiResponse getResponse(@RequestBody AiRequest request){
        return service.getResponse(request);
    }
}
