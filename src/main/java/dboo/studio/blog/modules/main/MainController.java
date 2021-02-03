package dboo.studio.blog.modules.main;

import dboo.studio.blog.modules.bbs.BbsRepository;
import dboo.studio.blog.modules.post.PostRepository;
import dboo.studio.blog.modules.post.domain.Post;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@NoArgsConstructor
public class MainController {

    private PostRepository postRepository;
    private BbsRepository bbsRepository;

    @GetMapping("/")
    public String main(Model model) {
        return "index";
    }

    @GetMapping("/about-me")
    public String aboutMe() {
        return "about-me";
    }

    @GetMapping("/sign-up")
    public String signUp() {
        return "sign-up";
    }

    @GetMapping("/log-in")
    public String login() {
        return "login";
    }
}
