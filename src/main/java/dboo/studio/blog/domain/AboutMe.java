package dboo.studio.blog.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter @EqualsAndHashCode(of="id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class AboutMe {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private Integer age;
    private String location;
    private String email;
    private String phoneNumber;

}
