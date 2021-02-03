package dboo.studio.blog.modules.bbs;

import dboo.studio.blog.modules.bbs.domain.Bbs;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BbsService {

    public Bbs bbsFormToEntity(BbsWriteForm bbsWriteForm) {
        return Bbs.builder()
                .title(bbsWriteForm.getTitle())
                .category(bbsWriteForm.getCategory())
                .writer(bbsWriteForm.getNickname())
                .createdAt(LocalDateTime.now())
                .build();
    }
}
