package dboo.studio.blog.modules.post;

import dboo.studio.blog.modules.post.domain.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @Test
    public void crud() {
        Post post = new Post();
        post.setTitle("title");
        post.setContent("a;ldkfj;lakdjf;ladj");
        postRepository.save(post);

        assertEquals(postRepository.findAll().stream().count(), 1);
        //assertEquals(postRepository.findFirstByDeleteAtIsNullOrderByCreatedAtDesc().stream().count(), 1);

    }
}