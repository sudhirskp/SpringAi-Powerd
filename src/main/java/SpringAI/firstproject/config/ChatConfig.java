package SpringAI.firstproject.config;

import SpringAI.firstproject.Services.GrockService;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.mistralai.MistralAiChatModel;
import org.springframework.ai.mistralai.MistralAiChatOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatConfig {

//    @Bean
//    public ChatClient.Builder chatClientBuilder(org.springframework.ai.chat.model.ChatModel chatModel) {
//        return ChatClient.builder(chatModel);
//    }

//    @Bean("name = mistralChatClient")
//    public ChatClient mistralChatClient(MistralAiChatModel mistralChat) {
//        return ChatClient.builder(mistralChat).build();
//    }
//
//    @Bean("name = grokChatClient")
//    public GrockService grokChatClient(GrockService grokService) {
//        return grokService;
//    }


    //for anywhere use of this bean in the whole project
//    @Bean
//    public ChatClient chatClient(ChatClient.Builder builder){
//        return builder
//                .defaultOptions(MistralAiChatOptions.builder()
//                        .model("mistral-small-latest")
//                        .maxTokens(100)
//                        .temperature(0.2)
//                        .build()
//                )
//                .build();
//    }
}

//Mistral AI Starter → ChatModel Bean → ChatConfig → ChatClient.Builder Bean → Chatcontroller