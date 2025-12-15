package SpringAI.firstproject.Services;

import SpringAI.firstproject.entity.info;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ChatServiceImpl implements ChatService {


   private ChatClient chat;


    public ChatServiceImpl(ChatClient.Builder builder) {
       this.chat = builder.build();
    }

    @Override
    public List<info> chat(String pr) {

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


//        return chat
//                .prompt(prompt1)
//                .call()
//                .chatResponse()
//                .getResult()
//                .getOutput()
//                .getText();

//        return chat
//                .prompt(prompt1)
//                .call()
//                .entity(info.class);


        //if you want return list of info then
        List<info> content =  chat
                .prompt(prompt1)
                .call()
               // .entity(ParameterizedTypeReference.forType(List.class)); - it is show according to the query
                .entity(new ParameterizedTypeReference<List<info>>() {
                });

        return content;

    }
}
