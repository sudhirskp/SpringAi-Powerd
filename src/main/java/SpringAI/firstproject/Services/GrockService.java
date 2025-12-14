//package SpringAI.firstproject.Services;
//
//import SpringAI.firstproject.DTO.Grokjson;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//import org.springframework.web.reactive.function.client.WebClient;
//
//@Service
//public class GrockService {
//
//    private final WebClient client;
//
//    public GrockService(@Value("${openrouter-api}") String open ) {
//        this.client = WebClient.builder()
//                .baseUrl("https://openrouter.ai/api/v1")
//                .defaultHeader("Authorization", "Bearer " + open)
//                .defaultHeader("Content-Type", "application/json")
//                .build();
//    }
//
//    public String ask(String prompt) {
//        String body = """
//            {
//              "model": "x-ai/grok-4.1-fast:free",
//              "messages": [
//                {"role": "system", "content": "You are a helpful assistant."},
//                {"role": "user", "content": "%s"}
//              ]
//            }
//            """.formatted(prompt);
//
//        Grokjson.CompletionResponse res =  client.post()
//                .uri("/chat/completions")
//                .bodyValue(body)
//                .retrieve()
//                .bodyToMono(Grokjson.CompletionResponse.class)
//                .block();
//        return res.choices[0].message.content;
//    }
//}
