package dboo.studio.blog.post.domain;

import dboo.studio.blog.post.enums.ChildCategory;
import dboo.studio.blog.post.enums.ParentCategory;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Post {

    @Id @GeneratedValue
    private Long id;

    private String title;

    @Lob
    private String content;

    @OneToMany(mappedBy = "post", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    private Set<Comment> commentSet = new HashSet<>();

//    @ManyToMany
//    private Set<Tag> tags = new HashSet<>();

    private ParentCategory parentCategory;
    private ChildCategory childCategory;

    private LocalDateTime registAt;
    private LocalDateTime updateAt;
    private LocalDateTime removeAt;

}
