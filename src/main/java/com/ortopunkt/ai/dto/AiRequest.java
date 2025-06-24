package com.ortopunkt.ai.dto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AiRequest {
    private String topic;
    private boolean hasPhoto;
}
