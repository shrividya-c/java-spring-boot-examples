package com.demo.SpringAIDemo.Controller;

import org.springframework.ai.chat.client.ChatClient;

import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.InMemoryChatMemory;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AIController {
    private ChatClient chatClient;

//    public AIController(OpenAiChatModel chatModel){
//        chatClient = ChatClient.create(chatModel);
//    }

    public AIController(ChatClient.Builder builder){
        chatClient = builder
                        .defaultAdvisors(new MessageChatMemoryAdvisor(new InMemoryChatMemory()))
                        .build();
    }

    @GetMapping("/api/{query}")
    public ResponseEntity<String> getResponse(@PathVariable String query){
//        String response = chatClient
//                            .prompt(query)
//                            .call()
//                            .content();

//        using ChatResponse
        ChatResponse chatResponse = chatClient
                                    .prompt(query)
                                    .call()
                                    .chatResponse();

        String response;

        if(chatResponse==null){
            response="No response received from the AI model.";
            System.out.println("No response received from the AI model.");
        }

        else{
            String aiModel = chatResponse.getMetadata().getModel();
            System.out.println("AI model is: " + aiModel);

            response = chatResponse
                                .getResult()
                                .getOutput()
                                .getText();
        }

        return ResponseEntity.ok(response);
    }
}
