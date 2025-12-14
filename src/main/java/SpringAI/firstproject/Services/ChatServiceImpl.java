package SpringAI.firstproject.Services;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
public class ChatServiceImpl implements ChatService {


   private ChatClient chat;


    public ChatServiceImpl(ChatClient.Builder builder) {
       this.chat = builder.build();
    }

    @Override
    public String chat(String pr) {

        String prompt = "tell me about youself";

        String content = chat
                .prompt()
                .user(prompt)
                .system("As Genius Boy")
                .call().
                content();
        return content;
    }
}
