package SpringAI.firstproject.Controller;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping
public class Chatcontroller {


    private ChatClient chat;

    public Chatcontroller(ChatClient.Builder builder) {
        this.chat = builder.build();
    }

    @GetMapping("/chat")
    public ResponseEntity<String> callchat(@RequestParam(value = "q", required = true) String query) {
        var content = chat.prompt(query).call().content();
        return ResponseEntity.ok(content);
    }
}
