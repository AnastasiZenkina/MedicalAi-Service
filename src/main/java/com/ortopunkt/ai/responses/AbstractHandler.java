package com.ortopunkt.ai.responses;
import com.ortopunkt.ai.dto.AiRequest;
import com.ortopunkt.ai.dto.AiResponse;
import com.ortopunkt.ai.templates.TemplateSelector;

public class AbstractHandler implements Handler{
    private final TemplateSelector selector;

    public AbstractHandler(TemplateSelector selector){
       this.selector = selector;
    }

    @Override
    public AiResponse handle(AiRequest request){
        String reply = selector.getReply(request.getTopic(), request.hasPhoto());
        return new AiResponse(reply);
    }
}
