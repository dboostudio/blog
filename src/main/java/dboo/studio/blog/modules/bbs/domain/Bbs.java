package dboo.studio.blog.modules.bbs.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
public class Bbs {

    @Id @GeneratedValue
    private Long id;
    private String writer;

    private String title;

    @Lob
    private String content;

    private String category;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    @OneToMany(mappedBy = "bbs")
    private Set<BbsComment> bbsComments = new HashSet<>();


}
