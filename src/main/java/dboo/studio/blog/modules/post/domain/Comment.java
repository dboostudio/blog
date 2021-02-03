package dboo.studio.blog.modules.post.domain;

import javax.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Post post;
}
