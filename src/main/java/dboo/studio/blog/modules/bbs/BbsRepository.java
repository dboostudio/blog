package dboo.studio.blog.modules.bbs;

import dboo.studio.blog.modules.bbs.domain.Bbs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BbsRepository extends JpaRepository<Bbs, Long> {

}
