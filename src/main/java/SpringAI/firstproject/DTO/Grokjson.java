//package SpringAI.firstproject.DTO;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//public class Grokjson {
//
//    @JsonIgnoreProperties(ignoreUnknown = true)
//    public static class CompletionResponse {
//        public Choice[] choices;
//    }
//
//    @JsonIgnoreProperties(ignoreUnknown = true)
//    public static class Choice {
//        public Message message;
//    }
//
//    @JsonIgnoreProperties(ignoreUnknown = true)
//    public static class Message {
//        public String role;
//        public String content;
//    }
//}
//
//// here I am creating the dto to map the response from the openrouter api