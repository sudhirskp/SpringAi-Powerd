//package SpringAI.firstproject.config;
//
//import SpringAI.firstproject.Services.GrockService;
//import org.springframework.ai.chat.client.ChatClient;
//import org.springframework.ai.mistralai.MistralAiChatModel;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ChatConfig {
//
////    @Bean
////    public ChatClient.Builder chatClientBuilder(org.springframework.ai.chat.model.ChatModel chatModel) {
////        return ChatClient.builder(chatModel);
////    }
//
//    @Bean("name = mistralChatClient")
//    public ChatClient mistralChatClient(MistralAiChatModel mistralChat) {
//        return ChatClient.builder(mistralChat).build();
//    }
//
//    @Bean("name = grokChatClient")
//    public GrockService grokChatClient(GrockService grokService) {
//        return grokService;
//    }
//}
//
////Mistral AI Starter → ChatModel Bean → ChatConfig → ChatClient.Builder Bean → Chatcontroller