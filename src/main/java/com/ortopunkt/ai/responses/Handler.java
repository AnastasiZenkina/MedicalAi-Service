package com.ortopunkt.ai.responses;
import com.ortopunkt.ai.dto.AiRequest;
import com.ortopunkt.ai.dto.AiResponse;

public interface Handler {
    AiResponse handle(AiRequest request);
}
