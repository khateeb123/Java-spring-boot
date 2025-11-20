package khateeb.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {

    @RequestMapping("/post")
    public String index(){

        return "post.html";
    }

    @RequestMapping("/post/store")
    public String storePost(){

        return "post.html";
    }
}
