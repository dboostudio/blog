package dboo.studio.blog;

import dboo.studio.blog.modules.post.PostRepository;
import dboo.studio.blog.modules.post.domain.Post;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
public class TestRunner implements ApplicationRunner {

    @Autowired
    PostRepository postRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        IntStream.range(0,10).forEachOrdered( i -> {
            postRepository.save(doPost(i));
        });
    }

    private Post doPost(Integer i) {
        Post post = new Post();
        post.setTitle("test" + i.toString());
        post.setContent("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        return post;
    }
}
