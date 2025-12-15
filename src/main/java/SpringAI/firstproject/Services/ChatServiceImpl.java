package SpringAI.firstproject.Services;

import SpringAI.firstproject.entity.info;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.mistralai.MistralAiChatOptions;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ChatServiceImpl implements ChatService {


   private ChatClient chat;
    private String PromptUserSpec;


    public ChatServiceImpl(ChatClient.Builder builder) {
       this.chat = builder.build();
    }



    //this bean for the direct select config of model
//    public ChatServiceImpl(ChatClient.Builder builder) {
//        this.chat =   builder
//                .defaultOptions(MistralAiChatOptions.builder()
//                        .model("mistral-small-latest")
//                        .temperature(0.7)
//                        .maxTokens(100)
//                        .build())
//                .build();
//    }

    //if you want to use anywhere
    //then make it in your config package with @Bean annotation in class

//    public ChatServiceImpl(ChatClient chat){
//        this.chat = chat;
//    }



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
//        List<info> content =  chat
//                .prompt(prompt1)
//                .call()
//               // .entity(ParameterizedTypeReference.forType(List.class)); - it is show according to the query
//                .entity(new ParameterizedTypeReference<List<info>>() {
//                });
//
//        return content;


//        Prompt prompt1 = new Prompt(pr);
//        return chat.prompt(prompt1).call()
//                .content();


        Prompt prompt1 = new Prompt(pr);

        //modify prompt according to need for standard prompt
        String prstr = "Always remeber you are a greate coder and always prefer to write code in java untill the user say other : {pr}";
        var res =  chat.prompt()
                .user(user -> user.text(prstr).param("pr", pr))
                .call()
                .content();

        return res;
    }
}
