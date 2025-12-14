package SpringAI.firstproject.Services;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;


@Service
public class ChatServiceImpl implements ChatService {


   private ChatClient chat;


    public ChatServiceImpl(ChatClient.Builder builder) {
       this.chat = builder.build();
    }

    @Override
    public String chat(String pr) {

        String prompt = "tell me about yourself";

//        String content = chat
//                .prompt()
//                .user(prompt)
//                .system("As Genius Boy")
//                .call().
//                content();
//        return content;



        Prompt prompt1 = new Prompt(pr);
//       return  chat.prompt(prompt1)
//                .call()
//                .content();



        //metadata print
//        var metadata = chat
//                .prompt(prompt1)
//                .call()
//                .chatResponse()
//                        .getMetadata();
//
//        System.out.println(metadata);
//        return metadata.toString();


        return chat
                .prompt(prompt1)
                .call()
                .chatResponse()
                .getResult()
                .getOutput()
                .getText();


    }
}
