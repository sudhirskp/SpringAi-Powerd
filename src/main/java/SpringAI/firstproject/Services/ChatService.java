package SpringAI.firstproject.Services;


import SpringAI.firstproject.entity.info;

import java.util.List;

public interface ChatService {

    // String chat(String prompt);
    //info chat(String prompt);
    List<info> chat(String prompt);
}
