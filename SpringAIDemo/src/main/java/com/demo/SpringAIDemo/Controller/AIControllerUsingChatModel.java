package com.demo.SpringAIDemo.Controller;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AIControllerUsingChatModel {
    private OpenAiChatModel chatModel;

    public AIControllerUsingChatModel(OpenAiChatModel chatModel){
        this.chatModel = chatModel;
    }

    @GetMapping("/api/v1/{query}")
    public String getResponse(@PathVariable String query){
        String response = chatModel.call(query);
        return response;
    }


}
