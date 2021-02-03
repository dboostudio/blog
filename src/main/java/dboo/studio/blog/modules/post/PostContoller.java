package dboo.studio.blog.modules.post;

import dboo.studio.blog.modules.post.domain.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/post")
public class PostContoller {

    @Autowired
    PostRepository postRepository;

    @GetMapping("/main")
    public String postMain(Model model) {
        return "post/post-main";
    }
}
