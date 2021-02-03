package dboo.studio.blog.modules.bbs;

import lombok.Data;

@Data
public class BbsWriteForm {

    private String nickname;

    private String title;
    private String content;

    private String category;

}
