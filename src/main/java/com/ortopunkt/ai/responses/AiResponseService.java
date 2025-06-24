package com.ortopunkt.ai.responses;
import com.ortopunkt.ai.dto.AiResponse;
import com.ortopunkt.ai.dto.AiRequest;
import com.ortopunkt.ai.templates.TemplateSelector;
import org.springframework.stereotype.Service;


@Service
public class AiResponseService {
    private final Handler handler;

    public AiResponseService(){
        this.handler = new AbstractHandler(new TemplateSelector());
    }

    public AiResponse getResponse (AiRequest request){
        return handler.handle(request);
    }
}
