package dboo.studio.blog.modules.post;

import dboo.studio.blog.modules.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface PostRepository extends JpaRepository<Post, Long> {


}
