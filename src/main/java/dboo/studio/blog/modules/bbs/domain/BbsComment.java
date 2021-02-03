package dboo.studio.blog.modules.bbs.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BbsComment {

    @Id
    @GeneratedValue
    private Long id;

    private String nickname;
    private String password;

    @ManyToOne
    private Bbs bbs;
}
