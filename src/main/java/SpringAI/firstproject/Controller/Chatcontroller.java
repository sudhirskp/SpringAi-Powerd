package SpringAI.firstproject.Controller;


import SpringAI.firstproject.Services.ChatService;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.mistralai.MistralAiChatModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping
public class Chatcontroller {


    //private ChatClient chat;
    private ChatService chatService;
    //private ChatClient mistralchat;
    //private ChatClient deepseekchat;
    //private  GrockService grokService;

//    public Chatcontroller(ChatClient.Builder builder) {
//        this.chat = builder.build();
//    }

    // dependency injection through the constructor for both chat models
    //through the api key
//    public Chatcontroller(MistralAiChatModel mistralchat, DeepSeekChatModel deepseekchat) {
//        this.mistralchat = ChatClient.builder(mistralchat).build();
//        this.deepseekchat = ChatClient.builder(deepseekchat).build();
//    }

    //one from the key mistral and grok from the routerai webclint
//    public Chatcontroller(MistralAiChatModel mistralchat, GrockService grokService) {
//        this.mistralchat = ChatClient.builder(mistralchat).build();
//        this.grokService = grokService;
//    }


    public Chatcontroller(ChatService chatService) {
        this.chatService = chatService;

    }


//    @GetMapping("/grok")
//    public String ask(@RequestParam String q) {
//        return grokService.ask(q);
//    }






//    @GetMapping("/chat")
//    public ResponseEntity<String> callchat(@RequestParam(value = "q", required = true) String query) {
//        var content = mistralchat.prompt(query).call().content();
//        return ResponseEntity.ok(content);
//    }

    @GetMapping("/chat")
    public ResponseEntity<String> callchat(@RequestParam(value = "q", required = true) String query) {
        //var content = mistralchat.prompt(query).call().content();
        return ResponseEntity.ok(chatService.chat(query));
    }
}
