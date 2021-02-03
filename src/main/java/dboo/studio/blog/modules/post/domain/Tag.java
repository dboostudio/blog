package dboo.studio.blog.modules.post.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Tag {
    @Id
    @GeneratedValue
    private Long id;

//    @ManyToMany(mappedBy = "post")
//    private Set<Post> postSet = new HashSet<>();
}
